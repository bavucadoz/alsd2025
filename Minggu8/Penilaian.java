package Minggu8;

public class Penilaian {
    
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    Penilaian (){
    }

    Penilaian (Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilaiTugas, double nilaiUts, double nilaiUas){
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUts;
        this.nilaiUAS = nilaiUas;
    }

    public double hitungNilaiAkhir() {
        return (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }
}