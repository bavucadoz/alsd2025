package Minggu5;

public class NilaiMahasiswa {
    String nama;
    int nim, tahunMasuk, nilaiUTS, nilaiUAS;

    public NilaiMahasiswa(String nama, int nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Divide and Conquer untuk mencari nilai UTS tertinggi
    public static int utsTertinggi(NilaiMahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lnilaiMax = utsTertinggi(arr, l, mid);
        int rnilaiMax = utsTertinggi(arr, mid + 1, r);
        return Math.max(lnilaiMax, rnilaiMax);
    }

    // Divide and Conquer untuk mencari nilai UTS terendah
    public static int utsTerendah(NilaiMahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lnilaiMin = utsTerendah(arr, l, mid);
        int rnilaiMin = utsTerendah(arr, mid + 1, r);
        return Math.min(lnilaiMin, rnilaiMin);
    }

    // Brute Force untuk menghitung rata-rata nilai UAS
    public static double rataUAS(NilaiMahasiswa[] arr) {
        int total = 0;
        for (NilaiMahasiswa mhs : arr) {
            total += mhs.nilaiUAS;
        }
        return (double) total / arr.length;
    }
}