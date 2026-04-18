package CM1;

public class Peminjaman03 {
    Mahasiswa03 mhs;
    Buku03 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;
    boolean isCanceled;

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
            } if (denda > 20000) { // jawaban sesi 4a modifikasi program hitung denda jika denda lebih dari 20ribu maka otomasis menjadi 20000
                denda = 20000;
            }
        }
    }

    void tampilPeminjaman() {
        if (isCanceled == false) { // jawaban sesi 4b modifikasi program untuk menampilkan isCanceled == false
            System.out.println(mhs.nama + "|" + buku.judul + "| Lama: " + lamaPinjam + "| Terlambat: " + terlambat
                + "| Denda: " + denda);
        }

    }

}
