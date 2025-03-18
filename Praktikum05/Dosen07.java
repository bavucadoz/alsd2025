package Praktikum05;

public class Dosen07 {
    String kode;
    String nama;
    boolean jenisKelamin; // true = laki-laki, false = perempuan
    int usia;

    public Dosen07() {

    }

    public Dosen07(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
        System.out.println("-----------------------");
    }
}
