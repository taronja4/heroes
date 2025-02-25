import java.util.InputMismatchException;
import java.util.Scanner;

public class mainher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean boo=true;
        heroes paco=new heroes();
        do {
            try {
                paco.menu();
                System.out.println("Introduce una opcion");
                int opcion=sc.nextInt();
                switch (opcion){
                    case 0:
                        System.out.println("Chao, adeu");
                        boo=false;
                        break;
                    case 1:
                        paco.insertarHeore();
                        break;
                    case 2:
                        paco.anadirArma();
                        break;
                    case 3:
                        System.out.println("Introduce el nombre del heroe que quieres eliminar");
                        String mno=sc.next();
                        sc.nextLine();
                        if (paco.buscarHeroe(mno)!=null){
                            paco.removeHeroe(paco.buscarHeroe(mno));
                        } else {
                            System.out.println("El heroe con ese nombre no existe en tu gremio");
                        }
                        break;
                    case 4:
                        System.out.println("Introduce el nombre del heroe que quieres buscar");
                        String nomo=sc.next();
                        sc.nextLine();
                        if (paco.buscarHeroe(nomo)!=null){
                            System.out.println(paco.buscarHeroe(nomo));;
                        } else {
                            System.out.println("El heroe con ese nombre no existe en tu gremio");
                        }
                        break;
                    case 5:
                        paco.printHeroes();
                    default:
                        System.out.println("Introduzca un numero valido ");
                        sc.nextLine();
                }
            }catch (InputMismatchException e){
                System.out.println("Introduzca un numero valido ");
                sc.nextLine();
            }

        }while (boo);
    }
}
