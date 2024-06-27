public class MataKuliah {
    private String kode;
    private String namaMataKuliah;
    private int sks;

    public  MataKuliah(String kode, String namaMataKuliah, int sks) {
        this.kode = kode;
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString() {
        return "Kode: " + kode + ", Nama Mata Kuliah: " + namaMataKuliah + ", SKS: " + sks;
    }
}