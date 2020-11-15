import java.util.Scanner;
import java.util.*;

public class Metodos{

    public void menu(){

        Scanner entrada = new Scanner(System.in);
        int  Opcion;
        char letra;
        

        do{
            System.out.println("Selecciona una pcion");
            System.out.println("1- Akinator de edad");
            System.out.println("2-  ElArea y perimetro");
            System.out.println("3- Llamadas de Pillofon");
            
            Opcion = entrada.nextInt();

            switch(Opcion){


                case 1:
                    do{
                    Edad obj = new Edad();
                    obj.Edad();
                    System.out.println("Si deseas repetir='r' y  salir= 's'");
                    letra = entrada.next().charAt(0);
                    }
                    while(letra == 'r');
                break;



                case 2:
                    do{
                    MetodoUno obj = new MetodoUno();
                    obj.Figuras();
                    System.out.println("Si deseas repetir='r' y  salir= 's'");
                    letra = entrada.next().charAt(0);
                    }
                    while(letra == 'r');
                break;


                case 3:
                    do{
                    Llamadas obj = new Llamadas();
                    obj.Cel();
                    System.out.println("Si deseas repetir='r' y  salir= 's'");
                    letra = entrada.next().charAt(0);
                    }
                    while(letra == 'r');
                break;
            
            }

            System.out.println("Muy bien comediante tienes dos opciones");
            System.out.println("Si quieres regresar al menu presione ='m' para cerrar el programa = 's'");
            letra = entrada.next().charAt(0);
        }
        while(letra == 'm');


        
    }
}