package Pertemuan12;

public class AntrianMahasiswa07 {
    private Mahasiswa07Tugas front, rear;
    private int size;

    public AntrianMahasiswa07() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(String nama, String nim) {
        Mahasiswa07Tugas baru = new Mahasiswa07Tugas(nama, nim);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil mahasiswa.");
        } else {
            System.out.println("Memanggil mahasiswa: " + front.nama + " (" + front.nim + ")");
            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa terdepan: " + front.nama + " (" + front.nim + ")");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa paling akhir: " + rear.nama + " (" + rear.nim + ")");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            Mahasiswa07Tugas current = front;
            while (current != null) {
                System.out.println(current.nama + " (" + current.nim + ")");
                current = current.next;
            }
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int getSize() {
        return size;
    }
}