package P12.CM2;

import java.nio.channels.Pipe.SourceChannel;

public class DLLPesanan03 {
    NodePesanan03 head;
    NodePesanan03 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(Pesanan03 data) {
        NodePesanan03 newNode = new NodePesanan03(tail, data, head);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        NodePesanan03 current = head;

        while (current != null && current.data.namaPesanan.compareToIgnoreCase(data.namaPesanan) < 0) {
            current = current.next;
        }
        if (current == head) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (current == null) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }
    }

    public void tampilLaporan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }
        NodePesanan03 current = head;
        System.out.println("=================================================");
        System.out.println("\tLAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=================================================");
        System.out.println("Kode Pesanan \t Nama Pesanan \t Harga");

        while (current != null) {
            System.out.println(
                current.data.kodePesanan + "\t\t" + 
                current.data.namaPesanan + "\t\t" + 
                current.data.harga
            );
            current = current.next;
        }

    }
}
