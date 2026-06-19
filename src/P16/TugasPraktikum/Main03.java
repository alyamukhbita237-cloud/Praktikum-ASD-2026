package P16.TugasPraktikum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import P5.Mahasiswa;

public class Main03 {
    public static void main(String[] args) {
        Scanner alya = new Scanner(System.in);
        ArrayList<Mahasiswa03> daftarMhs = new ArrayList<>();
        ArrayList<MataKuliah03> daftarMK = new ArrayList<>();
        ArrayList<Nilai03> daftarNilai = new ArrayList<>();

        Queue<Mahasiswa03> queueHapus = new LinkedList<>();
        int pilih;

        do {
            System.out.println();
            System.out.println("***********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***********************************************");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tambah Mata Kuliah");
            System.out.println("3. Input Nilai");
            System.out.println("4. Tampil Nilai");
            System.out.println("5. Mencari Nilai Mahasiswa");
            System.out.println("6. Urut Data Nilai");
            System.out.println("7. Hapus Mahasiswa (queue)");
            System.out.println("0. Keluar");
            System.out.println("***********************************************");
            System.out.print("Pilih    : ");
            pilih = alya.nextInt();
            alya.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = alya.nextLine();

                    System.out.print("Nama : ");
                    String nama = alya.nextLine();

                    daftarMhs.add(new Mahasiswa03(nim, nama));
                    System.out.println("Data mahasiswa berhasil ditambah");
                    break;

                case 2:
                    System.out.print("Kode MK : ");
                    String kode = alya.nextLine();

                    System.out.print("Nama MK : ");
                    String mk = alya.nextLine();

                    daftarMK.add(new MataKuliah03(kode, mk));
                    System.out.println("Data mata kuliah berhasil ditambah");
                    break;

                case 3:
                    if (daftarMhs.isEmpty() || daftarMK.isEmpty()) {
                        System.out.println("Data mahasiswa atau mata kuliah masih kosong!");
                        break;
                    }

                    System.out.println("\nDaftar Mahasiswa");
                    for (int i = 0; i < daftarMhs.size(); i++) {
                        System.out.println(i+1 + ". " + daftarMhs.get(i));
                    }

                    System.out.print("Pilih Mahasiswa : ");
                    int idxMhs = alya.nextInt();

                    System.out.println("\nDaftar Mata Kuliah");
                    for (int i = 0; i < daftarMK.size(); i++) {
                        System.out.println(i+1 + ". " + daftarMK.get(i));
                    }

                    System.out.print("Pilih Mata Kuliah : ");
                    int idxMK = alya.nextInt();

                    System.out.print("Nilai : ");
                    double nilai = alya.nextDouble();

                    daftarNilai.add(new Nilai03(daftarMhs.get(idxMhs-1), daftarMK.get(idxMK-1), nilai));

                    System.out.println("Nilai berhasil ditambahkan");
                    break;

                case 4:
                    System.out.println("\n=== DATA NILAI ===");

                    for (Nilai03 n : daftarNilai) {
                        System.out.println(n);
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM : ");
                    String cari = alya.nextLine();

                    boolean ditemukan = false;

                    for (Mahasiswa03 m : daftarMhs) {
                        if (m.nim.equals(cari)) {
                            System.out.println("Data ditemukan");
                            System.out.println(m);
                            ditemukan = true;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;

                case 6:
                    Collections.sort(daftarNilai,
                            Comparator.comparingDouble(n -> n.nilai));

                    System.out.println("Data nilai berhasil diurutkan");

                    for (Nilai03 n : daftarNilai) {
                        System.out.println(n);
                    }
                    break;

                case 7:
                    System.out.print("Masukkan NIM yang akan dihapus : ");
                    String nimHapus = alya.nextLine();

                    for (Mahasiswa03 m : daftarMhs) {
                        if (m.nim.equals(nimHapus)) {
                            queueHapus.offer(m);
                            break;
                        }
                    }

                    if (!queueHapus.isEmpty()) {
                        Mahasiswa03 hapus = queueHapus.poll();
                        daftarMhs.remove(hapus);
                        System.out.println("Mahasiswa berhasil dihapus:");
                        System.out.println(hapus);
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (pilih != 0);

        alya.close();
    }
}
