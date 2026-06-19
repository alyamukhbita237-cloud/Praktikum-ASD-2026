package P16.TugasPraktikum;

import P5.Mahasiswa;

public class Nilai03 {
    Mahasiswa03 mahasiswa;
    MataKuliah03 mataKuliah;
    double nilai;

    public Nilai03(Mahasiswa03 mahasiswa, MataKuliah03 mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return mahasiswa.nama + " | "
                + mataKuliah.namaMK + " | "
                + nilai;
    }
}
