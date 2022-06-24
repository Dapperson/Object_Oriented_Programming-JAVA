package Tugas3.No2;

public class KonversiSuhu2 extends KonversiSuhu{
    void fahrenheitToReamur(double fahrenheit){
        double reamur = ((4*(fahrenheit-32)/9));
        System.out.println("Hasil Konversi " + fahrenheit + " Celcius ke Reamur adalah : " + reamur);
    }
}
