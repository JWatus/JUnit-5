package com.infoshareacademy.jjdd3;

public class FahrenheitConverter {
    public static int toCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static int fromCelsius(int celsius) {
        return celsius * 9 / 5 + 32;
    }
}
