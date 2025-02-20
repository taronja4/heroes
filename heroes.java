import java.util.ArrayList;
import java.util.Scanner;

public class heroes {
    String nombre;
    int nivel;
    int HP;

    arma arma;
    ArrayList<heroes> hermandad;
    ArrayList<arma> armero=new ArrayList<>();

    public heroes() {

    }

    public heroes(String nombre, int nivel, int HP, arma arma) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.HP = HP;
        this.arma = arma;
        hermandad=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getHP() {
        return HP;
    }

    private int findheroe(heroes xd){
        if (hermandad.contains(xd)){
            return hermandad.indexOf(xd);
        }
        return -1;
    }

    public boolean addHeroe(heroes he){
        if (findheroe(he)<0){
            hermandad.add(he);
            return true;
        }
        return false;
    }

    public boolean removeHeroe(heroes hero){
        if (findheroe(hero)>=0){
            hermandad.remove(hero);
            return true;
        }
        return false;
    }

    public heroes buscarHeroe(String nom){
        for (heroes h:hermandad){
            if (nom.equalsIgnoreCase(h.getNombre())){
                return h;
            }
        }
        return null;
    }

    public void printHeroes(){
        for (heroes herohoes:hermandad){
            System.out.println(herohoes);
        }
    }

    private int findarma(arma xd){
        if (armero.contains(xd)){
            return armero.indexOf(xd);
        }
        return -1;
    }

    public boolean addArma(arma he){
        if (findarma(he)<0){
            armero.add(he);
            return true;
        }
        return false;
    }

    public void printArmas(){
        for (arma ar:armero){
            System.out.println(ar);
        }
    }

    public void tiposHeroe(){
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");
        System.out.println("4. Asesino");
    }

    public heroes insertarHeore(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Que heroe quieres escoger?");
        tiposHeroe();
        int op;
        do {
            System.out.println("Introduce un numero valido");
            op=sc.nextInt();
            sc.nextLine();
        }while (op<1||op>4);
        if (op==1){
            System.out.println("Introduce el nombre del heroe");
            String nom=sc.nextLine();
            System.out.println("Introduce el nivel de tu heroe");
            int niv=sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce los puntos de vida de tu heroe");
            int hp=sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce la fuerza de tu heroe");
            int strg=sc.nextInt();
            sc.nextLine();
            arma pepe=insertarArma();
            heroes he=new Guerrero(nom,niv,hp,pepe,strg);
            return he;
        } else if (op==2){
            System.out.println("Introduce el nombre del heroe");
            String nom=sc.nextLine();
            System.out.println("Introduce el nivel de tu heroe");
            int niv=sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce los puntos de vida de tu heroe");
            int hp=sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce la mana de tu heroe");
            int mana=sc.nextInt();
            sc.nextLine();
            heroes he=new Mago(nom,niv,hp,insertarArma(),mana);
            return he;
        } else if (op==3){
            System.out.println("Introduce el nombre del heroe");
            String nom=sc.nextLine();
            System.out.println("Introduce el nivel de tu heroe");
            int niv=sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce los puntos de vida de tu heroe");
            int hp=sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce la punteria de tu heroe");
            int punt=sc.nextInt();
            sc.nextLine();
            heroes he=new Arquero(nom,niv,hp,insertarArma(),punt);
            return he;
        } else {
            System.out.println("Introduce el nombre del heroe");
            String nom=sc.nextLine();
            System.out.println("Introduce el nivel de tu heroe");
            int niv=sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce los puntos de vida de tu heroe");
            int hp=sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce el sigilo que tiene tu heroe");
            int sigi=sc.nextInt();
            sc.nextLine();
            heroes he=new Asesino(nom,niv,hp,insertarArma(),sigi);
            return he;
        }
    }

    public arma insertarArma(){
        Scanner sc=new Scanner(System.in);
        printArmas();
        System.out.println("Elige el arma que quieras");
        int armeo=sc.nextInt();
        return armero.get(armeo);
    }

    public void menu(){
        System.out.println("0. Salir");
        System.out.println("1. Añadir un nuevo heroe al gremio");
        System.out.println("2. Añadir una nueva arma al arsenal");
        System.out.println("3. Eliminar un heroe");
        System.out.println("4. Buscar heroe por nombre");
        System.out.println("5. Listar todos los heroes del gremio");
    }

    @Override
    public String toString() {
        return "heroes{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", HP=" + HP +
                ", arma=" + arma +
                '}';
    }
}
