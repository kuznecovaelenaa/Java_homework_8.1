package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();


    @Test
    public void shouldMinMaxNumberListenedAndCountStation() {

        Radio radio = new Radio(10, 0, 9);
        assertEquals(10, radio.getCountStation());
        assertEquals(0, radio.getMinNumberListened());
        assertEquals(9, radio.getMaxNumberListened());
    }

    @Test
    public void shouldSetNumberListened() {

        radio.setNumberListened(5);
        assertEquals(5, radio.getNumberListened());
    }

    @Test
    public void shouldSetNoValidNumberListened() {

        radio.setNumberListened(10);
        assertEquals(0, radio.getNumberListened());
    }

    @Test
    public void shouldSetNotValidNumberListened() {

        radio.setNumberListened(-1);
        assertEquals(0, radio.getNumberListened());
    }

    @Test
    public void shouldNextNumberListened() {

        radio.setNumberListened(5);
        radio.next();
        assertEquals(6, radio.getNumberListened());
    }

    @Test
    public void shouldNextLastNumberListened() {

        radio.setNumberListened(9);
        radio.next();
        assertEquals(0, radio.getNumberListened());
    }

    @Test
    public void shouldPrevNumberListened() {

        radio.setNumberListened(7);
        radio.prev();
        assertEquals(6, radio.getNumberListened());
    }

    @Test
    public void shouldPrevFirstNumberListened() {

        radio.setNumberListened(0);
        radio.prev();
        assertEquals(9, radio.getNumberListened());
    }


    @Test
    public void shouldMinMaxSoundVolume() {

        Radio radio = new Radio(0, 100);
        assertEquals(100, radio.getMaxSoundVolume());
        assertEquals(0, radio.getMinSoundVolume());
    }

    @Test
    public void shouldSetSoundVolume() {

        radio.setSoundVolume(50);
        assertEquals(50, radio.getSoundVolume());
    }

    @Test
    public void shouldSetNoValidSoundVolume() {

        radio.setSoundVolume(-1);
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void shouldSetNotValidSoundVolume() {

        radio.setSoundVolume(101);
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void shouldIncreaseVolumeSoundVolume() {

        radio.setSoundVolume(51);
        radio.increaseVolume();
        assertEquals(52, radio.getSoundVolume());
    }

    @Test
    public void shouldIncreaseVolumeLastSoundVolume() {

        radio.setSoundVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    public void shouldReduceVolumeSoundVolume() {

        radio.setSoundVolume(57);
        radio.reduceVolume();
        assertEquals(56, radio.getSoundVolume());
    }

    @Test
    public void shouldReduceVolumeFirstSoundVolume() {

        radio.setSoundVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getSoundVolume());
    }
}