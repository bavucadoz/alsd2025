package CM02;

public class Antrian {
    private Kendaraan head;
    private Kendaraan tail;

    public Antrian() {
        head = null;
        tail = null;
    }

    // tambah kendaraan
    public void tambahKendaraan(Kendaraan kendaraan) {
        if (tail == null) {
            head = tail = kendaraan;
        } else {
            tail.next = kendaraan;
            tail = kendaraan;
        }
    }

    // tampil Antrian
    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        Kendaraan current = head;
        while (current != null) {
            current.tampilkanInformasi();
            current = current.next;
        }
    }

    // hitung jumlah antrian
    public int hitungJumlahAntrian() {
        int count = 0;
        Kendaraan current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // layani kendaraan
    public Kendaraan layaniKendaraan() {
        if (head == null) {
            return null;
        }
        Kendaraan kendaraan = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return kendaraan;
    }
}