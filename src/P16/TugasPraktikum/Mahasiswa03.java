package P16.TugasPraktikum;

public class Mahasiswa03 {
    String nim;
    String nama;

    public Mahasiswa03(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return nim + " - " + nama;
    }
}
