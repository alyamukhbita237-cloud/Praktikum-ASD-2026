import java.util.Scanner;

public class fungsi {
    static Scanner alya = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = hitungPendapatan(i);
            String status = statusCabang(pendapatan);

            System.out.println("RoyalGarden " + (i+1));
            System.out.println("Pendapatan : Rp "+pendapatan);
            System.out.println("Status :" +status);
            System.out.println();
        }
    }

    static int stokBunga [][] = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static int hargaBunga [] = {75000, 50000, 60000, 10000};

    static int hitungPendapatan (int cabang){
        int total = 0;
        for (int i = 0; i < hargaBunga.length; i++) {
            total += stokBunga [cabang][i]* hargaBunga [i];
        }
        return total;
    }

    static String statusCabang (int pendapatan){
        if (pendapatan > 1500000) {
            return " Sangat Baik ";
        } else {
            return "Perlu Evaluasi";
        }
    }


    
    }

