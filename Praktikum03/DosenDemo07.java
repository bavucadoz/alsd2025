package Praktikum03;
import java.util.Scanner;
public class DosenDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Dosen: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());
        Dosen07[] arrayOfDosen07 = new Dosen07[jumlahDosen];

        for (int i=0; i < jumlahDosen; i++) {
            arrayOfDosen07[i] = new Dosen07();
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode Dosen                                         : ");
            arrayOfDosen07[i].kode = sc.nextLine();
            System.out.print("Nama Dosen                                         : ");
            arrayOfDosen07[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true untuk wanita, false untuk pria): "); 
            arrayOfDosen07[i].jenisKelamin = sc.nextBoolean();
            System.out.print("Usia                                               : ");
            arrayOfDosen07[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------------");
        }

        for (int i=0; i < jumlahDosen; i++) {
            System.out.println("Data Dosen ke-" + (i+1));
            arrayOfDosen07[i].cetakInfo();
        }

        System.out.println("Data Semua Dosen:");
        DataDosen07.dataSemuaDosen(arrayOfDosen07);
        DataDosen07.jumlahDosenPerJenisKelamin(arrayOfDosen07);
        System.out.println("----------------------------------");
        DataDosen07.rerataUsiaDosenPerJenisKelamin(arrayOfDosen07);
        System.out.println("----------------------------------");
        DataDosen07.infoDosenPalingTua(arrayOfDosen07);
        System.out.println("----------------------------------");
        DataDosen07.infoDosenPalingMuda(arrayOfDosen07);
        System.out.println("----------------------------------");

        sc.close();
    }
}
