import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner alya = new Scanner (System.in);

        String [] kode = { "A","B","D","E","F","G","H","L","N","T"};

        String [][] kota = {
            {"S","e","r","a","n","g"},
            {"J","a","k","a","r","t","a"},
            {"B","a","n","d","u","n","g"},
            {"C","i","r","e","b","o","n"},
            {"B","o","g","o","r"},
            {"S","e","m","a","r","a","n","g"},
            {"S","e","m","a","r","a","n","g"},
            {"S","u","r","a","b","a","y","a"},
            {"M","a","l","a","n","g"},
            {"S","i","d","o","a","r","j","o"}
        };

        System.out.print("Masukkan kode plat nomor: ");
        String cariKode = alya.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < kode.length; i++) {
            if (cariKode.equalsIgnoreCase(kode[i])) {
                System.out.print("Nama Kota : ");
                for (int j = 0; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
