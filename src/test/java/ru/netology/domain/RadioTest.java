package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "5, 5",
            "0, 0",
            "9, 9",
            "-1, 0",
            "10, 0"
    })

    public void setNumberListened(int numberListened, int expected) {


        Radio rad = new Radio();
        rad.setNumberListened(numberListened);

        int actual = rad.getNumberListened();

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "5, 6",
            "0, 1",
            "9, 0",
    })

    public void next(int numberListened, int expected) {


        Radio rad = new Radio();
        rad.setNumberListened(numberListened);

        rad.next();

        int actual = rad.getNumberListened();

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "7, 6",
            "9, 8",
            "0, 9",
    })
    public void prev(int numberListened, int expected) {


        Radio rad = new Radio();
        rad.setNumberListened(numberListened);

        rad.prev();

        int actual = rad.getNumberListened();

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "5, 5",
            "0, 0",
            "10, 10",
            "-1, 0",
            "12, 0"
    })

    public void setSoundVolume(int soundVolume, int expected) {


        Radio rad = new Radio();
        rad.setSoundVolume(soundVolume);

        int actual = rad.getSoundVolume();

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "5, 6",
            "0, 1",
            "10, 0",
    })

    public void increaseVolume(int soundVolume, int expected) {


        Radio rad = new Radio();
        rad.setSoundVolume(soundVolume);

        rad.increaseVolume();

        int actual = rad.getSoundVolume();

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "7, 6",
            "10, 9",
            "0, 10",
    })
    public void reduceVolume(int soundVolume, int expected) {


        Radio rad = new Radio();
        rad.setSoundVolume(soundVolume);

        rad.reduceVolume();

        int actual = rad.getSoundVolume();

        assertEquals(expected, actual);
    }
}