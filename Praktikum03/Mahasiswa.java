package Praktikum03;
// Class Mahasiswa (Memiliki 3 Konstruktor)
public class Mahasiswa {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    // Konstruktor 1: Tanpa Parameter (Default)
    public Mahasiswa() {
        this.nim = "000000";
        this.nama = "Tidak diketahui";
        this.kelas = "Belum ada";
        this.ipk = 0.0f;
    }

    // Konstruktor 2: Parameter Nama dan NIM
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = "Belum ditentukan";
        this.ipk = 0.0f;
    }

    // Konstruktor 3: Parameter Lengkap
    public Mahasiswa(String nim, String nama, String kelas, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void cetakInfo() {
        System.out.println("NIM    : " + nim);
        System.out.println("Nama   : " + nama);
        System.out.println("Kelas  : " + kelas);
        System.out.println("IPK    : " + ipk);
        System.out.println("----------------------------------");
    }
}