package com.example.myapplication;

public class Calculation {
    protected float convertCelsiusToFahrenheit(Float value) {
        Float ans = (value * 9/5) + 32;
        return ans;
    }
    protected float convertFahrenheitTocelcius(Float value) {
        Float ans = (value - 32) * 5/9;
        return ans;
    }
}
