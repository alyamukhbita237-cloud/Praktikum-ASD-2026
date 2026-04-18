package CM1;

public class Buku03 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku03(String kodeBuku, String judul, int tahunTerbit){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilBuku(){
        System.out.println("Kode : " + kodeBuku+ " |    Judul Buku: "+ judul + " |      Tahun: "+tahunTerbit);
    }

}
