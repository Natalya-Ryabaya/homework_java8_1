package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature = 20;
    private int minTemperature = 5;
    private int currentTemperature;
    private boolean on;

    public int getCurrentTemperature() {
        return currentTemperature;
    }
    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;

    }

    public void increaseCurrentTemperature() {
        setCurrentTemperature(currentTemperature + 1);
        return;
    }
    public void decreaseCurrentTemperature(){
        setCurrentTemperature(currentTemperature - 1);
        return;
    }
}
