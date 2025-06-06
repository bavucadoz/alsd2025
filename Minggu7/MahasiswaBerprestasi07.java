package Minggu7;

public class MahasiswaBerprestasi07 {
    Mahasiswa07 [] listMhs;
    int idx;

    public MahasiswaBerprestasi07(int jumMhs){
        listMhs = new Mahasiswa07[jumMhs];
        idx=0;
    }

    void tambah (Mahasiswa07 m){
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil (){
        for (int i=0; i<idx; i++){
            listMhs[i].tampilInformasi();
            System.out.println("-----------------------------------");
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK : " + x + " ditemukan pada index " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t: " + listMhs[pos].nim);
            System.out.println("Nama\t: " + listMhs[pos].nama);
            System.out.println("Kelas\t: " + listMhs[pos].kelas);
            System.out.println("IPK\t: " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (listMhs[mid].ipk < cari) {      //sebelumnya (listMhs[mid].ipk > cari), dibalikkan
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
