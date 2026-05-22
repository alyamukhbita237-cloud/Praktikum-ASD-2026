package P12.CM2;

import P12.Node03;

public class DLLPembeli03 {
    NodePembeli03 head;
    NodePembeli03 tail;
    int nomorAntrian = 1;

    public DLLPembeli03() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli03 data){
        NodePembeli03 newNode = new NodePembeli03(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void cetakAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        NodePembeli03 current = head;

        System.out.println("=============================================");
        System.out.println("\tDaftar Antrian Pembeli");
        System.out.println("=============================================");
        System.out.println("No Antrian \t Nama \t No HP");

        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public Pembeli03 hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        }

        Pembeli03 deleted = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return deleted;
    }



    


    
}
