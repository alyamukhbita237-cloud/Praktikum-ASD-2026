//package TUGAS1;

import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner alya = new Scanner(System.in);

        String NIM = "";
        int n;

        System.out.print("Masukkan NIM anda : ");
        NIM = alya.nextLine();

        System.out.print("Masukkan 2 digit terakhir NIM anda : ");
        n = alya.nextInt();

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i+" ");
            } else {
                System.out.print("* ");
            }

        }

    }

}
