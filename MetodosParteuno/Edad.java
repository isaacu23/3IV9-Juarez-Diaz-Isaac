import java.util.Scanner;

public class Edad{
    
    public void Edad(){
        
        Scanner entrada = new Scanner(System.in);

        int Epoca;
        int Total;

        System.out.println("Muy Bien comediante atento");
        System.out.println("Dime tu año de nacimiento");
        
        
        Epoca = entrada.nextInt();

        
        if(Epoca > 2020)

        {
            System.out.println("Muy bien");
            Epoca = entrada.nextInt();   
        }

        else
        
        {
            Total = (2020)-(Epoca);
            System.out.println("Tu edad es  " + Total);
            System.out.println("Demonios Crack ya estas viejo ");

        }




    }
}