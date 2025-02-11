package Minggu1;
public class Fungsi {
    static int[][] stok = {
        {10, 5, 15, 7},   
        {6, 11, 9, 12},   
        {2, 10, 10, 5},   
        {5, 7, 12, 9}    
    };
    static int[] harga = {75000, 50000, 60000, 10000}; 

    public static void main(String[] args) {
        pendapatan();
        totalStok();
    }

    public static void pendapatan() {
        System.out.println("Pendapatan toko jika semua bunga terjual:");
        for (int i = 0; i < stok.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                totalPendapatan += stok[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
    }

    public static void totalStok() {
        int[] totalStok = new int[4]; 
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                totalStok[j] += stok[i][j];
            }
        }
        System.out.println("\nStok Setiap Jenis Bunga:");
        System.out.println("Aglonema: " + totalStok[0]);
        System.out.println("Keladi: " + totalStok[1]);
        System.out.println("Alocasia: " + totalStok[2]);
        System.out.println("Mawar: " + totalStok[3]);
    }
}