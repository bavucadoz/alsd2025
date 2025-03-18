package Praktikum05;
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

            Mahasiswa07 m = new Mahasiswa07(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        list.bubbleSort();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.tampil();
        sc.close();
    }
}