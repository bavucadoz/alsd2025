package Minggu7;
import java.util.Scanner;
public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07(jumMhs);
        
        for (int i = 0; i < jumMhs; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i+1) + ": ");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("-----------------------------------");
            Mahasiswa07 m = new Mahasiswa07(nim, nama, kelas, ipk);
            list.tambah(m);
        }
            list.tampil();
            //Melakukan Pencarian Data Sequential
            System.out.println("-----------------------------------");
            System.out.println("Pencarian Data");
            System.out.println("-----------------------------------");
            System.out.println("Masukkan IPK yang dicari: ");
            System.out.print("IPK: ");
            double cari = sc.nextDouble();

            System.out.println("Menggunakan Sequential Searching");
            double posisi = list.sequentialSearching(cari);
            int pss= (int) posisi;
            list.tampilPosisi(cari, pss);
            list.tampilDataSearch(cari, pss);

            //Melakukan Pencarian Data Binary
            System.out.println("-----------------------------------");
            System.out.println("Pencarian Data");
            System.out.println("-----------------------------------");
            System.out.println("Masukkan IPK Mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            cari = sc.nextDouble();
            System.out.println("-----------------------------------");
            System.out.println("Menggunakan Binary Search");
            double posisi2 = list.findBinarySearch(cari,0, jumMhs-1);
            int pss2= (int) posisi2;
            list.tampilPosisi(cari, pss2);
            list.tampilDataSearch(cari, pss2);

        sc.close();
    }
}