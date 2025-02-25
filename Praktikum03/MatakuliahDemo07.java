package Praktikum03;
import java.util.Scanner;
public class MatakuliahDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menentukan jumlah matakuliah berdasarkan input pengguna
        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine());
        Matakuliah07[] arrayOfMatakuliah = new Matakuliah07[jumlahMatkul];
        
        // Mengisi data Matakuliah
        for (int i=0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah[i] = new Matakuliah07 ();
            arrayOfMatakuliah[i].tambahData(sc);
        }

        // Menampilkan data matakuliah
        for (int i=0; i < jumlahMatkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
           arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
