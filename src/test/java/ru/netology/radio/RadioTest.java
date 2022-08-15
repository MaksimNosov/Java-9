package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    Radio station = new Radio();
    Radio volume = new Radio();

    @ParameterizedTest
    @CsvSource({
            "2,2",
            "0,10",
            "0,-1",
            "0,13",
            "0,0"
    })
    public void shouldSetStation(int expected, int numberStation) {

        station.setNumberStation(numberStation);

        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "2,2",
            "0,10",
            "0, -1",
            "0,13",
            "0,0"
    })
    public void shouldSetStationA(int expected, int numberStation) {

        station.setNumberStation(numberStation);

        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "8,7",
            "0,9",
            "1,0",
//            "0,-1",
//            "0,-3",
//            "0,10"
    })
    public void playNextStationDefaultAmountStations(int expected, int currentStation) {

        station.setNumberStation(currentStation);

        station.next();

        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "8,7",
            "10,9",
            "19,18",
            "1,0",
            "0,19",
//            "0,20",
//            "0,21"
    })
    public void playNextStationUserSelectsAmountStations(int expected, int currentStation) {
        Radio station = new Radio(20);

        station.setNumberStation(currentStation);

        station.next();

        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "4,5",
            "9,0",
            "9,10"
    })
    public void playPrevStationDefaultAmountStations(int expected, int currentStation) {

        station.setNumberStation(currentStation);

        station.prev();

        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "4,5",
            "19,0",
            "18,19",
            "0,1",
            "19,20",
            "19,-1"
    })
    public void playPrevStationUserSelectsAmountStations(int expected, int currentStation) {

        Radio station = new Radio(20);

        station.setNumberStation(currentStation);

        station.prev();

        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({
            "3,2",
            "11,10",
            "100,99",
            "100,100",
            "100,102",
            "1,0",
            "2,1"
    })
    public void louder(int expected, int currentVolume) {

        volume.setVolume(currentVolume);

        volume.louder();

        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "3,4",
            "0,1",
            "0,0",
            "9,10",
            "99,100",
//            "99,102",
            "98,99",
            "0,-1"
    })
    public void quiet(int expected, int currentVolume) {

        volume.setVolume(currentVolume);

        volume.quiet();

        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }


}