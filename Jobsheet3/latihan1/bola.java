package latihan1;

public class bola {
        double jariJari;
    
        bola(double jariJari) {
            this.jariJari = jariJari;
        }
    
        double hitungLuasPermukaan() {
            return 4 * Math.PI * jariJari * jariJari;
        }
    
        double hitungVolume() {
            return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
        } 
}
