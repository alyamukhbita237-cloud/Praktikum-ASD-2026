package P14.UAS;

public class BinaryTree03 {
    Node03 root;

    public BinaryTree03() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(PesertaLomba03 peserta) { // method ini digunakan untuk menambahkan data peserta lomba
        Node03 newNode = new Node03(peserta);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node03 current = root;
            Node03 parent = null;
            while (true) {
                parent = current;
                if (peserta.skor < current.peserta.skor) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void tampilJuara() { // method ini digunakan untuk menampilkan peserta yang memiliki skor tertinggi
                                // untuk menjadi juara perlombaan
        if (root == null) {
            System.out.println("Tree kosong");
            return;
        }
        Node03 current = root;
        while (current.right != null) {
            current = current.right;
        }
        current.peserta.tampilInformasi();
    }

    public void tampilPenerimaPenghargaan() {
        tampilPenerimaPenghargaan(root);
    }

    public void tampilPenerimaPenghargaan(Node03 node) { // method ini digunakan untuk menampilkan peserta dengan skor
                                                         // lebih dari 80 yang berhak mendapat penghargaan
        if (node != null) {
            tampilPenerimaPenghargaan(node.left);
            if (node.peserta.skor > 80) {
                node.peserta.tampilInformasi();
            }
            tampilPenerimaPenghargaan(node.right);
        }
    }

    public int hitungPenerimaPenghargaan() { // method ini digunakan untuk menghitung peserta yang berhak mendapat
                                             // penghargaan dengan skor lebih dari atau sama dengan 80
        return hitungPenerimaPenghargaan(root);
    }

    int hitungPenerimaPenghargaan(Node03 node) {

        if (node == null) {
            return 0;
        }
        int jumlah = 0;
        if (node.peserta.skor >= 80) {
            jumlah = 1;
        }
        return jumlah
                + hitungPenerimaPenghargaan(node.left)
                + hitungPenerimaPenghargaan(node.right);
    }

    void traverseInOrder(Node03 node) { // untuk mengurutkan skor peserta dari skor yang terkecil
        if (node != null) {
            traverseInOrder(node.left);
            node.peserta.tampilInformasi();
            traverseInOrder(node.right);
        }
    }
}
