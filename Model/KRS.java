package Model;

import java.util.ArrayList;

public class KRS {
    private String noKRS;
    private ArrayList<Matakuliah> paketMataKuliah;

    public KRS(String noKRS) {
        this.noKRS = noKRS;
    }

    public void tambahMataKuliahKRS(Matakuliah matakuliah) {

    }

    public void showMataKuliahKRS() {
        paketMataKuliah.toString();
    }

    public void setNoKRS(String noKRS) {
        this.noKRS = noKRS;
    }

    public String getNoKRS() {
        return noKRS;
    }
}
