package Model;

public class ModelMahasiswa extends ModelPerson {
    private String nim;
    private KRS krs;

    public ModelMahasiswa(String nama, String nim) {
        this.setNama(nama);
        this.nim = nim;
    }

    public void cetakKRS() {
        krs.toString();
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void pilihPaketKRS(KRS krs) {

    }

    public void getKRS() {
        krs.toString();
    }
}
