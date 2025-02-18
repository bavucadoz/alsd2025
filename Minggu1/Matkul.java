package Minggu1;
import java.util.Scanner;

public class Matkul {
    static Scanner scanner = new Scanner(System.in);
    static String[] namaMatKul;
    static int[] sks;
    static int[] semester;
    static String[] hariKuliah;
    static int jumlahMataKuliah;

    public static void main(String[] args) {
        System.out.print("Masukkan banyak matkul: ");
        jumlahMataKuliah = scanner.nextInt();
        scanner.nextLine(); 

        namaMatKul = new String[jumlahMataKuliah];
        sks = new int[jumlahMataKuliah];
        semester = new int[jumlahMataKuliah];
        hariKuliah = new String[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Masukkan data matkul ke-" + (i + 1));
            System.out.print("Nama: ");
            namaMatKul[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari: ");
            hariKuliah[i] = scanner.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan semua jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari matkul");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 
            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal();
                    break;
                case 2:
                    System.out.print("Masukkan hari: ");
                    String hari = scanner.nextLine();
                    tampilkanJadwalBerdasarkanHari(hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int sem = scanner.nextInt();
                    tampilkanJadwalBerdasarkanSemester(sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String nama = scanner.nextLine();
                    cariMataKuliah(nama);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    public static void tampilkanSeluruhJadwal() {
        if (jumlahMataKuliah == 0) {
            System.out.println("Tidak ada mata kuliah.");
            return;
        }
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Nama: " + namaMatKul[i] + ", SKS: " + sks[i] + 
                               ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String hari) {
        boolean ditemukan = false;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println("Nama: " + namaMatKul[i] + ", SKS: " + sks[i] + 
                                   ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada hari " + hari);
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(int sem) {
        boolean ditemukan = false;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (semester[i] == sem) {
                System.out.println("Nama: " + namaMatKul[i] + ", SKS: " + sks[i] + 
                                   ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada semester " + sem);
        }
    }

    public static void cariMataKuliah(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (namaMatKul[i].equalsIgnoreCase(nama)) {
                System.out.println("Nama: " + namaMatKul[i] + ", SKS: " + sks[i] + 
                                   ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah " + nama + " tidak ditemukan.");
        }
    }
}