package P3;

public class Matakuliah03 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah03() {

    }

    public Matakuliah03(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(String kd, String nm, int sks, int jam) {
        kode = kd;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }

    void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         :" + sks);
        System.out.println("Jumlah jam  : " + jumlahJam);
    }

}
