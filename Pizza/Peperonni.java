import java.util.Scanner;

public class Peperonni extends Pizza{

    public Peperonni() {
    }

    public Peperonni(String masa, String[] salsa, String[] ingredientes) 
    
    {
        super(masa, salsa, ingredientes);


        this.ingredientes = new String[4];
        this.ingredientes[0] = "Rodajas";
        this.ingredientes[1] = "Rodajas con Sorpresa";
        this.ingredientes[2] = "Rodajas y Albaca";
        this.ingredientes[4] = "Doble Peperoni ";

    }


    public String elegirpeperoni()
    
    {

        int opcion;

        Scanner entrada = new Scanner(System.in);
        String peperoni;
        System.out.println("Elije como quieres el peperonni");
        System.out.println("------------------------------");
        System.out.println("1.- Rodajas");
        System.out.println("2.- Rodajas y Sorpresa");
        System.out.println("3. Rodajas y albaa");
        System.out.println("4. Doble Peperoni ");
        System.out.println("------------------------------");

        peperoni = entrada.next();

        return peperoni;
    }
}
