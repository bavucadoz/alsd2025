package doublelinkedlist;

public class DLLAntrianVaksin {
    VaksinNode head, tail;
    int totalAntrian = 0;

    void tambahData(int nomor, String nama) {
        VaksinNode newNode = new VaksinNode(nomor, nama);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        totalAntrian++;
    }

    void hapusData() {
        if (head == null) {
            System.out.println("Tidak ada data antrian!");
            return;
        }
        System.out.println(head.nama + " telah selesai divaksinasi.");
        head = head.next;
        if (head != null)
            head.prev = null;
        else
            tail = null;
        totalAntrian--;
    }

    void tampilkanData() {
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.printf("|%-5s|%-15s|\n", "No.", "Nama");
        VaksinNode current = head;
        while (current != null) {
            System.out.printf("|%-5s|%-15s|\n", current.nomor, current.nama);
            current = current.next;
        }
        System.out.println("Sisa Antrian: " + totalAntrian);
    }
}
