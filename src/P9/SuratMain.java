package P9;

import java.util.Scanner;

public class SuratMain {
    public static void main(String[] args) {
        StackSurat03 stack = new StackSurat03(10);
        Scanner alya = new Scanner (System.in);
        int pilih;
        do {
            System.out.println("\nMenu : ");
            System.out.println("1. Masukkan Data Surat");
            System.out.println("2. Memverifikasi Surat");
            System.out.println("3. Melihat Surat Teratas");
            System.out.println("4. Cari Surat Berdasarkan Nama Mahasiswa");
            System.out.print("Pilih : ");
            pilih = alya.nextInt();
            alya.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = alya.nextLine();
                    System.out.print("Nama: ");
                    String nama = alya.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = alya.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = alya.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = alya.nextInt();
                    Surat03 s = new Surat03(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;
                case 2:
                    System.out.println("Verifikasi Surat ");
                    System.out.println("ID Surat\tNama\tKelas\tJenis Izin\tDurasi ");
                    stack.print();
                    break;  
                case 3:
                    Surat03 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir di input pada mahasiswa  " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Cari nama: ");
                    String cari = alya.nextLine();
                    if (stack.cariNama(cari)) {
                        System.out.println("Surat ditemukan!");
                    } else {
                        System.out.println("Surat tidak ditemukan!");
                    }
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid! ");
            }
            
        } while (pilih >= 1 && pilih <= 4);
    }
    
}
