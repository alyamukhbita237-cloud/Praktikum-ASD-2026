package CM1;

public class Mahasiswa03 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa03 [] listMhs = new Mahasiswa03[3];
    int idx;
    
    Mahasiswa03(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
        System.out.println("NIM: "+nim + " |  "+"Nama: "+nama + "   |   "+ "Prodi: "+prodi);
    }
    
}
