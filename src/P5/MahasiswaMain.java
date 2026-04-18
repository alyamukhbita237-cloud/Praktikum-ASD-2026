package P5;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner alya = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = alya.nextInt();
        alya.nextLine();

        Mahasiswa [] data = new Mahasiswa [jmlMhs];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("\nData Mahasiswa ke- "+(i+1));
            System.out.print("Nama          : ");
            String nama = alya.nextLine();
            System.out.print("NIM           : ");
            String nim = alya.nextLine();
            System.out.print("Tahun Masuk   : ");
            int tahun = alya.nextInt();
            System.out.print("Nilai UTS     : ");
            int uts = alya.nextInt();
            System.out.print("Nilai UAS     : ");
            int uas = alya.nextInt();
            alya.nextLine();

            data[i] = new Mahasiswa(nama, nim, tahun, uts, uas);
        }

        NilaiMhs hitung = new NilaiMhs();

        double maxUTS = hitung.utsTertinggi(data, 0, data.length-1);
        double minUTS = hitung.utsTerendah(data, 0, data.length-1);
        double rataUas = hitung.rataUas(data);

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("UTS Tertinggi : "+maxUTS);
        System.out.println("UTS Terendah : "+minUTS);
        System.out.println("Rata-rata UAS : "+ rataUas);
    }
}
