package Model;

public class Matakuliah {
    private String namaMataKuliah;
    private Integer sks, semester;
    private ModelDosen pengampu;

    public Matakuliah(String namaMataKuliah, Integer sks) {
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }

    public Integer getSks() {
        return sks;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setPengampu(ModelDosen pengampu) {
        this.pengampu = pengampu;
    }

    public ModelDosen getPengampu() {
        return pengampu;
    }

    public void showMataKuliah() {

    }

}
