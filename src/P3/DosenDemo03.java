package P3;

import java.util.Scanner;

public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner alya = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen : ");
        int jmlData = alya.nextInt();
        System.out.println();
        alya.nextLine();

        Dosen03[] arrDosen03 = new Dosen03[jmlData];
        String kode, nama;
        Boolean jk;
        int usia;

        for (int i = 0; i < jmlData; i++) {
            System.out.println("Data Dosen ke- " + (i + 1));
            System.out.print("Kode          : ");
            kode = alya.nextLine();
            System.out.print("Nama          : ");
            nama = alya.nextLine();
            System.out.print("Jenis Kelamin  (true = Laki-laki, false = Perempuan) : ");
            jk = alya.nextBoolean();
            System.out.print("Usia          : ");
            usia = alya.nextInt();
            System.out.println("--------------------------------------------------------");
            alya.nextLine();

            arrDosen03[i] = new Dosen03(kode, nama, jk, usia);
        }

        DataDosen03 data = new DataDosen03();

        System.out.println("===== Data Semua Dosen =====");
        data.dataSemuaDosen(arrDosen03);
        System.out.println();

        System.out.println("===== Jumlah Dosen Per Jenis Kelamin =====");
        data.jumlahDosenPerJenisKelamin(arrDosen03);
        System.out.println();

        System.out.println("===== Rata-rata Usia Dosen =====");
        data.rerataUsiaDosenPerJenisKelamin(arrDosen03);
        System.out.println();

        System.out.println("===== Dosen Paling Tua =====");
        data.infoDosenPalingTua(arrDosen03);
        System.out.println();

        System.out.println("===== Dosen Paling Muda =====");
        data.infoDosenPalingMuda(arrDosen03);
        System.out.println();
        
        // int n = 1;
        // for (Dosen03 dosen03 : arrDosen03) {
        // System.out.println("Data Dosen ke- "+n++);
        // System.out.println("Kode : "+dosen03.kode);
        // System.out.println("Nama : "+dosen03.nama);
        // System.out.println("Jenis Kelamin : "+(dosen03.jenisKelamin?
        // "Laki-laki":"Perempuan"));
        // System.out.println("Usia : "+dosen03.usia);
        // System.out.println("---------------------------------------------------------");
        // }
    }

}
