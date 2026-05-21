package P12;

import java.util.Scanner;

public class DoubleLinkedListMain03 {

    public static Mahasiswa03 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM      : ");
        String nim = scan.nextLine();

        System.out.print("Masukkan Nama     : ");
        String nama = scan.nextLine();

        System.out.print("Masukkan Kelas    : ");
        String kelas = scan.nextLine();

        System.out.print("Masukkan IPK      : ");
        double ipk = Double.parseDouble(scan.nextLine());

        return new Mahasiswa03(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {

        Scanner alya = new Scanner(System.in);
        DoubleLinkedList03 list = new DoubleLinkedList03();
        int pilihan;

        do {
            System.out.println("\n==== MENU DOUBLE LINKED LIST ====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Hapus pada Index");
            System.out.println("7. Hapus Setelah Data Tertentu");
            System.out.println("8. Tampilkan data");
            System.out.println("9. Tampilkan Data Terbalik");
            System.out.println("10. Data Pertama");
            System.out.println("11. Data Terakhir");
            System.out.println("12. Data pada Index");
            System.out.println("13. Jumlah Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = alya.nextInt();
            alya.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa03 mhsAwal = inputMahasiswa(alya);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa03 mhsAkhir = inputMahasiswa(alya);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = alya.nextLine();
                    System.out.println("Masukkan data baru : ");
                    Mahasiswa03 dataBaru = inputMahasiswa(alya);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan index yang akan dihapus: ");
                    int hapusIndex = alya.nextInt();
                    list.remove(hapusIndex);
                    break;
                case 7:
                    System.out.print("Masukkan NIM key: ");
                    String nim = alya.nextLine();
                    list.removeAfter(nim);
                    break;
                case 8:
                    list.print();
                    break;
                case 9:
                    list.printReverse();
                    break;
                case 10:
                    list.getFirst();
                    break;
                case 11:
                    list.getLast();
                    break;
                case 12:
                    System.out.print("Masukkan index: ");
                    int cariIndex = alya.nextInt();
                    list.getIndex(cariIndex);
                    break;
                case 13:
                    System.out.println("Jumlah data = " + list.size());
                    break;
                case 0:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        alya.close();
    }

}
