/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidTest;

/**
 *
 * @author Asus
 */
public class KonversiSuhuMethod implements KonversiSuhu{
    private double celcius, kelvin, fahrenheit;

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius() {
        this.celcius = celcius;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin() {
        this.kelvin = kelvin;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit() {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public double celciusToKelvin(double celcius) {
        return celcius + 273;

    }

    @Override
    public double celciusToFarenheit(double celcius) {
        return ((celcius * 9) / 5) + 32;

    }

    @Override
    public double kelvinToCelcius(double kelvin) {
        return kelvin - 273;

    }

    @Override
    public double fahrenheitToCelcius(double fahrenheit) {
        return (5 * (fahrenheit - 32)) / 9;

    }
}
