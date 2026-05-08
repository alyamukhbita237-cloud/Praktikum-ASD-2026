package P11;

import java.util.Scanner;

public class SLLMain03 {
    public static void main(String[] args) {
        Scanner alya = new Scanner(System.in);
        SingleLinkedList sll = new SingleLinkedList();
        int jumlah;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = alya.nextInt();
        alya.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke- " + (i + 1));
            System.out.print("NIM   : ");
            String nim = alya.nextLine();
            System.out.print("Nama  : ");
            String nama = alya.nextLine();
            System.out.print("Kelas : ");
            String kelas = alya.nextLine();
            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(alya.nextLine());

            Mahasiswa03 mhs = new Mahasiswa03(nim, nama, kelas, ipk);
            sll.addLast(mhs);
            sll.print();
        }

        // Mahasiswa03 mhs1 = new Mahasiswa03("24212200", "Alvaro", "1A", 4.0);
        // Mahasiswa03 mhs2 = new Mahasiswa03("23212201", "Bimon", "2B", 3.8);
        // Mahasiswa03 mhs3 = new Mahasiswa03("22212202", "Cintia", "3C", 3.5);
        // Mahasiswa03 mhs4 = new Mahasiswa03("21212203", "Dirga", "4D", 3.6);

        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print();
    }

}
