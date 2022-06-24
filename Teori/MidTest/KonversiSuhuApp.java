/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MidTest;

/**
 *
 * @author Asus
 */
public class KonversiSuhuApp {
    public static void main(String[] args) {

        KonversiSuhu run = new KonversiSuhuMethod();
        System.out.println("Nilai Konversi Suhu 14 Celcius ke Fahrenheit adalah " + run.celciusToFarenheit(14));
        System.out.println("Nilai Konversi Suhu 14 Celcius ke Kelvin adalah : " + run.celciusToKelvin(14));
        System.out.println("Nilai Konversi Suhu 14 Kelvin ke Celcius adalah : " + run.kelvinToCelcius(14));
        System.out.println("Nilai Konversi Suhu 14 Fahrenheit ke Celcius adalah : " + run.fahrenheitToCelcius(14));
    }
}
