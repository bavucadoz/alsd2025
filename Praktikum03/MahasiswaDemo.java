package Praktikum03;
// Class MahasiswaDemo (Program Utama)
public class MahasiswaDemo {
    public static void main(String[] args) {
        // Objek 1: Menggunakan konstruktor tanpa parameter
        Mahasiswa mhs1 = new Mahasiswa();
        
        // Objek 2: Menggunakan konstruktor dengan 2 parameter
        Mahasiswa mhs2 = new Mahasiswa("220101", "Bayu Behapi");

        // Objek 3: Menggunakan konstruktor dengan parameter lengkap
        Mahasiswa mhs3 = new Mahasiswa("220102", "Rina Setiawan", "IF-8", 3.85f);

        // Menampilkan data mahasiswa
        mhs1.cetakInfo();
        mhs2.cetakInfo();
        mhs3.cetakInfo();
    }
}