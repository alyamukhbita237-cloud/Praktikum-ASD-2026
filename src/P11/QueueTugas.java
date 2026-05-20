package P11;

import java.util.Scanner;

public class QueueTugas {
    public static void main(String[] args) {
        Scanner alya = new Scanner (System.in);
        QueueMahasiswa q = new QueueMahasiswa();
        int pilih;

        do {
            System.out.println("\n=================================");
            System.out.println("      MENU ANTRIAN MAHASISWA     ");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Tampilkan Antrian Depan");
            System.out.println("5. Tampilkan Antrian Belakang");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.println("=================================");
            System.out.print("Pilih menu : ");

            pilih = alya.nextInt();
            alya.nextLine();

            switch (pilih) {
                case 1 : 
                    System.out.println("\n--- Tambah Antrian ---");
                    System.out.print("Masukkan NIM  : ");
                    String nim = alya.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = alya.nextLine();
                    
                    q.enqueue(new MahasiswaTugas(nim, nama));
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                    break;
            
                case 2 :
                    System.out.println("\n--- Panggil Antrian ---");
                    q.dequeue();
                    break;
                
                case 3 :
                    System.out.println("\n--- Daftar Antrian ---");
                    q.tampil();
                    break;

                case 4 : 
                    System.out.println("\n--- Antrian Terdepan ---");
                    q.tampilDepan();
                    break;

                case 5 :
                    System.out.println("\n--- Antrian Terakhir ---");
                    q.tampilBelakang();
                    break;

                case 6 :
                    System.out.println("\nJumlah mahasiswa mengantre : "+ q.jumlah());
                    break;

                case 7 :
                    q.clear();
                    System.out.println("\nAntrian berhasil dikosongkan");
                    break;

                case 0 :
                    System.out.println("\nProgram selesai");
                    break;
                default:
                    System.out.println("\nPilihan tidak tersedia");
            }
            
        } while (pilih != 0);
        alya.close();
    }
    
}
