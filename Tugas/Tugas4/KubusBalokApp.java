package Tugas4;

public class KubusBalokApp {
    public static void main(String[] args) {
        Kubus kb1 = new Kubus();
        Kubus kb2 = new Kubus(16);

        int a = 16;

        System.out.println("Luas Kubus dengan sisi " + kb1.a + " adalah " + kb1.getLuas());
        System.out.println("Keliling Kubus dengan sisi " + kb1.a + " adalah " + kb1.getKeliling() + "\n");

        System.out.println("Luas Kubus dengan sisi " + a + " adalah " + kb2.getLuas());
        System.out.println("Keliling Kubus dengan sisi " + a + " adalah " + kb2.getKeliling() + "\n");

        Balok bl1 = new Balok(4, 5);
        Balok bl2 = new Balok(16, 4, 5);

        System.out.println("Luas Balok dengan Panjang : " + bl1.b + ", Lebar : " + bl1.c + ", Tinggi : " + bl1.d
                + " adalah " + bl1.getLuas());
        System.out.println("Keliling Balok dengan Panjang : " + bl1.b + ", Lebar : " + bl1.c + ", Tinggi : " + bl1.d
                + " adalah " + bl1.getKeliling() + "\n");

        System.out.println("Luas Balok dengan Panjang : " + bl2.b + ", Lebar : " + bl2.c + ", Tinggi : " + bl2.d
                + " adalah " + bl2.getLuas());
        System.out.println("Keliling Balok dengan Panjang : " + bl2.b + ", Lebar : " + bl2.c + ", Tinggi : " + bl2.d
                + " adalah " + bl2.getKeliling() + "\n");

    }
}
