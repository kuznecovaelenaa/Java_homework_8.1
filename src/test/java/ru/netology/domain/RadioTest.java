package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {
    Radio radio = new Radio();


    @Test
    void shouldCountStation() {
        Radio radio = new Radio(20);

        assertEquals(20, radio.getCountStation());
        assertEquals(0, radio.getMinNumberListened());
        assertEquals(19, radio.getMaxNumberListened());
        assertEquals(14, radio.getNumberListened());

        radio.setNumberListened(19);
        radio.next();
        assertEquals(0, radio.getNumberListened());
    }

    @Test
    void shouldMinNumberListened() {

        radio.setMinNumberListened(0);
        assertEquals(0, radio.getMinNumberListened());
    }

    @Test
    void shouldMaxNumberListened() {

        radio.setMaxNumberListened(9);
        assertEquals(9, radio.getMaxNumberListened());
    }

    @Test
    void shouldSetNumberListened() {

        radio.setNumberListened(5);
        assertEquals(5, radio.getNumberListened());
    }

    @Test
    void shouldSetNoValidNumberListened() {

        radio.setNumberListened(14);
        assertEquals(0, radio.getNumberListened());
    }

    @Test
    void shouldSetNotValidNumberListened() {

        radio.setNumberListened(-1);
        assertEquals(0, radio.getNumberListened());
    }

    @Test
    void shouldNextNumberListened() {

        radio.setNumberListened(5);
        radio.next();
        assertEquals(6, radio.getNumberListened());
    }

    @Test
    void shouldNextLastNumberListened() {

        radio.setNumberListened(9);
        radio.next();
        assertEquals(0, radio.getNumberListened());
    }

    @Test
    void shouldPrevNumberListened() {

        radio.setNumberListened(7);
        radio.prev();
        assertEquals(6, radio.getNumberListened());
    }

    @Test
    void shouldPrevFirstNumberListened() {

        radio.setNumberListened(0);
        radio.prev();
        assertEquals(9, radio.getNumberListened());
    }


    @Test
    void shouldMinSoundVolume() {

        radio.setMinSoundVolume(0);
        assertEquals(0, radio.getMinSoundVolume());
    }

    @Test
    void shouldMaxSoundVolume() {

        radio.setMaxSoundVolume(100);
        assertEquals(100, radio.getMaxSoundVolume());
    }

    @Test
    void shouldSetSoundVolume() {

        radio.setSoundVolume(50);
        assertEquals(50, radio.getSoundVolume());
    }

    @Test
    void shouldSetNoValidSoundVolume() {

        radio.setSoundVolume(-1);
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    void shouldSetNotValidSoundVolume() {

        radio.setSoundVolume(101);
        assertEquals(0, radio.getSoundVolume());
    }

    @Test
    void shouldIncreaseVolumeSoundVolume() {

        radio.setSoundVolume(51);
        radio.increaseVolume();
        assertEquals(52, radio.getSoundVolume());
    }

    @Test
    void shouldIncreaseVolumeLastSoundVolume() {

        radio.setSoundVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    void shouldReduceVolumeSoundVolume() {

        radio.setSoundVolume(57);
        radio.reduceVolume();
        assertEquals(56, radio.getSoundVolume());
    }

    @Test
    void shouldReduceVolumeFirstSoundVolume() {

        radio.setSoundVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getSoundVolume());
    }
}