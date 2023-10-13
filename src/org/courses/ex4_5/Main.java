package org.courses.ex4_5;

public class Main {

    public static void main(String[] args) {

        ConvertTemperatureToKelvin convertTemperatureToKelvin = new ConvertTemperatureToKelvin(32);
        ConvertTemperatureToFaringate convertTemperatureToFaringate = new ConvertTemperatureToFaringate(15);

        convertTemperatureToKelvin.convert();
        convertTemperatureToFaringate.convert();
    }

}
