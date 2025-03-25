package Minggu7;

public class DataDosen07 {
    Dosen07[] dataDosen = new Dosen07[10]; 
    int idx = 0;

    void tambah(Dosen07 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen!");
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    // Bubble Sort (Ascending) berdasarkan usia (termuda ke tertua)
    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen07 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data telah diurutkan secara ASC (termuda ke tertua).");
    }

    // Selection Sort (Descending) berdasarkan usia (tertua ke termuda)
    public void SortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen07 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data telah diurutkan secara DSC (tertua ke termuda).");
    }

    //Pencarian Sequential Search berdasarkan Nama
    void PencarianDataSequential07(String nama) {
        int posisi = 0;
        System.out.println("Hasil pencarian nama " + nama + ":");
        for (int i = 0; i < dataDosen.length; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                posisi++;
            }
        }
        if (posisi == 0) {
            System.out.println("Dosen dengan nama '" + nama + "' tidak ditemukan.");
        } else if (posisi > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama '" + nama + "'.");
        }
    }

    void tampilDataSequential(String nm, int pos) {
        if (pos != -1) {
            System.out.println("Data Dosen dengan nama : " + nm + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data Dosen " + nm + " tidak ditemukan");
        }
    }

    //Pencarian Binary Search berdasarkan Usia
    int PencarianDataBinary07(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == dataDosen[mid].usia) {
                return mid;
            } else if (dataDosen[mid].usia > cari) {     
                return PencarianDataBinary07(cari, left, mid - 1);
            } else {
                return PencarianDataBinary07(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilDataBinary(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data Dosen dengan usia : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Dosen dengan usia " + x + " tidak ditemukan");
        }
    }
}