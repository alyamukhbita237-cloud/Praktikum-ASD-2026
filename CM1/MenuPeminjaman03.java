package CM1;

import java.util.Scanner;

public class MenuPeminjaman03 {
    public static void main(String[] args) {
        Scanner alya = new Scanner(System.in);
        MenuPeminjaman03 list = new MenuPeminjaman03();

        Mahasiswa03[] listMhs = new Mahasiswa03[3];
        Mahasiswa03 m1 = new Mahasiswa03("22001", "Andi", "Teknik Informatika");
        Mahasiswa03 m2 = new Mahasiswa03("22002", "Budi", "Teknik Informatika");
        Mahasiswa03 m3 = new Mahasiswa03("22003", "Citra", "Sistem Informasi Bisnis");
        listMhs[0] = m1;
        listMhs[1] = m2;
        listMhs[2] = m3;

        Buku03[] listBuku = new Buku03[4];
        Buku03 b1 = new Buku03("B001", "Algoritma", 2020);
        Buku03 b2 = new Buku03("B002", "Basis Data", 2019);
        Buku03 b3 = new Buku03("B003", "Pemrograman", 2021);
        Buku03 b4 = new Buku03("B004", "Fisika", 2024);
        listBuku[0] = b1;
        listBuku[1] = b2;
        listBuku[2] = b3;
        listBuku[3] = b4;

        Peminjaman03[] dataPeminjaman = {
                new Peminjaman03(listMhs[0], listBuku[0], 7),
                new Peminjaman03(listMhs[1], listBuku[1], 3),
                new Peminjaman03(listMhs[2], listBuku[2], 10),
                new Peminjaman03(listMhs[2], listBuku[3], 6),
                new Peminjaman03(listMhs[0], listBuku[1], 4) };
        int pilihMenu;

        do {
            System.out.println(" === SISTEM PEMINJAMAN RUANG BACA JTI === ");
            System.out.println("1. Tampilkan Mahasiswa ");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman ");
            System.out.println("4. Urutkan Berdasarkan Denda ");
            System.out.println("5. Cari Berdasarkan NIM ");
            System.out.println("0. Keluar ");
            System.out.print(" Pilih: ");
            pilihMenu = alya.nextInt();
            System.out.println();
            alya.nextLine();

            if (pilihMenu == 1) {
                System.out.println(" Daftar Mahasiswa:  ");
                for (Mahasiswa03 m : listMhs)
                    m.tampilMahasiswa();
            } else if (pilihMenu == 2) {
                System.out.println(" Daftar Buku : ");
                for (Buku03 b : listBuku) {
                    b.tampilBuku();
                }
            } else if (pilihMenu == 3) {
                System.out.println("Data Peminjaman : ");
                for (Peminjaman03 p : dataPeminjaman) {
                    p.tampilPeminjaman();
                }
            } else if (pilihMenu == 4) {
                for (int i = 1; i < dataPeminjaman.length - 1; i++) {
                    Peminjaman03 temp = dataPeminjaman[i];
                    int j = i - 1;
                    while (j >= 0 && dataPeminjaman[j].denda < temp.denda) {
                        dataPeminjaman[j + 1] = dataPeminjaman[j];
                        j--;
                    }
                    dataPeminjaman[j + 1] = temp;
                }
                System.out.println("Setelah Diurutkan (Denda terbesar): ");
                for (Peminjaman03 p : dataPeminjaman) {
                    p.tampilPeminjaman();
                }
            } else if (pilihMenu == 5){
                System.out.print("Masukkan NIM : ");
                String cariNIM = alya.nextLine();
    
                boolean ketemu = false;

                for (int i = 0; i < dataPeminjaman.length; i++) {
                    if (dataPeminjaman[i].mhs.nim.equals(cariNIM)) {
                        dataPeminjaman[i].tampilPeminjaman();
                        ketemu = true;
                    }
                }
                if (!ketemu) {
                    System.out.println("Data tidak ditemukan!");
                }
            }
        } while(pilihMenu!=0);
    }
}