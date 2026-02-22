package P2;

public class MataKuliah03 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah03 (){

    }

    public MataKuliah03 (String kodeMk, String nm, int sks, int jmlJam){
        this.kodeMK = kodeMk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah : "+kodeMK);
        System.out.println("Nama Mata Kuliah : "+nama);
        System.out.println("SKS : "+sks);
        System.out.println("Jumlah jam Mata Kuliah per Minggu : " +jumlahJam);
        System.out.println();
    }

    void ubahSKS (int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi "+sks);
    }

    void tambahJam (int jam){
        jumlahJam += jam;
        System.out.println("Jumlah jam ditambah menjadi "+jumlahJam);
    }

    void kurangiJam (int jam){
        if (jumlahJam > jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berkurang menjadi "+jumlahJam);
        } else {
            System.out.println("Jumlah jam tidak cukup untuk dikurangi!! ");
        }
    }
}
