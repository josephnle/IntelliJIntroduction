package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @java.lang.Override
    public Temperature toCelsius() {
        return new Celsius(((getValue() - 32) * 5)/9);
    }

    @java.lang.Override
    public Temperature toFahrenheit() {
        return this;
    }


    public String toString()
    {
        return Float.toString(getValue()) + " F";
    }
}

