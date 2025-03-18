package Praktikum05;

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

    void bubbleSort(){
        for (int i=0; i<listMhs.length-1; i++){
            for (int j=1; j<listMhs.length-i; j++){
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa07 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
}
