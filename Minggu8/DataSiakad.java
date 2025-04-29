package Minggu8;

public class DataSiakad {
    Mahasiswa[] daftarMahasiswa;
    MataKuliah[] daftarMataKuliah;
    Penilaian[] daftarNilai;
    
    public DataSiakad() {
        Mahasiswa m1 = new Mahasiswa("22001", "Ali Rahman", "Informatika");
        Mahasiswa m2 = new Mahasiswa("22002", "Budi Santoso", "Informatika");
        Mahasiswa m3 = new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis");
        daftarMahasiswa = new Mahasiswa[] { m1, m2, m3 };
        
        MataKuliah mk1 = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("MK003", "Desain Web", 3);
        daftarMataKuliah = new MataKuliah[] { mk1, mk2, mk3 };
        
        daftarNilai = new Penilaian[] {
            new Penilaian(m1, mk1, 80, 85, 90),
            new Penilaian(m1, mk2, 60, 75, 70),
            new Penilaian(m2, mk1, 75, 70, 80),
            new Penilaian(m3, mk2, 85, 90, 95),
            new Penilaian(m3, mk3, 80, 90, 65)
        };
    }
    
    public void tampilMahasiswa() {
        System.out.println("\nDaftar Mahasiswa:");
        
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("NIM: " + daftarMahasiswa[i].nim + " | Nama: " + 
                              daftarMahasiswa[i].nama + " | Prodi: " + 
                              daftarMahasiswa[i].prodi);
        }
    }
    
    public void tampilMataKuliah() {
        System.out.println("\nDaftar Mata Kuliah:");
        
        for (int i = 0; i < daftarMataKuliah.length; i++) {
            System.out.println("Kode MK: " + daftarMataKuliah[i].kodeMK + 
                              " | Nama: " + daftarMataKuliah[i].namaMK + 
                              " | SKS: " + daftarMataKuliah[i].sks);
        }
    }
  
    public void tampilNilai() {
        System.out.println("\nData Penilaian:");
        
        for (int i = 0; i < daftarNilai.length; i++) {
            Penilaian nilai = daftarNilai[i];
            System.out.println(nilai.mahasiswa.nama + " | " + 
                              nilai.mataKuliah.namaMK + " | " + 
                              "Nilai Akhir: " + nilai.hitungNilaiAkhir());
        }
    }
    
    // Mengurutkan nilai menggunakan Bubble Sort (descending)
    public void urutkanNilai() {
        for (int i = 0; i < daftarNilai.length - 1; i++) {
            for (int j = 0; j < daftarNilai.length - i - 1; j++) {
                if (daftarNilai[j].hitungNilaiAkhir() > daftarNilai[j + 1].hitungNilaiAkhir()) {
                    Penilaian temp = daftarNilai[j];
                    daftarNilai[j] = daftarNilai[j + 1];
                    daftarNilai[j + 1] = temp;
                }
            }
        }
    }
    
    // Mencari mahasiswa berdasarkan NIM menggunakan Linear Search
    public void cariMahasiswaNIM(String nim) {
        boolean ditemukan = false;
        
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            if (daftarMahasiswa[i].nim.equals(nim)) {
                System.out.println("Mahasiswa Ditemukan: NIM: " + daftarMahasiswa[i].nim + 
                                  " | Nama: " + daftarMahasiswa[i].nama + 
                                  " | Prodi: " + daftarMahasiswa[i].prodi);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan!");
        }
    }
}