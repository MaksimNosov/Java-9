package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "2,2",
            "0,10",
            "0, -1",
            "0,13",
            "0,0"
    })
    public void shouldSetStation(int expected, int numberStation) {
        Radio station = new Radio();

        station.setNumberStation(numberStation);

        //int expected = ;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "8,7",
            "0,9",
    })
    public void playNextStation(int expected, int currentStation) {
        Radio station = new Radio();
        station.setNumberStation(currentStation);

        station.next();

        //int expected = 0;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "4,5",
            "9,0"
    })
    public void playPrevStation(int expected, int currentStation) {
        Radio station = new Radio();
        station.setNumberStation(currentStation);

        station.prev();

        //int expected = 9;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "3,2",
            "10,10"
    })
    public void louder(int expected, int currentVolume) {
        Radio volume = new Radio();
        volume.setVolume(currentVolume);

        volume.louder();

        //int expected = 10;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "3,4",
            "0,0"
    })
    public void quiet(int expected, int currentVolume) {
        Radio volume = new Radio();
        volume.setVolume(currentVolume);

        volume.quiet();

        //int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
