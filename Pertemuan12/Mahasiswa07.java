package Pertemuan12;

public class Mahasiswa07 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa07() {}

    Mahasiswa07(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-12s %-7s %-5s\n", nama, nim, kelas, ipk);
    }
}

