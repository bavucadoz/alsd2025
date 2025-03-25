package Minggu7;

public class Mahasiswa07 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa07() {}

    public Mahasiswa07(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}