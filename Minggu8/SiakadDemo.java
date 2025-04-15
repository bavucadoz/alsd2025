package Minggu8;
import java.util.Scanner;

public class SiakadDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataSiakad siakad = new DataSiakad (); 
        int pilihan;
        
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Data Mahasiswa              ");
            System.out.println("2. Tampilkan Data Mata Kuliah            ");
            System.out.println("3. Tampilkan Data Nilai                  ");
            System.out.println("4. Urutkan Data Berdasarkan Nilai Akhir  ");
            System.out.println("5. Cari Data Mahasiswa Berdasarkan NIM   ");
            System.out.println("0. Keluar                                ");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    siakad.tampilMahasiswa();
                    break;
                case 2:
                    siakad.tampilMataKuliah();
                    break;
                case 3:
                    siakad.tampilNilai();
                    break;
                case 4:
                    siakad.urutkanNilai();
                    System.out.println("\nData telah diurutkan berdasarkan nilai akhir (tertinggi ke terendah)");
                    siakad.tampilNilai();
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM mahasiswa yang dicari: ");
                    String nim = input.nextLine();
                    siakad.cariMahasiswaNIM(nim);
                    break;
                case 0:
                    System.out.println("\nTerima kasih telah menggunakan program Sistem Akademik Nilai!");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid. Silakan pilih menu yang tersedia!");
            }
        } while (pilihan != 0);
        input.close();
    }
}