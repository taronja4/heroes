public class Arquero extends heroes {

    int punteria;

    public Arquero(String nombre, int nivel, int HP, arma arma, int punteria) {
        super(nombre, nivel, HP, arma);
        this.punteria = punteria;
    }

    public int getPunteria() {
        return punteria;
    }

    @Override
    public String toString() {
        return "Arquero{" +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", HP=" + HP +
                ",punteria=" + punteria +
                '}';
    }
}
