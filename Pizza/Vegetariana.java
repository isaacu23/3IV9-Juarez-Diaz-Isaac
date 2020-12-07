import java.util.Scanner;

public class Vegetariana extends Pizza{

    Scanner entrada = new Scanner(System.in);

    public Vegetariana() {
    }

    public Vegetariana(String masa, String[] salsa, String[] ingredientes)
    
    
    {
        super(masa, salsa, ingredientes);

        this.ingredientes = new String[4];
        this.ingredientes[0] = "Hongos";
        this.ingredientes[1] = "Piña";
        this.ingredientes[2] = "Platano";
        this.ingredientes[3] = "Lechuga";

    }



    public String elegiringredientes()
    
    
    {

        String Ingrediente;

        System.out.println("Ingresa los ingredientes");
        System.out.println("OJO con lo que pidas");
        System.out.println("1.Hongos");
        System.out.println("2. Piña");
        System.out.println("3. PPlatano");
        System.out.println("4. Lechuga");
        Ingrediente = entrada.next();

        return Ingrediente;
    }
} 