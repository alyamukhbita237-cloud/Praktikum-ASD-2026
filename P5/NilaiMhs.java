package P5;

public class NilaiMhs {
    
    double utsTertinggi(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUts;
        }
        int mid = (l + r) / 2;
        double lmax = utsTertinggi(arr, l, mid);
        double rmax = utsTertinggi(arr, mid + 1, r);
        return Math.max(lmax, rmax);

    }

    double utsTerendah (Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUts;
        }
        int mid = (l + r) / 2;
        double lmin = utsTertinggi(arr, l, mid);
        double rmin = utsTertinggi(arr, mid + 1, r);
        return Math.min(lmin, rmin);

    }

    double rataUas (Mahasiswa[]arr){
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUas;
        }
        double rata = total / arr.length;
        return rata;
    }
}
