public class Mahasiswa {
    private String nim;
    private String nama;
    private String nomorTelepon;

    public Mahasiswa(String nim, String nama, String nomorTelepon) {
        this.nim = nim;
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Nomor Telepon: " + nomorTelepon;
    }
}