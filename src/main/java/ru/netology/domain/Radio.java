package ru.netology.domain;

public class Radio {

    private int countStation = 10;
    private int minNumberListened;
    private int maxNumberListened = countStation - 1;
    private int numberListened;


    public Radio() {

    }

    public Radio(int countStation, int minNumberListened, int maxNumberListened) {
        this.countStation = countStation;
        this.maxNumberListened = countStation - 1;
        this.minNumberListened = minNumberListened;

    }

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

    public int getNumberListened() {
        return numberListened;
    }

    public int getMinNumberListened() {
        return minNumberListened;
    }

    public int getMaxNumberListened() {
        return maxNumberListened;
    }

    public int getCountStation() {
        return countStation;
    }

    private int minSoundVolume;
    private int maxSoundVolume = 100;
    private int soundVolume;

    public Radio(int minSoundVolume, int maxSoundVolume) {
        this.minSoundVolume = minSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
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

    public int getSoundVolume() {
        return soundVolume;
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

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }
}

