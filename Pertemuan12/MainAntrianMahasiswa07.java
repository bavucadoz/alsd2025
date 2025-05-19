package Pertemuan12;
import java.util.Scanner;
public class MainAntrianMahasiswa07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianMahasiswa07 antrian = new AntrianMahasiswa07();
        int pilih;
        
        do {
            System.out.println("\nMenu Layanan Unit Kemahasiswaan:");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa (Dequeue)");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Mahasiswa Paling Akhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Lihat Jumlah Mahasiswa yang Mengantri");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();  
        
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    antrian.enqueue(nama, nim);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    antrian.print();
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 7:
                    System.out.println("Jumlah Mahasiswa dalam Antrian: " + antrian.getSize());
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
        sc.close();
    }
}
