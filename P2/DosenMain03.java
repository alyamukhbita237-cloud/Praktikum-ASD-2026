package P2;

public class DosenMain03 {
    public static void main(String[] args) {
        Dosen03 dsn1 = new Dosen03();
        dsn1.idDosen = "1945";
        dsn1.nama = "Alya Mukhbita";
        dsn1.statusAktif = false;
        dsn1.tahunBergabung = 2010;
        dsn1.bidangKeahlian = "Matematika";

        dsn1.tampilInformasi();
        dsn1.hitungMasaKerja(2026);
        dsn1.setStatusAktif(true);
        dsn1.ubahKeahlian("Daspro");
        dsn1.tampilInformasi();


        Dosen03 dsn2 = new Dosen03("1809","Muhammad Latif",true,2015,"Kimia");
        dsn2.tampilInformasi();

        dsn2.setStatusAktif(false);
        dsn2.hitungMasaKerja(2025);
        dsn2.ubahKeahlian("Agama");
        dsn2.tampilInformasi();

        Dosen03 dsn3 = new Dosen03("6754","Stepen",true,2013,"Sistem Operasi");
        dsn3.tampilInformasi();
        dsn3.hitungMasaKerja(2026);


        
    }
}
