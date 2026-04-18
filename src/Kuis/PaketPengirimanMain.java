package Kuis;

public class PaketPengirimanMain {
    public static void main(String[] args) {

        PaketPengiriman03[] arrayPaketPengiriman = new PaketPengiriman03[3]; //deklarasi objek arrayPaketPengiriman
        arrayPaketPengiriman[0] = new PaketPengiriman03(); //deklarasi array
        arrayPaketPengiriman[0].nomorResi = "1987923";  //proses pengisian atribut arrayPaketPengiriman indeks 0
        arrayPaketPengiriman[0].berat = 4;
        arrayPaketPengiriman[0].ongkosDasar = 20000;

        arrayPaketPengiriman[1] = new PaketPengiriman03(); //deklarasi array
        arrayPaketPengiriman[1].nomorResi = "2089628"; //proses pengisian atribut arrayPaketPengiriman indeks 1
        arrayPaketPengiriman[1].berat = 12;
        arrayPaketPengiriman[1].ongkosDasar = 20000;

        arrayPaketPengiriman[2] = new PaketPengiriman03(); //deklarasi array
        arrayPaketPengiriman[2].nomorResi = "897573"; //proses pengisian atribut arrayPaketPengiriman indeks 2
        arrayPaketPengiriman[2].berat = 13;
        arrayPaketPengiriman[2].ongkosDasar = 20000;

        arrayPaketPengiriman [0].printData();
        for (int i = 0; i < arrayPaketPengiriman.length; i++) { //perulangan untuk menampilkan data dari setiap atribut
            System.out.println("Nomor Resi : "+arrayPaketPengiriman[i].nomorResi);
            System.out.println("Berat : "+arrayPaketPengiriman [i].berat);
            System.out.println("Ongkos Dasar : "+arrayPaketPengiriman [i].ongkosDasar); // untuk menampilkan data dari setiap arrayPaketPengiriman

        }
    }

}
