package org.courses.ex4_5;

public class ConvertTemperatureToFaringate extends ConverterTemperature{

    public static final float CONST = 32;

    @Override
    public void convert(int degrees){
        double degreesFaringate = degrees * 1.8 + CONST;
        System.out.println(degreesFaringate);
    }
}
