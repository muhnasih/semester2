
public class Limas {
    double sisiAlas;
    double tinggi;

    Limas(double sisiAlas, double tinggi) {
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
    }

    double hitungLuasPermukaan() {
        return sisiAlas * sisiAlas + 4 * (0.5 * sisiAlas * Math.sqrt((sisiAlas / 2) * (sisiAlas / 2) + tinggi * tinggi));
    }

    double hitungVolume() {
        return (1.0 / 3.0) * sisiAlas * sisiAlas * tinggi;
    }
}
