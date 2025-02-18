package Minggu2;

public class MataKuliah07 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode Unik Mata Kuliah: " + kodeMk);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah Satuan Kredit Semester: " + sks);
        System.out.println("Jumlah Jam Mata Kuliah: " + jumlahJam);
        System.out.println( );
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam = jumlahJam + jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam <= jam) {
            System.out.println("Pengurangan tidak dapat dilakukan");
        } if (jumlahJam > jam) {
            jumlahJam = jumlahJam - jam;
            System.out.println("Penguraman jam berhasil");
        }
    }

    public MataKuliah07 () {

    }
    
    public MataKuliah07 (String mk, String nama, int sks, int jumlahJam ) {
        kodeMk = mk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
