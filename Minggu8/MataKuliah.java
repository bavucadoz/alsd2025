package Minggu8;
public class MataKuliah {
    
    String kodeMK;
    String namaMK;
    int sks;

    MataKuliah(){
    }

    MataKuliah(String kodeMK, String namaMK, int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilMataKuliah(){
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + namaMK);
        System.out.println("SKS Mata Kuliah : " + sks);
    }
}