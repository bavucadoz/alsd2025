package Praktikum05;
import java.util.Scanner;
public class DosenMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen07 daftarDosen = new DataDosen07();
        int pilihMenu;

        do {
            System.out.println("\nMENU:");
            System.out.println("--------------------------------------");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting Usia ASC (Bubble Sort)");
            System.out.println("4. Sorting Usia DSC (Selection Sort)");
            System.out.println("5. Keluar");
            System.out.println("--------------------------------------");
            System.out.print("Pilih menu: ");
            pilihMenu = sc.nextInt();
            sc.nextLine(); 

            switch (pilihMenu) {
                case 1:
                    if (daftarDosen.idx < 10) {
                        System.out.print("Kode: ");
                        String kode = sc.nextLine();
                        System.out.print("Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Jenis Kelamin (L/P): ");
                        char jk = sc.next().charAt(0);
                        boolean jenisKelamin = (jk == 'L' || jk == 'l');
                        System.out.print("Usia: ");
                        int usia = sc.nextInt();

                        Dosen07 dsn = new Dosen07(kode, nama, jenisKelamin, usia);
                        daftarDosen.tambah(dsn);
                        System.out.println("Data dosen berhasil ditambahkan!");
                    } else {
                        System.out.println("Data dosen sudah penuh [10/10] ");
                    }
                    break;
                case 2:
                    System.out.println("\nData Dosen:");
                    daftarDosen.tampil();
                    break;
                case 3:
                    daftarDosen.SortingASC();
                    break;
                case 4:
                    daftarDosen.SortingDSC();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihMenu != 5);

        sc.close();
    }
}