import java.util.*;

public class Sueldos{

    int id;

    int SueldoEN;
    int SueldoES;
    int puesto;

    double gasto;
    double sueldo;
    double ISR = 16; 
    double SGM = 12.8;
    double SueldoE = 5000;
    double SueldoS = 8000;
    double infonavit = 8;
   

    String NombreC;

   
    Scanner entrada = new Scanner(System.in);

    public void Sueldos(){

        Sueldos obj = new Sueldos();

        obj.Dinero();
    }
    public void Dinero(){

        System.out.println("Inserta tu ID");
        id = entrada.nextInt();
        System.out.println("Ahora tu Nombre");
        NombreC = entrada.next();
        
        do{
            System.out.println("Ingresa tu puesto de Explotacion voluntaria");
            System.out.println("opciones");
            System.out.println("1.Empleado");
            System.out.println("2.Supervisor");
            puesto = entrada.nextInt();
        }
        while (puesto > 2 ||  puesto < 1);

        if(puesto == 1)
        {
            Empleado();
        }

        else
        {
            Supervisor();
        }

    }

    public void Empleado(){
        System.out.println("Inserta la cantidad de horas que le dedicas a la comedia");
        int SueldoEN = entrada.nextInt();

        System.out.println("Inserta las horas extra de comedia");
        int SueldoES= entrada.nextInt();

        SueldoEN= SueldoEN*50;
        SueldoES = SueldoES*60;
        sueldo = SueldoE + SueldoEN + SueldoES;
        Total();
    }


    public void Supervisor(){
        gasto = infonavit + ISR + SGM;
        sueldo = SueldoS - gasto;
        Total();
    }


    public void Total(){
        System.out.println("El sueldo de: "+id+" "+NombreC+" es de: $" +sueldo+" ");
    }
}
