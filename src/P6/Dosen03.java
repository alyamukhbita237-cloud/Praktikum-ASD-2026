package P6;

public class Dosen03 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen03(){

    }

    Dosen03(String kd, String name, Boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode: "+kode);
        System.out.println("Nama: "+nama);
        System.out.println("Jenis Kelamin Laki-laki ? : "+ jenisKelamin);
        System.out.println("Usia: "+usia);
    }
}
