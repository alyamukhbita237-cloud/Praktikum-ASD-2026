package P5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner alya = new Scanner  (System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = alya.nextInt();

        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke- "+(i+1)+": ");
            sm.keuntungan[i] = alya.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruterforce: "+ sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
    
}
