package org.courses.ex4_5;

public class ConvertTemperatureToKelvin extends ConverterTemperature {

    public static final double K = 273.15;

    @Override
    public void convert(int t){
       double tempKelvin = t + K;
        System.out.println(tempKelvin);
    }
}
