package P3;

public class DataDosen03 {

    void dataSemuaDosen(Dosen03[] arrDosen03) {
        int n = 1;
        for (Dosen03 dosen03 : arrDosen03) {
            System.out.println("Data Dosen ke- " + n++);
            System.out.println("Kode          : " + dosen03.kode);
            System.out.println("Nama          : " + dosen03.nama);
            System.out.println("Jenis Kelamin : " + (dosen03.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia          : " + dosen03.usia);
            System.out.println("---------------------------------------------------------");
        }
    }

    void jumlahDosenPerJenisKelamin (Dosen03[]arrDosen03){
        int Lk = 0;
        int wanita = 0;

        for (Dosen03 dosen03 : arrDosen03) {
            if (dosen03.jenisKelamin) {
                Lk++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Laki-laki : "+ Lk);
        System.out.println("Jumlah Dosen Perempuan "+wanita);
    }

    void rerataUsiaDosenPerJenisKelamin (Dosen03 [] arrDosen03){
        int totalLk = 0, totalWanita = 0, Lk = 0, wanita = 0;

        for (Dosen03 dosen03 : arrDosen03) {
            if (dosen03.jenisKelamin) {
                totalLk += dosen03.usia;
                Lk++;
            } else {
                totalWanita += dosen03.usia;
                wanita++;
            }
        }

        System.out.println("Rata-rata usia dosen laki-laki : "+(totalLk/Lk));
        System.out.println("Rata-rata usia dosen wanita : "+(totalWanita/wanita));
    }

    void infoDosenPalingTua(Dosen03[] arrDosen03) {
        Dosen03 tertua = arrDosen03[0];

        for (Dosen03 dosen03 : arrDosen03) {
            if (dosen03.usia > tertua.usia) {
                tertua = dosen03;
            }
        }

        System.out.println("Dosen Paling Tua:");
        System.out.println("Kode : "+tertua.kode);
        System.out.println("Nama : "+tertua.nama);
        System.out.println("Usia : "+tertua.usia);
    }

    void infoDosenPalingMuda(Dosen03[] arrDosen03) {
        Dosen03 termuda = arrDosen03[0];

        for (Dosen03 dosen03 : arrDosen03) {
            if (dosen03.usia < termuda.usia) {
                termuda = dosen03;
            }
        }

        System.out.println("Dosen Paling Muda:");
        System.out.println("Kode : " + termuda.kode);
        System.out.println("Nama : " + termuda.nama);
        System.out.println("Usia : " + termuda.usia);
    }


}
