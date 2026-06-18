package P16;

public class Mahasiswa03 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa03() {
    }

    public Mahasiswa03(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswwa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }

}
