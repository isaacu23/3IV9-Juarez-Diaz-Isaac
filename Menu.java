import java.util.*;

class Menu{
    
    Scanner entrada = new Scanner(System.in);

    int opcion;

    public void Programas() {
    
       do{
            Sueldos obj = new Sueldos();
            Provedores ob = new Provedores();
            Biblioteca obje = new Biblioteca();

            System.out.println("Juarez Diaz Isaac Urielk");
            System.out.println("Grupo 3IV9");
            System.out.println("");
            System.out.println("En que puedo ayudarte?");
            System.out.println("Elije una Opcion");
            System.out.println("1- Sueldos");
            System.out.println("2- Provedores");
            System.out.println("3- Biblioteca");
            System.out.println("4- Salir");
            opcion = entrada.nextInt();


            switch (opcion) {
                case 1:
                    obj.Sueldos();
                break;


                case 2:
                    ob.Provedores();
                break;


                case 3:
                    obje.Biblioteca();
                break;


                case 4:
                    System.out.println("Felicidades Solado Ganaste el Gulag");
                    System.out.println("Ahora vuelve a ganar");
                break;


            }
        }while (opcion != 4);
    }
}