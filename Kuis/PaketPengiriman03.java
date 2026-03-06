package Kuis;

import P1.array;

public class PaketPengiriman03 {
    String nomorResi;
    double berat; //atribut dari PaketPengiriman03
    double ongkosDasar;

    double totalOngkos03 (){
        double ongkos = berat*ongkosDasar;
        if (ongkos > 100000) {
            ongkos = ongkos*0.10+ ongkos; //method untuk menghitung diskon yang didapat jika total ongkos kirim lebih dari 100ribu akan mendapatkan diskon sebesar 10%
        }
    return ongkosDasar;
    }

    void rataRata (){
        if (berat > 10) {
            berat++; // method untuk menghitung jumlah paket yang lebih dari 10 kg ada berapa buah
        }
    }

    void printData (){
        System.out.println("Rata-rata ongkos pengiriman yaitu ");
        System.out.println("Paket yang beratnya lebih dari 10 kg "+ berat); //method untuk menampilkan rata rata ongkos pengiriman dan rata rata semua paket yang beratnya lebih dari 10 kg
    }

}
