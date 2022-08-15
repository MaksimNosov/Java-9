package ru.netology.radio;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
@Data

public class Radio {

    public int defaultAmountStations = 10;
    public int minNumberStation = 0;
    public int maxNumberStation;
    public int numberStation = minNumberStation;
    public int maxVolume = 100;
    public int minVolume = 0;
    public int volume = minVolume;

    public Radio() {
    }

    public Radio(int defaultAmountStations, int minNumberStation, int maxNumberStation, int numberStation, int maxVolume, int minVolume, int volume) {
        this.defaultAmountStations = defaultAmountStations;
        this.minNumberStation = minNumberStation;
        this.maxNumberStation = maxNumberStation;
        this.numberStation = numberStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.volume = volume;
    }

    public int getDefaultAmountStations() {
        return defaultAmountStations;
    }

    public void setDefaultAmountStations(int defaultAmountStations) {
        this.defaultAmountStations = defaultAmountStations;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public void setMinNumberStation(int minNumberStation) {
        this.minNumberStation = minNumberStation;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public void setMaxNumberStation(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

//    public void setNumberStation(int numberStation) {
//        this.numberStation = numberStation;
//    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getVolume() {
        return volume;
    }

//    public void setVolume(int volume) {
//        this.volume = volume;
//    }




        public Radio(int userSelectsAmountStations) {
        maxNumberStation = minNumberStation + userSelectsAmountStations - 1;
//        defaultAmountStations = userSelectsAmountStations;
//        if (numberStation > maxNumberStation) {
//            numberStation = maxNumberStation;
//        }
    }
//
//    public Radio() {
//        maxNumberStation = minNumberStation + defaultAmountStations - 1;
//    }
//
//
//    public int getNumberStation() {
//        return numberStation;
//    }
//
////    public int getMaxNumberStation() {
////        return maxNumberStation;
////    }
////
////    public int getMinNumberStation() {
////        return minNumberStation;
////    }
//
//    public int getVolume() {
//        return volume;
//    }
//
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
