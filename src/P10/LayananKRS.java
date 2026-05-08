package P10;

import java.util.Scanner;

public class LayananKRS {
    public static void main(String[] args) {
        Scanner alya = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== ANTRIAN PERSETUJUAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Belakang");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Jumlah Sudah Proses KRS");
            System.out.println("8. Jumlah Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = alya.nextInt();
            alya.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = alya.nextLine();
                    System.out.print("Nama  : ");
                    String nama = alya.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = alya.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = alya.nextLine();
                    MahasiswaKRS03 mhs = new MahasiswaKRS03(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2: 
                    antrian.dequeue2();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihat2Terdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    antrian.jumlahDiproses();
                    break;
                case 8:
                    antrian.belumProses();
                    break;
                case 9:
                    antrian.clear();
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid.");
            }
        } while (pilihan != 0);
    }
    
}
