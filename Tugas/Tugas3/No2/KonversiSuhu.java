package Tugas3.No2;

public class KonversiSuhu {
    double nilai;

    void celciusToFarenheit(double celcius){
        double fahrenheit = ((9*celcius)/5 + 32);
        System.out.println("Hasil Konversi " + celcius + " Celcius ke Fahrenheit adalah : " + fahrenheit);
    }
    
    void celciusToReamur(double celcius){
        double reamur = ((4*celcius)/5);
        System.out.println("Hasil Konversi " + celcius + " Celcius ke Reamur adalah : " + reamur);
    }
}
