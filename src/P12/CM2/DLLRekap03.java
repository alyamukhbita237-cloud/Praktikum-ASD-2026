package P12.CM2;

public class DLLRekap03 {
    NodeRekap03 head;

    public DLLRekap03() {
        head = null;
    }

    public void updateRekap(String namaPesanan) { // method untuk menambah atau mengupdate menu
        NodeRekap03 current = head;
        while (current != null) {
            if (current.data.namaPesanan.equalsIgnoreCase(namaPesanan)) {
                current.data.jumlah++; // jika nama menu ditemukan pada linked list maka node menemukan menu tersebut dan menambahkan jumlahnya sebesar 1
                return;
            }
            current = current.next;
        }

        Rekap03 rekapBaru = new Rekap03(namaPesanan, 1); // jika nama menu belum ada di linked list rekap, maka membuat linked list baru dengan jumlah 1
        NodeRekap03 newNode = new NodeRekap03(rekapBaru);
        if (head == null) {
            head = newNode;
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void sortDescending() { // method untuk mengurutkan menu dengan jumlah pemesanan terbanyak
        if (head == null) return;
        NodeRekap03 i, j;
        for (i = head; i != null; i = i.next) {
            for (j = i.next; j != null; j = j.next) {
                if (i.data.jumlah < j.data.jumlah) {
                    Rekap03 temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    public void tampilRekap() { // method untuk menampilkan hasil rekap tiap menu
        sortDescending();
        System.out.println("=================================");
        System.out.println("\tREKAP MENU PESANAN ");
        System.out.println("=================================");
        System.out.printf("%-20s %s\n", "Nama Menu", "Jumlah");
        NodeRekap03 current = head;
        while (current != null) {
            System.out.printf("%-20s %d\n",
                    current.data.namaPesanan,
                    current.data.jumlah);
            current = current.next;
        }
    }
}
