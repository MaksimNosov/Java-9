package ru.netology.radio;

public class Radio {

    public int defaultAmountStations = 10;
    public int minNumberStation = 0;
    public int maxNumberStation;
    public int numberStation = minNumberStation;
    public int maxVolume = 100;
    public int minVolume = 0;
    public int volume = minVolume;


    public Radio(int userSelectsAmountStations) {
        maxNumberStation = minNumberStation + userSelectsAmountStations - 1;
//        defaultAmountStations = userSelectsAmountStations;
//        if (numberStation > maxNumberStation) {
//            numberStation = maxNumberStation;
//        }
    }

    public Radio() {
        maxNumberStation = minNumberStation + defaultAmountStations - 1;
    }


    public int getNumberStation() {
        return numberStation;
    }

//    public int getMaxNumberStation() {
//        return maxNumberStation;
//    }
//
//    public int getMinNumberStation() {
//        return minNumberStation;
//    }

    public int getVolume() {
        return volume;
    }

    public void setNumberStation(int newNumberStation) {

        if (newNumberStation > maxNumberStation) {
            return;
//            numberStation = maxNumberStation;
        }
        if (newNumberStation < minNumberStation) {
            return;
//            numberStation = minNumberStation;
        }
        numberStation = newNumberStation;
    }

    public void setVolume(int newVolume) {
        volume = newVolume;

        if (newVolume > maxVolume) {
            return;
        }
        if (newVolume < minVolume) {
            return;
        }
    }

    public void next() {

        int nextStation = numberStation + 1;
        setNumberStation(nextStation);
        if (nextStation > maxNumberStation) {
            numberStation = minNumberStation;
        }
//        if (nextStation < minNumberStation) {
//            numberStation = maxNumberStation;
//        }


    }

    public void prev() {
        int prevStation = numberStation - 1;
        setNumberStation(prevStation);
        if (prevStation < minNumberStation) {
            numberStation = maxNumberStation;
        }
    }

    public void louder() {
        int louderSound = volume + 1;
        setVolume(louderSound);
        if (louderSound > maxVolume) {
            volume = maxVolume;
        }
//        if (louderSound < minVolume) {
//            volume = minVolume + 1;
//        }
    }

    public void quiet() {
        int quietSound = volume - 1;
        setVolume(quietSound);
        if (quietSound < minVolume) {
            volume = minVolume;
        }
//        if (quietSound > maxVolume) {
//            volume = maxVolume - 1;
//        }
    }
}
