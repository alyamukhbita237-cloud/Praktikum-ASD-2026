import java.util.Scanner;

public class tugas2 {
    static Scanner alya = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah : ");
        int jmlJadwal = alya.nextInt();
        alya.nextLine();

        String jadwalKuliah[][] = new String[jmlJadwal][4];

        inputJadwal(jadwalKuliah, jmlJadwal);
        tampilJadwal(jadwalKuliah, jmlJadwal);
        cariJadwalHari(jadwalKuliah, jmlJadwal);
        cariSesuaiMatkul(jadwalKuliah, jmlJadwal);
    }

    public static void inputJadwal(String jadwalKuliah[][], int jmlJadwal) {
        for (int i = 0; i < jmlJadwal; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            jadwalKuliah[i][0] = alya.nextLine();

            System.out.print("Ruang : ");
            jadwalKuliah[i][1] = alya.nextLine();

            System.out.print("Hari Kuliah :");
            jadwalKuliah[i][2] = alya.nextLine();

            System.out.print("Jam Kuliah: ");
            jadwalKuliah[i][3] = alya.nextLine();

            System.out.println();
        }
    }

    public static void tampilJadwal(String jadwalKuliah[][], int jmlJadwal) {
        System.out.println("\n=== JADWAL KULIAH ===");
        System.out.println("Mata Kuliah \t\t\t Ruang \t\t Hari \t\t Jam");
        System.out.println("=========================================================");

        for (int i = 0; i < jmlJadwal; i++) {
            System.out.println(jadwalKuliah[i][0] + " \t\t\t" + jadwalKuliah[i][1] + "\t\t " + jadwalKuliah[i][2]
                    + " \t\t" + jadwalKuliah[i][3]);
        }
    }

    public static void cariJadwalHari(String jadwalKuliah[][], int jmlJadwal) {
        System.out.print("Masukkan Hari yang dicari: ");
        String cariHari = alya.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < jmlJadwal; i++) {
            if (jadwalKuliah[i][2].equalsIgnoreCase(cariHari)) {
                System.out.println(jadwalKuliah[i][0] + "\t\t\t" + jadwalKuliah[i][1] + "\t\t" + jadwalKuliah[i][2]
                        + "\t\t" + jadwalKuliah[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut");
        }
    }

    public static void cariSesuaiMatkul(String jadwalKuliah[][], int jmlJadwal) {
        System.out.print("Masukkan Nama Mata Kuliah: ");
        String cariMatkul = alya.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < jmlJadwal; i++) {
            if (jadwalKuliah[i][0].equalsIgnoreCase(cariMatkul)) {
                System.out.println(jadwalKuliah[i][0] + "\t\t\t" + jadwalKuliah[i][1] + "\t\t" + jadwalKuliah[i][2]
                        + "\t\t" + jadwalKuliah[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata Kuliah tidak ditemukan");
        }

    }

}
