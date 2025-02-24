package Praktikum03;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Mahasiswa07[] arrayOfMahasiswa07 = new Mahasiswa07[3];
        arrayOfMahasiswa07[0] = new Mahasiswa07();
        arrayOfMahasiswa07[0].nim = "244107060033";
        arrayOfMahasiswa07[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa07[0].kelas = "SIB-1E";
        arrayOfMahasiswa07[0].ipk = (float) 3.75;

        arrayOfMahasiswa07[1] = new Mahasiswa07();
        arrayOfMahasiswa07[1].nim = "2341720172";
        arrayOfMahasiswa07[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa07[1].kelas = "TI-2A";
        arrayOfMahasiswa07[1].ipk = (float) 3.36;

        arrayOfMahasiswa07[2] = new Mahasiswa07();
        arrayOfMahasiswa07[2].nim = "244107023006";
        arrayOfMahasiswa07[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa07[2].kelas = "TI-2E";
        arrayOfMahasiswa07[2].ipk = (float) 3.80;

        System.out.println("NIM      : "+ arrayOfMahasiswa07[0].nim);
        System.out.println("Nama     : "+ arrayOfMahasiswa07[0].nama);
        System.out.println("Kelas    : "+ arrayOfMahasiswa07[0].kelas);
        System.out.println("IPK      : "+ arrayOfMahasiswa07[0].ipk);
        System.out.println("---------------------------------------");
        System.out.println("NIM      : "+ arrayOfMahasiswa07[1].nim);
        System.out.println("Nama     : "+ arrayOfMahasiswa07[1].nama);
        System.out.println("Kelas    : "+ arrayOfMahasiswa07[1].kelas);
        System.out.println("IPK      : "+ arrayOfMahasiswa07[1].ipk);
        System.out.println("---------------------------------------");
        System.out.println("NIM      : "+ arrayOfMahasiswa07[2].nim);
        System.out.println("Nama     : "+ arrayOfMahasiswa07[2].nama);
        System.out.println("Kelas    : "+ arrayOfMahasiswa07[2].kelas);
        System.out.println("IPK      : "+ arrayOfMahasiswa07[2].ipk);
        System.out.println("---------------------------------------");
    }
}
