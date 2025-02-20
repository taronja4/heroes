public class Mago extends heroes{

    int mana;


    public Mago(String nombre, int nivel, int HP, arma arma, int mana) {
        super(nombre, nivel, HP, arma);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return "Mago{" +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", HP=" + HP +
                ",mana=" + mana +
                '}';
    }
}
