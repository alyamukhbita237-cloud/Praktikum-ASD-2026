package P16.TugasPraktikum;

public class MataKuliah03 {
    String kodeMK;
    String namaMK;

    public MataKuliah03(String kodeMK, String namaMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
    }

    @Override
    public String toString() {
        return kodeMK + " - " + namaMK;
    }

}
