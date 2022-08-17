package ru.netology.radio;

public class Radio {

    private int defaultAmountStations = 10;
    private int minNumberStation = 0;
    private int numberStation = minNumberStation;
    private int maxNumberStation = minNumberStation + defaultAmountStations - 1;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int volume = minVolume;

    public Radio() {
    }

    public Radio(int userSelectsAmountStation) {
        this.defaultAmountStations = userSelectsAmountStation;
        this.maxNumberStation = minNumberStation + defaultAmountStations - 1;
    }

//    public int getDefaultAmountStations() {
//        return defaultAmountStations;
//    }
//    public void setDefaultAmountStations(int defaultAmountStations) {
//        this.defaultAmountStations = defaultAmountStations;
//    }

//    public int getMinNumberStation() {
//        return minNumberStation;
//    }

//    public void setMinNumberStation(int minNumberStation) {
//        this.minNumberStation = minNumberStation;
//    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation > maxNumberStation) {
            return;
        }
        if (numberStation < minNumberStation) {
            return;
        }
        this.numberStation = numberStation;
    }

//    public int getMaxNumberStation() {
//        return maxNumberStation;
//    }

//    public void setMaxNumberStation(int maxNumberStation) {
//        this.maxNumberStation = maxNumberStation;
//    }

//    public int getMaxVolume() {
//        return maxVolume;
//    }

//    public void setMaxVolume(int maxVolume) {
//        this.maxVolume = maxVolume;
//    }

//    public int getMinVolume() {
//        return minVolume;
//    }

//    public void setMinVolume(int minVolume) {
//        this.minVolume = minVolume;
//    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            return;
        }
        if (volume < minVolume) {
            return;
        }
        this.volume = volume;
    }

    public void next() {

        int nextStation = numberStation + 1;
        setNumberStation(nextStation);
        if (nextStation > maxNumberStation) {
            numberStation = minNumberStation;
        }
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
    }

    public void quiet() {
        int quietSound = volume - 1;
        setVolume(quietSound);
        if (quietSound < minVolume) {
            volume = minVolume;
        }
    }
}
