package org.courses.ex4_5;

public class ConvertTemperatureToFaringate extends ConverterTemperature{

    float degrees;

    public static final float CONST = 32;

    public ConvertTemperatureToFaringate(float degrees){
        this.degrees = degrees;
    }

    public void convert(){
        double degreesFaringate = degrees * 1.8 + CONST;
        System.out.println(degreesFaringate);
    }
}
