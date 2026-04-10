package CM1;

public class Peminjaman03 {
    Mahasiswa03 mhs;
    Buku03 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman03(Mahasiswa03 mhs, Buku03 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
            if (terlambat == 0) {
                denda = 0;
            }
        }
    }

    void tampilPeminjaman() {
        System.out.println(mhs.nama + "|" + buku.judul + "| Lama: " + lamaPinjam + "| Terlambat: " + terlambat
                + "| Denda: " + denda);
    }

}
