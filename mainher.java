import java.util.Scanner;

public class mainher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean boo=true;
        heroes paco=new heroes();
        arma arma1=new arma("Espada del caos",80);
        arma arma2=new arma("Báculo de la miseria",60);
        arma arma3=new arma("Arco de legolas",60);
        arma arma4=new arma("Daga de las mil sombras",50);

        paco.armero.add(arma1);
        paco.armero.add(arma2);
        paco.armero.add(arma3);
        paco.armero.add(arma4);
        do {
            paco.menu();
            System.out.println("Introduce una opcion");
            int opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    paco.addHeroe(paco.insertarHeore());
                    break;
                case 2:
                    paco.printHeroes();
                    break;
            }
        }while (boo);
    }
}
