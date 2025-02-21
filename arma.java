import java.util.ArrayList;

public class arma {
    String nombre;
    int danyo;


    public arma(String nombre, int danyo) {
        this.nombre = nombre;
        this.danyo = danyo;
    }

    public arma() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getDanyo() {
        return danyo;
    }

    @Override
    public String toString() {
        return nombre + '\'' +
                        ", danyo=" + danyo ;
    }
}
