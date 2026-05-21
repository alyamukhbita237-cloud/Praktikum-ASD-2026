package P12;

import P11.NodeMahasiswa03;

public class DoubleLinkedList03 {
    Node03 head;
    Node03 tail;
    int size;

    public DoubleLinkedList03() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa03 data) {
        Node03 newNode03 = new Node03(data);
        if (isEmpty()) {
            head = tail = newNode03;
        } else {
            newNode03.next = head;
            head.prev = newNode03;
            head = newNode03;
        }
        size++;
    }

    public void addLast(Mahasiswa03 data) {
        Node03 newNode03 = new Node03(data);
        if (isEmpty()) {
            head = tail = newNode03;
        } else {
            tail.next = newNode03;
            newNode03.prev = tail;
            tail = newNode03;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa03 data) {
        Node03 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node03 newNode03 = new Node03(data);

        if (current == tail) {
            newNode03.prev = current;
            current.next = newNode03;
            tail = newNode03;
        } else {
            newNode03.prev = current;
            newNode03.next = current.next;
            current.next.prev = newNode03;
            current.next = newNode03;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node03 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        Node03 deleted = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        System.out.println("Data berhasil dihapus.");
        deleted.data.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        Node03 deleted = tail;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        System.out.println("Data berhasil dihapus.");
        deleted.data.tampil();
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        System.out.println("Data dari tail ke head:");

        Node03 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void add(int index, Mahasiswa03 data) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid!");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        Node03 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        Node03 newNode = new Node03(data);
        current.prev.next = newNode;
        current.prev = newNode;

        size++;
    }

    public void removeAfter(String nim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node03 current = head;

        while (current != null &&
                !current.data.nim.equals(nim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak ada node setelah data tersebut");
            return;
        }

        Node03 deleted = current.next;

        if (deleted == tail) {
            tail = current;
            tail.next = null;
        } else {
            current.next = deleted.next;
            deleted.next.prev = current;
        }

        System.out.println("Data berhasil dihapus:");
        deleted.data.tampil();

        size--;
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        Node03 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Data berhasil dihapus:");
        current.data.tampil();

        size--;
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data pertama:");
        head.data.tampil();
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data terakhir:");
        tail.data.tampil();
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }
        Node03 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada index " + index + ":");
        current.data.tampil();
    }

    public int size() {
        return size;
    }

}
