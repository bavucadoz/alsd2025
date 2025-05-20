package doublelinkedlist;

public class VaksinNode {
    int nomor;
    String nama;
    VaksinNode prev, next;

    VaksinNode(int nomor, String nama) {
        this.prev = null;
        this.nomor = nomor;
        this.nama = nama;
        this.next = null;
    }
}

