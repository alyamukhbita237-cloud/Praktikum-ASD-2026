package P16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {
    List<Mahasiswa03> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa03... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa03 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        Collections.sort(mahasiswas,
                Comparator.comparing(mhs -> mhs.nim));

        return Collections.binarySearch(
                mahasiswas,
                new Mahasiswa03(nim, "", ""),
                Comparator.comparing(mhs -> mhs.nim));
    }

    public void sortAscending() {
        Collections.sort(mahasiswas,
                Comparator.comparing(mhs -> mhs.nim));
    }

    public void sortDescending() {
        Collections.sort(mahasiswas,
                Comparator.comparing((Mahasiswa03 mhs) -> mhs.nim).reversed());
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa03 m = new Mahasiswa03("201234", "Noureen", "021xx1");
        Mahasiswa03 m1 = new Mahasiswa03("201235", "Akhleema", "021xx2");
        Mahasiswa03 m2 = new Mahasiswa03("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();
        // lm.update(lm.linearSearch("201235"), new Mahasiswa03("201235", "Akhleema
        // Lela", "021xx2"));
        lm.update(lm.binarySearch("201235"), new Mahasiswa03("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        System.out.println("\nAscending:");
        lm.sortAscending();
        lm.tampil();

        System.out.println("\nDescending:");
        lm.sortDescending();
        lm.tampil();
    }
}
