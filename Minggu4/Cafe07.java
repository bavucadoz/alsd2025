package Minggu4;
import java.util.Scanner;
public class Cafe07 {
    public String menuCafe;
    public String pemesan;
    public int harga;
    public String kasir;

    public Cafe07 (String pemesan, String menuCafe, int harga, String kasir) {
        this.pemesan = pemesan;
        this.menuCafe = menuCafe;
        this.harga = harga;
        this.kasir = kasir;
    }

    public Cafe07 () {

    }

    public void cetakInfo () {
        System.out.println("Nama Pemesan              : " + pemesan);
        System.out.println("Menu yang di pesan        : " + menuCafe);
        System.out.println("Harga menu yang dipesan   : " + harga);
        System.out.println("Kasir yang melayani       : " + kasir);
    }

    public void pendapatan () {
        System.out.println(" Pendapatan yang di dapatkan : " + harga);
    }
}
