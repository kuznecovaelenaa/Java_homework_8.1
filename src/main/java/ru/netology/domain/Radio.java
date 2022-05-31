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
        if (numberListened < 9) {
            numberListened = numberListened + 1;
        } else if (numberListened == 9) {
            numberListened = 0;
        }
        setNumberListened(numberListened);
    }

    public void prev() {
        if (numberListened <= 9 && numberListened > 0) {
            numberListened = numberListened - 1;
        } else if (numberListened == 0) {
            numberListened = 9;
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
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        } else if (soundVolume == 10) {
            soundVolume = 0;
        }
        setNumberListened(soundVolume);
    }

    public void reduceVolume() {
        if (soundVolume <= 10 && soundVolume > 0) {
            soundVolume = soundVolume - 1;
        } else if (soundVolume == 0) {
            soundVolume = 10;
        }
        setNumberListened(soundVolume);
    }
}

