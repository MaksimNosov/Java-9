package ru.netology.radio;

public class Radio {
    public int numberStation;
    public int volume;

    public int getNumberStation() {
        return numberStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setNumberStation(int newNumberStation) {

        if (newNumberStation > 9) {
            return;
        }
        if (newNumberStation < 0) {
            return;
        }
        numberStation = newNumberStation;
    }

    public void setVolume(int newVolume) {
        volume = newVolume;

        if (newVolume > 10) {
            return;
        }

        if (newVolume < 0) {
            return;
        }
    }

    public void next() {
        int nextStation = numberStation + 1;
        setNumberStation(nextStation);
        if (nextStation > 9) {
            numberStation = 0;
        }
    }

    public void prev() {
        int prevStation = numberStation - 1;
        setNumberStation(prevStation);
        if (prevStation < 0) {
            numberStation = 9;
        }
    }

    public void louder() {
        int louderSound = volume + 1;
        setVolume(louderSound);
        if (louderSound > 10) {
            volume = 10;
        }
    }

    public void quiet() {
        int quietSound = volume - 1;
        setVolume(quietSound);
        if (quietSound < 0) {
            volume = 0;
        }
    }
}
