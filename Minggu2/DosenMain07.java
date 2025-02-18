package Minggu2;

public class DosenMain07 {
    public static void main(String[] args) {
        Dosen07 dosen = new Dosen07();
        dosen.idDosen = "MSA";
        dosen.nama = "Matthew Samodera";
        dosen.tahunBergabung = 2027;
        dosen.bidangKeahlian = "Aljabar Linear";

        dosen.tampilInformasi();
        dosen.setStatusAktif(true);
        dosen.hitungMasaKerja(2030);
        dosen.ubahKeahlian("Pemrograman Tingkat Lanjut");
        dosen.tampilInformasi();

        Dosen07 dosen2 = new Dosen07("KJ1", "Kim Jiwoong", false, 2026, "Bahasa Korea");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(false);
        dosen2.hitungMasaKerja(2030);
    }
}
