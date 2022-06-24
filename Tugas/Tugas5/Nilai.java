package Tugas5;

import java.util.Scanner;

public class Nilai {
    Scanner input = new Scanner(System.in);

    Nilai() {
        this.setNPM();
        this.setNama();
        this.setNhadir();
        this.setNtugas();
        this.setNuts();
        this.setNuas();
        this.setNakhir();
        this.setNrata();
        this.setGrade();
        this.setKet();
    }

    String NPM, Nama, Ket;
    double nhadir, ntugas, nuts, nuas, nakhir, nrata;
    char grade;

    public String getNPM() {
        return NPM;
    }

    public void setNPM() {
        System.out.print("NPM\t\t: ");
        this.NPM = input.nextLine();
    }

    public String getNama() {
        return Nama;
    }

    public void setNama() {
        System.out.print("Nama\t\t: ");
        this.Nama = input.nextLine();
    }

    public double getNhadir() {
        return nhadir;
    }

    public void setNhadir() {
        System.out.print("Nilai Kehadiran\t: ");
        this.nhadir = input.nextInt();
    }

    public double getNtugas() {
        return ntugas;
    }

    public void setNtugas() {
        System.out.print("Nilai Tugas\t: ");
        this.ntugas = input.nextInt();
    }

    public double getNuts() {
        return nuts;
    }

    public void setNuts() {
        System.out.print("Nilai UTS\t: ");
        this.nuts = input.nextInt();
    }

    public double getNuas() {
        return nuas;
    }

    public void setNuas() {
        System.out.print("Nilai UAS\t: ");
        this.nuas = input.nextInt();
    }

    public double getNakhir() {
        return nakhir;
    }

    public void setNakhir() {
        this.nakhir = (10 / 100 * nhadir) + (0.2 * ntugas) + (0.3 * nuts) + (0.4 * nuas);
    }

    public double getNrata() {
        return nrata;
    }

    public void setNrata() {
        this.nrata = (nhadir + ntugas + nuts + nuas) / 4;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade() {
        if (this.nakhir >= 76) {
            grade = 'A';
        } else if (this.nakhir >= 66) {
            grade = 'B';
        } else if (this.nakhir >= 56) {
            grade = 'C';
        } else if (this.nakhir >= 46) {
            grade = 'D';
        } else {
            grade = 'E';
        }
    }

    public String getKet() {
        return Ket;
    }

    public void setKet() {
        switch (grade) {
            case 'A':
                Ket = "Istimewa";
                break;
            case 'B':
                Ket = "Baik";
                break;
            case 'C':
                Ket = "Cukup";
                break;
            case 'D':
                Ket = "Kurang";
                break;
            case 'E':
                Ket = "Kurang Sekali";
                break;
        }
    }
}

// import java.util.Scanner;

// public class Nilai {

// public static void main(String[] args) {
// String.NPM;
// String nama_mhs;
// int nilai_hadir;
// int nilai_tugas;
// int nilai_uts;
// int nilai_uas;
// int nilai_akhir;
// String grade;
// String keterangan;
// double uts;
// double tugas;
// double uas;
// double hadir;
// double nilai_total;

// // SCANNER.NPM
// Scanner satu = new Scanner(System.in);
// System.out.print("MASUKAN.NPM ANDA : ");
// .NPM = satu.next();

// // SCANNER NAMA
// Scanner dua = new Scanner(System.in);
// System.out.print("MASUKAN NAMA ANDA : ");
// nama_mhs = dua.next();

// // SCANNER NILAI HADIR
// Scanner tiga = new Scanner(System.in);
// System.out.print("\nMASUKAN NILAI HADIR ANDA : ");
// nilai_hadir = tiga.nextInt();

// // SCANNER NILAI TUGAS
// Scanner tujuh = new Scanner(System.in);
// System.out.print("\nMASUKAN NILAI TUGAS ANDA : ");
// nilai_tugas = tujuh.nextInt();

// // SCANNER NILAI UTS
// Scanner empat = new Scanner(System.in);
// System.out.print("\nMASUKAN NILAI UTS ANDA : ");
// nilai_uts = empat.nextInt();

// // SCANNER NILAI UAS
// Scanner lima = new Scanner(System.in);
// System.out.print("\nMASUKAN NILAI UAS ANDA : ");
// nilai_uas = lima.nextInt();

// // PROSES
// hadir = nilai_hadir * 0.1;
// tugas = nilai_tugas * 0.2;
// uts = nilai_uts * 0.3;
// uas = nilai_uas * 0.4;

// // MENCARI NILAI RATA RATA
// nilai_total = (hadir + tugas + uts + uas);
// System.out.print("\nNILAI RATA_RATA ANDA : " + nilai_total);

// // RAPIHKAN BARIS
// System.out.print("\n============================================");

// // MENCARI GRADE
// if (nilai_total > 76 && nilai_total < 100) {
// System.out.print("\nGRADE : A");
// System.out.print("\nKETERANGAN : ISTIMEWA");
// } else if (nilai_total > 66 && nilai_total < 75) {
// System.out.print("\nGRADE : B");
// System.out.print("\nKETERANGAN : BAIK");
// } else if (nilai_total > 56 && nilai_total < 65) {
// System.out.print("\nGRADE : C");
// System.out.print("\nKETERANGAN : CUKUP");
// } else if (nilai_total > 46 && nilai_total < 55) {
// System.out.print("\nGRADE : D");
// System.out.print("\nKETERANGAN : KURANG");
// } else if (nilai_total > 0 && nilai_total < 45) {
// System.out.print("\nGRADE : E");
// System.out.print("\nKETERANGAN : KURANG SEKALI");
// }

// }

// }