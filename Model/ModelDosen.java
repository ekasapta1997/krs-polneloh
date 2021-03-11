package Model;
import java.util.ArrayList;

public class ModelDosen extends ModelPerson {
    private String nidn;
    private ArrayList<Matakuliah> listMataKuliahPengampu;
    private Matakuliah MataKuliahPengampu;

    public ModelDosen(String nidn, String nama) {
        this.nidn = nidn;
        this.setNama(nama);
    }

    public void lihatListMataKuliahPengampu() {
        NamaMataKuliah namamatakuliah;
        namamatakuliah.getSks();
        this.listMataKuliahPengampu = NamaMataKuliah.getSemester();
    }

    public void tambahMataKuliahPengampu(Matakuliah matakuliah) {
        System.out.println("Mata Kuliah Pengampu berhasil ditambah");
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }
}
