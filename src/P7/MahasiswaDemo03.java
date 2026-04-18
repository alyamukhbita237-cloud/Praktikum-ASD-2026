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
            System.out.println("Masukkan Data Mahasiswa ke- " + (i + 1));

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

        // melakukan pencarian data sequential
        System.out.println("----------------------------------");
        System.out.println("menggunakan sequential searching");
        System.out.println("----------------------------------");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // melakukan pencarian data Binary
        System.out.println("----------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("----------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, n - 1);
        int pss2 = (int) posisi2;
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
    // ini diganti
    // Mahasiswa03[] listMhs = new Mahasiswa03[3];
    // Mahasiswa03 m1 = new Mahasiswa03("22001", "Andi", "Teknik Informatika");
    // ...

    // jadi ini
    // System.out.print("Masukkan jumlah mahasiswa: ");
    // int jmlMhs = alya.nextInt();
    // alya.nextLine();

    // Mahasiswa03[] listMhs = new Mahasiswa03[jmlMhs];

    // for (int i = 0; i < jmlMhs; i++) {
    // System.out.println("Data Mahasiswa ke-" + (i + 1));
    // System.out.print("NIM: ");
    // String nim = alya.nextLine();
    // System.out.print("Nama: ");
    // String nama = alya.nextLine();
    // System.out.print("Prodi: ");
    // String prodi = alya.nextLine();

    // listMhs[i] = new Mahasiswa03(nim, nama, prodi);
    // }

    // System.out.print("Masukkan jumlah buku: ");
    // int jmlBuku = alya.nextInt();
    // alya.nextLine();

    // Buku03[] listBuku = new Buku03[jmlBuku];

    // for (int i = 0; i < jmlBuku; i++) {
    // System.out.println("Data Buku ke-" + (i + 1));
    // System.out.print("Kode Buku: ");
    // String kode = alya.nextLine();
    // System.out.print("Judul: ");
    // String judul = alya.nextLine();
    // System.out.print("Tahun: ");
    // int tahun = alya.nextInt();
    // alya.nextLine();

    // listBuku[i] = new Buku03(kode, judul, tahun);
    // }

    // System.out.print("Masukkan jumlah peminjaman: ");
    // int jmlPinjam = alya.nextInt();
    // alya.nextLine();

    // Peminjaman03[] dataPeminjaman = new Peminjaman03[jmlPinjam];

    // for (int i = 0; i < jmlPinjam; i++) {
    // System.out.println("Data Peminjaman ke-" + (i + 1));

    // // tampilkan mahasiswa
    // System.out.println("Pilih Mahasiswa:");
    // for (int j = 0; j < listMhs.length; j++) {
    // System.out.print(j + ". ");
    // listMhs[j].tampilMahasiswa();
    // }
    // System.out.print("Pilih index mahasiswa: ");
    // int idxMhs = alya.nextInt();

    // // tampilkan buku
    // System.out.println("Pilih Buku:");
    // for (int j = 0; j < listBuku.length; j++) {
    // System.out.print(j + ". ");
    // listBuku[j].tampilBuku();
    // }
    // System.out.print("Pilih index buku: ");
    // int idxBuku = alya.nextInt();

    // System.out.print("Lama pinjam (hari): ");
    // int lama = alya.nextInt();
    // alya.nextLine();

    // dataPeminjaman[i] = new Peminjaman03(listMhs[idxMhs], listBuku[idxBuku],
    // lama);
    // }

}
