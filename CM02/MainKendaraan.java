package CM02;

import java.util.Scanner;

public class MainKendaraan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // buat antrian kendaraan
        Antrian antr = new Antrian();

        // buat array untuk menyimpan riwayat transaksi
        TransaksiPengisian[] rwytTransaksi = new TransaksiPengisian[100];
        int idxTransaksi = 0;

        while (true) {
            // tampillan menu
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int pilihan = in.nextInt();
            in.nextLine();

            switch (pilihan) {
                case 1:
                    // tambah kendaraan
                    System.out.print("Masukkan Plat Nomor: ");
                    String platNomor = in.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = in.nextLine();
                    System.out.print("Masukkan Merk Kendaraan: ");
                    String merk = in.nextLine();
                    // buat objek kendaraan
                    Kendaraan kendaraan = new Kendaraan(platNomor, tipe, merk);
                    antr.tambahKendaraan(kendaraan);
                    System.out.println(">> Kendaraan masuk ke dalam antrian.");
                    break;
                
                case 2:
                    // tampil antrian kendaraan
                    System.out.println("\n--- Antrian Kendaraan ---");
                    antr.tampilkanAntrian();
                    break;
                
                case 3:
                    // cek jumlah kendaraan di antrian
                    System.out.println(">> Jumlah kendaraan dalam antrian: " + antr.hitungJumlahAntrian());
                    break;
                
                case 4:
                    // ngecek kendaraan dalam antrian
                    if (antr.hitungJumlahAntrian() > 0) {
                        Kendaraan kendaraanDilayani = antr.layaniKendaraan();
                        System.out.println("Petugas melayani " + kendaraanDilayani.platNomor);
                        System.out.print("Pilih Jenis BBM: "); String jenisBBM = in.nextLine();
                        System.out.print("Harga per liter: "); int hargaPerLiter = in.nextInt();
                        System.out.print("Masukkan Jumlah Liter: "); double liter = in.nextDouble();
                        BBM bbm = new BBM(jenisBBM, hargaPerLiter); 

                        // mesukkan riwayat transaksi
                        TransaksiPengisian transaksi = new TransaksiPengisian(kendaraanDilayani, bbm, liter);
                        
                        // cek apakah riwayat transaksi penuh
                        if (idxTransaksi < rwytTransaksi.length) {
                            rwytTransaksi[idxTransaksi++] = transaksi;
                            System.out.println(">> Transaksi berhasil dicatat.");
                        } 
                        else {
                            System.out.println(">> Riwayat transaksi penuh.");
                        }
                    } 
                    // jika antrian kosong
                    else {
                        System.out.println(">> Tidak ada kendaraan dalam antrian.");
                    }
                    break;
                
                case 5:
                    // tampil riwayat transaksi
                    System.out.println("\n--- Riwayat Transaksi ---");
                    System.out.println("Daftar transaksi pengisian BBM:");
                    // cek apakah ada transaksi
                    if (idxTransaksi == 0) {
                        System.out.println("Tidak ada transaksi.");
                    } 
                    else {
                        for (int i = 0; i < idxTransaksi; i++) {
                            rwytTransaksi[i].tampilkanTransaksi();
                            System.out.println();
                        }
                    }
                    break;

                case 0:
                    // keluar dari program
                    System.out.println("Keluar dari program.");
                    in.close();
                    return;
                
                default:
                    // pilihan tidak valid
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
