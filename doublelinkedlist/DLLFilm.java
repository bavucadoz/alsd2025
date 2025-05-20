package doublelinkedlist;
public class DLLFilm {
    NodeFilm head;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Film data) {
        if (isEmpty()) {
            head = new NodeFilm(null, data, null);
        } else {
            NodeFilm newNode = new NodeFilm(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            NodeFilm current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeFilm newNode = new NodeFilm(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film data, int index) throws Exception {
        if (isEmpty()) {
            if (index != 0) {
                throw new Exception("Nilai indeks di luar batas");
            }
            addFirst(data);
            return;
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }
    
        if (index == 0) {
            addFirst(data);
            return;
        }
    
        NodeFilm current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
    
        if (current != null && current.prev != null) {
            NodeFilm newNode = new NodeFilm(current.prev, data, current);
            current.prev.next = newNode;
            current.prev = newNode;
        } else if (current != null && current.prev == null) {
            NodeFilm newNode = new NodeFilm(null, data, current);
            current.prev = newNode;
            head = newNode;
        } else { 
            addLast(data);
            return;
        }
    
        size++;
    }    

    public void removeFirst() throws Exception {
        if (isEmpty()) throw new Exception("Linked List kosong");
        head = head.next;
        if (head != null) head.prev = null;
        size--;
    }

    public void removeLast() throws Exception {
        if (isEmpty()) throw new Exception("Linked List kosong");
        if (head.next == null) {
            head = null;
        } else {
            NodeFilm current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    public void remove(int index) throws Exception {
        if (index < 0 || index >= size) throw new Exception("Indeks tidak valid!");
        if (index == 0) {
            removeFirst();
            return;
        }

        NodeFilm current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        if (current.next == null) {
            current.prev.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    public void print() {
        System.out.println("\nCetak Data");
        NodeFilm current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int indexOf(int idFilm) {
        NodeFilm current = head;
        int index = 0;
        while (current != null) {
            if (current.data.id == idFilm) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public void searchById(int idFilm) {
        System.out.println("Cari Data");
        int idx = indexOf(idFilm);
        if (idx == -1) {
            System.out.println("Data ID Film tidak ditemukan.");
        } else {
            NodeFilm current = head;
            for (int i = 0; i < idx; i++) {
                current = current.next;
            }
            System.out.println("Data ID Film: " + idFilm + " berada di node ke- " + (idx + 1));
            System.out.println("IDENTITAS:");
            System.out.println(current.data);
        }
    }

    public void sortByRatingDesc() {
        if (head == null || head.next == null) return;
        NodeFilm current = head;
        while (current != null) {
            NodeFilm max = current;
            NodeFilm temp = current.next;
            while (temp != null) {
                if (temp.data.rating > max.data.rating) {
                    max = temp;
                }
                temp = temp.next;
            }

            if (max != current) {
                Film tempData = current.data;
                current.data = max.data;
                max.data = tempData;
            }

            current = current.next;
        }
        System.out.println("Berhasil mengurutkan rating secara descending.");
    }
}