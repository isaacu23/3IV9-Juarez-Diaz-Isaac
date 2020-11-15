import java.util.Scanner;

public class Llamadas{

    public void Cel(){
        
        Scanner entrada = new Scanner(System.in);

        int i;
        int saldo = 150;


        int numeros[] = new int [10];
        int k = 0; 
        int  l= 0; 
        int  m= 0;

        double GastoTotal;
        double sumak = 0;
        double sumal= 0;
        double sumam= 0;


        char Letra;

        System.out.println("Eije una opcion");

        System.out.println("Ojo Comediante, primero qu nada recuera que");
        System.out.println("Tu saldo es de $150");

        System.out.println("1- Celular");
        System.out.println("2- Llamada nacional");
        System.out.println("3- Llamada internacional");
        
        
        for (i = 0; i < numeros.length; i++)
        
        {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        for (i = 0; i < numeros.length; i++)
        {
            if (numeros[i] == 1)
            {
                m++;
                sumam = (m/3)*0.2; 

               
            }


            else if (numeros[i] == 2)
            
            {
                k++;
                sumak = k*0.5;

                
            }


            else if (numeros[i] == 3)
            
            {
                l++;
                sumal= (l/2)*(0.6);

               
            }
        }
            
        GastoTotal = sumam + sumak + sumal;



        System.out.println("Ha gastado  $" + GastoTotal);
        System.out.println("Si quieres saber tu saldo= 's' si no entonces pon = 'n'");
        
        Letra = entrada.next().charAt(0);
        
        if(Letra == 's')
        
        {
            System.out.println("Su saldo era $" + saldo);
            System.out.println("Tu nuevo saldo es  $" + (saldo - GastoTotal));
        }
    }
}
