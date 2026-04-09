package P6;

import java.util.Scanner;

public class DosenMain03 {
    public static void main(String[] args) {
        Scanner alya = new Scanner(System.in);
        DataDosen03 list = new DataDosen03();
        int pilihMenu;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("5. Insertion Sort");
            System.out.println("0. Keluar");
            System.out.println();
            System.out.print("Pilih: ");
            pilihMenu = alya.nextInt();
            alya.nextLine();

            if (pilihMenu == 1) {
                System.out.print("Kode : ");
                String kd = alya.nextLine();

                System.out.print("Nama : ");
                String nama = alya.nextLine();

                System.out.print("Jenis Kelamin Laki-Laki? (Y/N) : ");
                char jkInput = alya.next().charAt(0);
                boolean jk = (jkInput == 'Y' || jkInput == 'y');

                System.out.print("Usia : ");
                int usia = alya.nextInt();
                alya.nextLine();

                Dosen03 d = new Dosen03(kd, nama, jk, usia);
                list.tambah(d);

            } else if (pilihMenu == 2) {
                list.tampil();

            } else if (pilihMenu == 3) {
                System.out.println("Data diurutkan ASC");
                list.SortingASC();
                list.tampil();

            } else if (pilihMenu == 4) {
                System.out.println("Data diurutkan DSC");
                list.SortingDSC();
                list.tampil();

            } else if (pilihMenu == 5) {
                System.out.println("Data diurutkan Insertion");
                list.insertionSort();
                list.tampil();
                

            } else if (pilihMenu == 0) {
                System.out.println("Keluar Program ! ");

            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihMenu != 0);

    }

}
