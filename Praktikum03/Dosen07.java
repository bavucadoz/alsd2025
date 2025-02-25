package Praktikum03;

public class Dosen07 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    public int usia;

    public Dosen07 (String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public Dosen07() {

    }

    public void cetakInfo() {
        System.out.println("Kode Dosen    : " + kode);
        System.out.println("Nama Dosen    : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Wanita" : "Pria")); 
        System.out.println("Usia          : " + usia);
        System.out.println("----------------------------------");
    }

}
