package ru.netology.domain;

public class Radio {

    private int numberListened;
    private int soundVolume;

    void setNumberListened(int numberListened) {
        if (numberListened < 0) {
            return;
        }
        if (numberListened > 9) {
            return;
        }
        this.numberListened = numberListened;
    }

    public int getNumberListened() {
        return numberListened;
    }

    public void next() {
        if (numberListened == 9) {
            numberListened = 0;
        } else {
            numberListened = numberListened + 1;
        }
        setNumberListened(numberListened);
    }

    public void prev() {
        if (numberListened == 0) {
            numberListened = 9;
        } else {
            numberListened = numberListened - 1;
        }
        setNumberListened(numberListened);
    }

    void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 10) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void increaseVolume() {
        if (soundVolume == 10) {
            soundVolume = 0;
        } else {
            soundVolume = soundVolume + 1;
        }
        setNumberListened(soundVolume);
    }

    public void reduceVolume() {
        if (soundVolume == 0) {
            soundVolume = 10;
        } else {
            soundVolume = soundVolume - 1;
        }
        setNumberListened(soundVolume);
    }
}

