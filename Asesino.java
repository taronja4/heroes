import java.util.ArrayList;

public class Asesino extends heroes {

    int sigilo;

    public Asesino(String nombre, int nivel, int HP, ArrayList<arma> arma, int sigilo) {
        super(nombre, nivel, HP, arma);
        this.sigilo = sigilo;
    }

    public int getSigilo() {
        return sigilo;
    }

    @Override
    public String toString() {
        return "Asesino{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", HP=" + HP +
                ", sigilo=" + sigilo +
                ", arma=" + arma +
                '}';
    }
}
