package Minggu2;

public class MataKuliahMain07 {
    public static void main(String[] args) {
        MataKuliah07 matkul = new MataKuliah07();
        matkul.kodeMk = "ALSD";
        matkul.nama = "Algoritma dan Struktur Data";
        matkul.sks = 3;
        matkul.jumlahJam = 6;

        matkul.tampilInformasi();
        matkul.tambahJam(1);
        matkul.kurangiJam(2);
        matkul.tampilInformasi();

        MataKuliah07 matkul2 = new MataKuliah07("BIG", "Bahasa Inggris", 2, 4 );
        matkul2.kurangiJam(4);
        matkul.tampilInformasi();
    }
}
