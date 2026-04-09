package P7;

import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner alya = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = alya.nextInt();
        alya.nextLine();

        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Mahasiswa ke- "+(i+1));

            System.out.print("NIM   : ");
            String nim = alya.nextLine();

            System.out.print("Nama  : ");
            String nama = alya.nextLine();

            System.out.print("Kelas : ");
            String kelas = alya.nextLine();

            System.out.print("IPK   : ");
            String ipkStr = alya.nextLine();
            double ipk = Double.parseDouble(ipkStr);
            System.out.println("--------------------");

            Mahasiswa03 m = new Mahasiswa03(nim, nama, kelas, ipk);
            list.tambah(m);
        }

            list.tampil();
            System.out.println("------------------------------------");
            System.out.println("Pencarian data");
            System.out.println("------------------------------------");
            System.out.println("masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK : ");
            String strCari = alya.nextLine();
            double cari = Double.parseDouble(strCari);

            //melakukan pencarian data sequential
            System.out.println("----------------------------------");
            System.out.println("menggunakan sequential searching");
            System.out.println("----------------------------------");
            double posisi = list.sequentialSearching(cari);
            int pss = (int)posisi;
            list.tampilPosisi(cari, pss);
            list.tampilDataSearch(cari, pss);

            //melakukan pencarian data Binary
            System.out.println("----------------------------------");
            System.out.println("menggunakan binary search");
            System.out.println("----------------------------------");
            double posisi2 = list.findBinarySearch(cari, 0, n-1);
            int pss2 = (int)posisi2;
            list.tampilPosisi(cari, pss2);
            list.tampilDataSearch(cari, pss2);
                       
        // Mahasiswa03 m1 = new Mahasiswa03("123","Zidan","2A",3.2);
        // Mahasiswa03 m2 = new Mahasiswa03("124", "Ayu", "2A", 3.5);
        // Mahasiswa03 m3 = new Mahasiswa03("125", "Sofi", "2A", 3.1);
        // Mahasiswa03 m4 = new Mahasiswa03("126", "Sita", "2A", 3.9);
        // Mahasiswa03 m5 = new Mahasiswa03("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();    

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSortDescending();
        list.tampil();
    }
    
}
