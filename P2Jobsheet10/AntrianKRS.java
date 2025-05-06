package P2Jobsheet10;

public class AntrianKRS {
    MahasiswaKRS[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new MahasiswaKRS[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void lihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("2 Mahasiswa terdepan: ");
            for (int i = 0; i < 2 && i < size; i++) {
                int index = (front + i) % max;
                data[index].tampilkanData();
            }
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling akhir: ");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void tambahAntrian(MahasiswaKRS mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk ke antrian.");
    }

    public MahasiswaKRS[] layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        MahasiswaKRS[] dilayani = new MahasiswaKRS[2];
        dilayani[0] = data[front];
        dilayani[1] = data[(front + 1) % max];
        front = (front + 2) % max;
        size -= 2;
        return dilayani;
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahYangSudahDiproses() {
        return (max - size);
    }

    public int getJumlahYangBelumDiproses() {
        return (30-size);
    }
}