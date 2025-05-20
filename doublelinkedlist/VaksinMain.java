package doublelinkedlist;
import java.util.Scanner;
public class VaksinMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLAntrianVaksin antrian = new DLLAntrianVaksin();
        int pilihan;
        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian: ");
                    int nomor = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Nama Penerima: ");
                    String nama = sc.nextLine();
                    antrian.tambahData(nomor, nama);
                    break;
                case 2:
                    antrian.hapusData();
                    break;
                case 3:
                    antrian.tampilkanData();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        sc.close();
    }
}
