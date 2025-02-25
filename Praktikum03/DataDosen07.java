package Praktikum03;

public class DataDosen07 {
    public static void dataSemuaDosen(Dosen07[] arrayOfDosen07) {
        for (Dosen07 dosen : arrayOfDosen07) {
            dosen.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen07[] arrayOfDosen07) {
        int wanita = 0, pria = 0;
        for (Dosen07 dosen : arrayOfDosen07) {
            if (dosen.jenisKelamin) {
                wanita++;
            } else {
                pria++;
            }
        }
        System.out.println("Jumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen07[] arrayOfDosen07) {
        int totalUsiaPria = 0, totalUsiaWanita = 0, jumlahPria = 0, jumlahWanita = 0;

        for (Dosen07 dosen : arrayOfDosen07) {
            if (dosen.jenisKelamin) {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            } else {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            }
        }
        double rerataUsiaPria = (double) totalUsiaPria / jumlahPria;
        double rerataUsiaWanita = (double) totalUsiaWanita / jumlahWanita;
        System.out.println("Rerata Usia Dosen Pria: " + rerataUsiaPria);
        System.out.println("Rerata Usia Dosen Wanita: " + rerataUsiaWanita);
    }

    public static void infoDosenPalingTua(Dosen07[] arrayOfDosen07) {
        Dosen07 dosenTua = arrayOfDosen07[0];
        for (Dosen07 dosen : arrayOfDosen07) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        dosenTua.cetakInfo();
    }

    public static void infoDosenPalingMuda(Dosen07[] arrayOfDosen07) {
        Dosen07 dosenMuda = arrayOfDosen07[0];
        for (Dosen07 dosen : arrayOfDosen07) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        dosenMuda.cetakInfo();
    }
}