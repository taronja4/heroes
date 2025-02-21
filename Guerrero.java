import java.util.ArrayList;

public class Guerrero extends heroes{
    int fuerza;

    public Guerrero(String nombre, int nivel, int HP, ArrayList<arma> arma, int fuerza) {
        super(nombre, nivel, HP, arma);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", HP=" + HP +
                ", fuerza=" + fuerza +
                ", arma=" + arma +
                '}';
    }
}
