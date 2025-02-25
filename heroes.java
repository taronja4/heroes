import java.util.ArrayList;
import java.util.Scanner;

public class heroes {
    String nombre;
    int nivel;
    int HP;

    ArrayList<arma> arma=new ArrayList<>();
    ArrayList<heroes> hermandad=new ArrayList<>();;
    ArrayList<arma> armero=new ArrayList<>();

    public heroes() {

    }

    public heroes(String nombre, int nivel, int HP, ArrayList<arma> arma) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.HP = HP;
        this.arma=new ArrayList<>(arma);
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



    public void insertarArmas(){
        if (armero.isEmpty()){
            armero.add(new arma("Espada del caos",80));
            armero.add(new arma("Báculo de la miseria",60));
            armero.add(new arma("Arco de legolas",60));
            armero.add(new arma("Daga de las mil sombras",50));
        }
    }

    public void printArmas(){
        insertarArmas();
        for (arma pep:armero){
            System.out.println(pep);
        }
    }

    public void tiposHeroe(){
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");
        System.out.println("4. Asesino");
    }

    public void insertarHeore(){
        Scanner sc=new Scanner(System.in);
        boolean boo=true;
        System.out.println("Que heroe quieres escoger?");
        tiposHeroe();
        int op;
        do {
            try {
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
                    System.out.println("Cuantas armas quieres que tenga tu heroe?");
                    int armeo=sc.nextInt();
                    sc.nextLine();
                    hermandad.add(new Guerrero(nom,niv,hp,insertarArma(armeo),strg));
                    arma.clear();
                    boo=false;
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
                    System.out.println("Cuantas armas quieres que tenga tu heroe?");
                    int armeo=sc.nextInt();
                    sc.nextLine();
                    hermandad.add(new Mago(nom,niv,hp,insertarArma(armeo),mana));
                    arma.clear();
                    boo=false;
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
                    System.out.println("Cuantas armas quieres que tenga tu heroe?");
                    int armeo=sc.nextInt();
                    sc.nextLine();
                    hermandad.add(new Arquero(nom,niv,hp,insertarArma(armeo),punt));
                    arma.clear();
                    boo=false;
                } else if(op==4) {
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
                    System.out.println("Cuantas armas quieres que tenga tu heroe?");
                    int armeo=sc.nextInt();
                    sc.nextLine();
                    hermandad.add(new Asesino(nom,niv,hp,insertarArma(armeo),sigi));
                    arma.clear();
                    boo=false;
                }
            }catch (Exception e){
                System.out.println("Error");
                sc.nextLine();
            }
        }while (boo);


    }



    public ArrayList<arma> insertarArma(int num){
        int cont=0;
        ArrayList<arma> bienarmeao=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        do {
            printArmas();
            System.out.println("Elige el arma que quieras");
            int armeo=sc.nextInt();
            arma xd=armero.get(armeo-1);
            bienarmeao.add(xd);
            cont++;
        }while (cont<num);
        for (arma pepe:bienarmeao){
            System.out.println(pepe);
        }
        return bienarmeao;
    }

    public void anadirArma(){
        Scanner sc=new Scanner(System.in);
        boolean boo=true;
        insertarArmas();
        do {
            try {
                System.out.println("Introduzca el nombre de la nueva arma");
                String nome=sc.nextLine();
                System.out.println("Introduzca la cantidad de daño que quieres que haga el arma");
                int danyo=sc.nextInt();
                armero.add(new arma(nome,danyo));
                System.out.println("Has añadido una nueva arma correctamente");
                boo=false;
            }catch (Exception e){
                System.out.println("Error");
                sc.nextLine();
            }
        }while (boo);

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


