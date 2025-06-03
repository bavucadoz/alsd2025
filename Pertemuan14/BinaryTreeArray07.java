package Pertemuan14;

public class BinaryTreeArray07 {
    Mahasiswa07[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray07() {
        this.dataMahasiswa = new Mahasiswa07[10]; 
    }

    void populateData (Mahasiswa07 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); 
                dataMahasiswa[idxStart].tampilInformasi(); 
                traverseInOrder(2 * idxStart + 2); 
            }
        }
    }

    void add(Mahasiswa07 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Tree sudah penuh");
        }
    }
    
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 1);  
                traverseInOrder(2 * idxStart + 2); 
            }
        }
    }
}