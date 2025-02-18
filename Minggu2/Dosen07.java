package Minggu2;

public class Dosen07 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian Dosen: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        if (status == true) {
            System.out.println("Status Dosen: Aktif");
        } else {
            System.out.println("Status Dosen: Tidak Aktif");
        }
        statusAktif = status;
        return;
    }

    void hitungMasaKerja(int thnSekarang) {
        int hitungMasaKerja = thnSekarang - tahunBergabung;
        System.out.println("Masa Kerja: " + hitungMasaKerja);
        System.out.println();
        return;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen07 () {

    }
    
    public Dosen07 (String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian ) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}
