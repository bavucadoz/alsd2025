package Minggu8;
public class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    Mahasiswa() {
    }

    Mahasiswa(String nim, String nama, String prodi ){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi ;
    }

    void tampilMahasiswa(){
        System.out.println("NIM : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Prodi : "+prodi);
    } 
}