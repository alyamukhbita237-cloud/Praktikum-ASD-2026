package P12.CM2;

public class Pembeli03 {
    int noAntrian;
    String namaPembeli;
    String NoHp;

    public Pembeli03 (int noAntrian, String namaPembeli, String NoHp){
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.NoHp = NoHp;
    }

    public void tampil() {
        System.out.println(noAntrian + "\t\t" + namaPembeli + "\t\t" + NoHp);
    }
    
}
