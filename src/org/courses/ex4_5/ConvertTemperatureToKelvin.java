package org.courses.ex4_5;

public class ConvertTemperatureToKelvin extends ConverterTemperature {

    int t;

    public static final double K = 273.15;

    public ConvertTemperatureToKelvin(int t){
        this.t = t;
    }

    @Override
    public void convert(){
       double tempKelvin = t + K;
        System.out.println(tempKelvin);
    }
}
