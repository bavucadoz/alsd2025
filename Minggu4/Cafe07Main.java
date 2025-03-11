package Minggu4;
import java.util.Scanner;
public class Cafe07Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak Pesanan yang dipesan hari ini : ");
        int banyakPesanan = Integer.parseInt(sc.nextLine());
        Cafe07[] arrayOfCafe07 = new Cafe07[banyakPesanan];

        for (int i=0; i < banyakPesanan; i++) {
            arrayOfCafe07[i] = new Cafe07();
            System.out.println("Pesanan ke-" + (i+1));
            System.out.print("Pemesan       : ");
            arrayOfCafe07[i].pemesan = sc.nextLine();
            System.out.print("Nama Menu     : ");
            arrayOfCafe07[i].menuCafe = sc.nextLine();
            System.out.print("Harga Menu    : ");
            arrayOfCafe07[i].harga = sc.nextInt();
            System.out.print("Kasir         : ");
            arrayOfCafe07[i].kasir = sc.nextLine();
            sc.nextLine();
            System.out.println("-----------------");
        }

        for (int i=0; i < banyakPesanan; i++) {
            System.out.println("Data Pesanan ke-" + (i+1));
            arrayOfCafe07[i].cetakInfo();
        }

        arrayOfCafe07.pendapatan();
    }
}
