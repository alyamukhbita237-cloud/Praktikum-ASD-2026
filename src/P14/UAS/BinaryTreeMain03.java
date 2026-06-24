package P14.UAS;

public class BinaryTreeMain03 {
    public static void main(String[] args) {
        BinaryTree03 bst = new BinaryTree03();

        bst.add(new PesertaLomba03("12312", "Alya", "Malang", 90));
        bst.add(new PesertaLomba03("12313", "Athia", "Surabaya", 85));
        bst.add(new PesertaLomba03("12314", "Anisa", "Blitar", 80));
        bst.add(new PesertaLomba03("12315", "Amira", "Pasuruan", 60));
        bst.add(new PesertaLomba03("12316", "Aura", "Jakarta", 65)); // menambahkan data peserta lomba

        System.out.println("=== Data Peserta ===");
        bst.traverseInOrder(bst.root); //memanggil method untuk mengurutkan skor

        System.out.println("\n=== Juara Lomba ===");
        bst.tampilJuara(); // memanggil method untuk menampilkan juara

        System.out.println("\n=== Penerima Penghargaan (Skor > 80) ===");
        bst.tampilPenerimaPenghargaan(); // memanggil method untuk menampilkan penerima penghargaan

        System.out.println("\nJumlah Penerima Penghargaan : "
                + bst.hitungPenerimaPenghargaan()); // memanggil method untuk menghitung jumlah skor yang lebih dari atau sama dengan 80
    }
    
}
