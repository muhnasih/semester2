package latihan1;

public class kerucut {
    
        double jariJari;
        double sisiMiring;
    
        kerucut(double jariJari, double sisiMiring) {
            this.jariJari = jariJari;
            this.sisiMiring = sisiMiring;
        }
            double hitungLuasPermukaan() {
                return Math.PI * jariJari * (jariJari + sisiMiring);
            
            }
            double hitungVolume() {
                return (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;
            
        }

        }
    