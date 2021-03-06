package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();

        assertEquals(20,conditioner.getCurrentTemperature());

    }
    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(5);
        conditioner.decreaseCurrentTemperature();
        assertEquals(5,conditioner.getCurrentTemperature());

    }
    @Test
    public void CurrentTemperatureAboveMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        conditioner.increaseCurrentTemperature();

        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    public void CurrentTemperatureBelowMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(6);
        conditioner.decreaseCurrentTemperature();
         conditioner.decreaseCurrentTemperature();
        assertEquals(5, conditioner.getCurrentTemperature());
    }
}