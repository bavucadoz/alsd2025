package P2Jobsheet10;

import java.util.Scanner;

public class LayananKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);  
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat 2 Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Jumlah yang sudah diproses");
            System.out.println("7. Lihat Antrian Paling Belakang");
            System.out.println("8. Mengosongkan Antrian");
            System.out.println("9. Jumlah Mahasiswa yang belum diproses");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (antrian.getJumlahAntrian() < 10) {
                        System.out.print("NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Prodi: ");
                        String prodi = sc.nextLine();
                        System.out.print("Kelas: ");
                        String kelas = sc.nextLine();
                        MahasiswaKRS mhs = new MahasiswaKRS(nim, nama, prodi, kelas);
                        antrian.tambahAntrian(mhs);
                    } else {
                        System.out.println("Antrian sudah penuh.");
                    }
                    break;
                case 2:
                    MahasiswaKRS[] dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa:");
                        dilayani[0].tampilkanData();
                        dilayani[1].tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah Antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    System.out.println("Jumlah yang sudah diproses DPA: " + antrian.getJumlahYangSudahDiproses());
                    break;
                case 7:
                    antrian.lihatAkhir();
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 9:
                    System.out.println("Jumlah Mahasiswa yang belum diproses DPA: " + antrian.getJumlahYangBelumDiproses());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}