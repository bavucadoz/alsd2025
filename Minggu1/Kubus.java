package Minggu1;
import java.util.Scanner;
public class Kubus {

    static int hitungVolume (int sisi) {
        int vKubus = sisi*sisi*sisi;
        return vKubus;
    }

    static int hitungLP (int sisi) {
        int lPKubus = 6*sisi*sisi;
        return lPKubus;
    }

    static int hitungK (int sisi) {
        int kKubus = 12*sisi;
        return kKubus;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Menu Perhitungan Kubus");
            System.out.println("=============");
            System.out.println("1. Volume");
            System.out.println("2. Luas Permukaan");
            System.out.println("3. Keliling");
            System.out.println("4. Selesai");
            System.out.println("=============");
            System.out.print("Silahkan pilih menu yang anda ingin gunakan :");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu<1 || menu>4) {
                System.out.println("Maaf pilihan diluar jangkauan menu");
            }

            switch (menu) {
            case 1 :
                System.out.print("Masukkan Panjang sisi: ");
                int sisi = sc.nextInt();
                System.out.print("Volume kubus adalah: ");
                System.out.print(hitungVolume(sisi));
                break;
            case 2 :
                System.out.print("Masukkan Panjang sisi: ");
                sisi = sc.nextInt();
                System.out.print("Luas Permukaan KUbus adalah: ");
                System.out.print(hitungLP(sisi));
                break;
            case 3 :
                System.out.print("Masukkan Panjang sisi: ");
                sisi = sc.nextInt();
                System.out.print("Keliling kubus adalah: ");
                System.out.print(hitungK(sisi));
                break;
            case 4 :
                System.out.println("Terimakasih sudah menggunakan Menu");
                break;
        }
        sc.close();
    }
}
