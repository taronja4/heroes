import java.util.ArrayList;

public class Arquero extends heroes {

    int punteria;

    public Arquero(String nombre, int nivel, int HP, ArrayList<arma> arma, int punteria) {
        super(nombre, nivel, HP, arma);
        this.punteria = punteria;
    }

    public int getPunteria() {
        return punteria;
    }

    @Override
    public String toString() {
        return "Arquero{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", HP=" + HP +
                ", punteria=" + punteria +
                ", arma=" + arma +
                '}';
    }
}
