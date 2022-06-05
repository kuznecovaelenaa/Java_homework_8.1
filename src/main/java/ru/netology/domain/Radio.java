package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int countStation = 10;
    private int minNumberListened;
    private int maxNumberListened = countStation - 1;
    private int numberListened;
    private int minSoundVolume;
    private int maxSoundVolume = 100;
    private int soundVolume;


    void setNumberListened(int numberListened) {
        if (numberListened < minNumberListened) {
            return;
        }
        if (numberListened > maxNumberListened) {
            return;
        }
        this.numberListened = numberListened;
    }

    public void next() {
        if (numberListened == maxNumberListened) {
            numberListened = 0;
        } else {
            numberListened = numberListened + 1;
        }
        setNumberListened(numberListened);
    }

    public void prev() {
        if (numberListened == minNumberListened) {
            numberListened = 9;
        } else {
            numberListened = numberListened - 1;
        }
        setNumberListened(numberListened);
    }

    void setSoundVolume(int soundVolume) {
        if (soundVolume < minSoundVolume) {
            return;
        }
        if (soundVolume > maxSoundVolume) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseVolume() {
        if (soundVolume == maxSoundVolume) {
            soundVolume = maxSoundVolume;
        } else {
            soundVolume = soundVolume + 1;
        }
        setSoundVolume(soundVolume);
    }

    public void reduceVolume() {
        if (soundVolume == minSoundVolume) {
            soundVolume = minSoundVolume;
        } else {
            soundVolume = soundVolume - 1;
        }
        setSoundVolume(soundVolume);
    }
}

