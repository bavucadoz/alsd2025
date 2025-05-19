package Pertemuan12;
import java.util.Scanner;
public class SLLMain07Modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList07 sll = new SingleLinkedList07();
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Tambah data setelah nama tertentu");
            System.out.println("4. Tambah data di indeks tertentu");
            System.out.println("5. Tampilkan isi Linked List");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 
            String nama, nim, kelas;
            double ipk;
            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    sc.nextLine();
                    sll.addFirst(new Mahasiswa07(nama, nim, kelas, ipk));
                    break;
                case 2:
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    sc.nextLine();
                    sll.addLast(new Mahasiswa07(nama, nim, kelas, ipk));
                    break;
                case 3:
                    System.out.print("Masukkan nama setelah siapa ingin ditambahkan: ");
                    String key = sc.nextLine();
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    sc.nextLine();
                    sll.insertAfter(key, new Mahasiswa07(nama, nim, kelas, ipk));
                    break;
                case 4:
                    System.out.print("Masukkan indeks: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("NIM: ");
                    nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    sc.nextLine();
                    sll.insertAt(index, new Mahasiswa07(nama, nim, kelas, ipk));
                    break;
                case 5:
                    sll.print();
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        sc.close();
    }
}