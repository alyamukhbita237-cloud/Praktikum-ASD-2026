package P11;

public class QueueMahasiswa {
    NodeTugas front, rear;
    int size = 0;

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return false;
    }

    void clear() {
        front = rear = null;
        size = 0;
    }

    void enqueue(MahasiswaTugas data) {
        NodeTugas baru = new NodeTugas(data);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Dipanggil : ");
        front.data.tampil();
        front = front.next;
        size--;
        if (front == null) {
            rear = null;
        }
    }

    void tampil() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        NodeTugas temp = front;
        while (temp != null) {
            temp.data.tampil();
            temp = temp.next;
        }
    }

    void tampilDepan() {
        front.data.tampil();
    }

    void tampilBelakang() {
        rear.data.tampil();
    }

    int jumlah() {
        return size;
    }
}
