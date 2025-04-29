package Jobsheet09;
import java.util.Scanner;
public class SuratMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat07 stackSurat = new StackSurat07(5);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin berdasarkan Nama Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Masukkan Durasi (Jam): ");
                    int durasi = sc.nextInt();
                    Surat07 surat = new Surat07(idSurat, nama, kelas, jenis, durasi);
                    stackSurat.terimaSurat(surat);
                    System.out.printf("Surat %s berhasil diterima\n", surat.namaMahasiswa);
                    System.out.println();
                    break;
                case 2:
                    Surat07 diproses = stackSurat.prosesSurat();
                    System.out.printf("Surat %s berhasil diproses\n", diproses.namaMahasiswa);
                    break;
                case 3:
                    Surat07 lihat = stackSurat.suratTerakhir();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String cariNama = sc.nextLine();
                    stackSurat.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}