package P14.UAS;

public class PesertaLomba03 {
    String idPeserta;
    String nama;
    String asal;
    double skor;

    public PesertaLomba03(String idPeserta, String nama, String asal, double skor) {
        this.idPeserta = idPeserta;
        this.nama = nama;
        this.asal = asal;
        this.skor = skor;
    }

    public void tampilInformasi() {
        System.out.println(
                "ID Peserta : " + idPeserta +
                " | Nama : " + nama +
                " | Asal : " + asal +
                " | Skor : " + skor);
    }
}
    
