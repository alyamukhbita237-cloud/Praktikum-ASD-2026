package P3;

import java.util.Scanner;

public class MatakuliahDemo03 {
    public static void main(String[] args) {
        Scanner alya = new Scanner (System.in);
        Matakuliah03 [] arrayOfMataKuliah = new Matakuliah03 [3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke- "+ (i+1));
            System.out.print("Kode      : ");
            kode = alya.nextLine();
            System.out.print("Nama      : ");
            nama = alya.nextLine();
            System.out.print("SKS     : ");
            dummy = alya.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = alya.nextLine();
            jumlahJam = Integer.parseInt (dummy);
            System.out.println("---------------------------------------");

            arrayOfMataKuliah[i] = new Matakuliah03 (kode, nama, sks, jumlahJam);

        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke- "+(i+1));
            System.out.println("Kode        : "+ arrayOfMataKuliah[i].kode);
            System.out.println("Nama        : "+arrayOfMataKuliah [i].nama);
            System.out.println("Sks         : "+arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam  : "+arrayOfMataKuliah[i].jumlahjam);
            System.out.println("---------------------------------------");
        }
    }
    
}
