package org.courses.ex4_5;

public class Main {

    public static void main(String[] args) {

        int t = 32;

        ConvertTemperatureToKelvin convertTemperatureToKelvin = new ConvertTemperatureToKelvin();
        ConvertTemperatureToFaringate convertTemperatureToFaringate = new ConvertTemperatureToFaringate();

        convertTemperatureToKelvin.convert(t);
        convertTemperatureToFaringate.convert(t);
    }
}
