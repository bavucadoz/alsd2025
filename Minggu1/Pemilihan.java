package Minggu1;
import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");

        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        System.out.println("======================");
        System.out.println("======================");

        if (nilaiTugas>100 && nilaiTugas<0) {
            System.out.println("Nilai Tidak Valid");
        }
        else if (nilaiKuis>100 && nilaiKuis<0) {
            System.out.println("Nilai Tidak Valid");
        }
        else if (nilaiUTS>100 && nilaiUTS<0) {
            System.out.println("Nilai Tidak Valid");
        }
        else if (nilaiUAS>100 && nilaiUAS<0) {
            System.out.println("Nilai Tidak Valid");
        } 

        double nilaiAkhir = (nilaiKuis*0.20 + nilaiTugas*0.20 + nilaiUTS*0.30 + nilaiUAS*0.40); 

        if (nilaiAkhir>80 && nilaiAkhir<=100) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: A");
        }
        else if (nilaiAkhir>73 && nilaiAkhir<=80) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: B+");
        }
        else if (nilaiAkhir>65 && nilaiAkhir<=73) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: B");
        }
        else if (nilaiAkhir>60 && nilaiAkhir<=65) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: C+");
        }
        else if (nilaiAkhir>50 && nilaiAkhir<=60) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: C");
        }
        else if (nilaiAkhir>39 && nilaiAkhir<=50) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: D");
        }
        else if (nilaiAkhir<=39) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: E");
        }

        System.out.println("======================");
        System.out.println("======================");

        if (nilaiAkhir>=50 && nilaiAkhir<=100) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir>=0 && nilaiAkhir<50) {
            System.out.println("MAAF ANDA GAGAL");
        } else {
            System.out.println("Nilai Tidak Valid");
        }
        sc.close();
    }
}
