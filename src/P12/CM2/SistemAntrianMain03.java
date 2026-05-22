package P12.CM2;

import java.util.Scanner;

public class SistemAntrianMain03 {
    public static void main(String[] args) {
        Scanner alya = new Scanner(System.in);
        DLLPembeli03 antrian = new DLLPembeli03();
        DLLPesanan03 laporan = new DLLPesanan03();
        int pilihan;

        do {
            System.out.println("=============================================");
            System.out.println("\tSISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=============================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.println("=============================================");
            System.out.print("Pilih Menu : ");
            pilihan = alya.nextInt();
            alya.nextLine();

            switch (pilihan) {
                case 1:
                    antrian.tambahAntrian(new Pembeli03(1, "Ainra", "0822450000"));
                    antrian.tambahAntrian(new Pembeli03(2, "Danra", "0822245111"));
                    antrian.tambahAntrian(new Pembeli03(3, "Sanri", "0822452222"));
                    antrian.tambahAntrian(new Pembeli03(4, "Vania", "0822453333"));
                    System.out.println("Antrian sudah ditambahkan");
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    Pembeli03 p = antrian.hapusAntrian();
                    if (p != null) {
                        System.out.print("Kode Pesanan  : ");
                        int kode = alya.nextInt();
                        alya.nextLine();
                        System.out.print("Nama Pesanan  : ");
                        String namaPesanan = alya.nextLine();
                        System.out.print("Harga         : ");
                        int harga = alya.nextInt();

                        Pesanan03 newPesanan = new Pesanan03(kode, namaPesanan, harga);
                        laporan.tambahPesanan(newPesanan);
                        System.out.println(p.namaPembeli + " telah memesan "+ namaPesanan);
                    }
                    break;
                case 4 :
                    laporan.tampilLaporan();
                    break;
                case 0 :
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilihan != 0);
    }

}
