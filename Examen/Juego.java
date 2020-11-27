import java.util.*;
import java.util.Random;


public class Juego extends Ahorcado{

    Scanner entrada = new Scanner(System.in);

    

    private char letra;
    private int lei;

    public Juego(){
    }

  


    public void pedirDatos(){

      
        final int Intentos_total = 5; 

        int intentos = 0;
        int aciertos = 0;
        
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        char respues;
      
        Random rnd = new Random();
        
        String arrayPalabras[] = new String[6];
        arrayPalabras[0] = "Parangaricutirimicuaro";
        arrayPalabras[1] = "Helicoptero";
        arrayPalabras[2] = "Videojuegos";
        arrayPalabras[3] = "Comediante";
        arrayPalabras[4] = "Esclavitud";
        arrayPalabras[5] = "Diccionario";

        
      do {
        
     
        int alea = rnd.nextInt(3);
        char[] desgu = desgu(arrayPalabras[alea]);
        char[] copia = desgu(arrayPalabras[alea]); 
        char[] respuestasEl = new char[desgu.length];
 
        
        for(int i = 0; i < respuestasEl.length; i++)

        {
            respuestasEl[i] = '_';
        }
        
        System.out.println("Juarez Diaz Isaac Uriel");
        System.out.println("Adivina Adivinador");
        System.out.println("Muy bien ciudadano promedio adivina la siguiente palabra");
        System.out.println("Tendras solo 5 intentos");
        System.out.println("");
        System.out.println("[Primera Palabra]");
        System.out.println("=======================================");
        
        System.out.println("La palabra termina con: "+ultimal);
        
        while(intentos < Intentos_total && aciertos != respuestasEl.length){
            imprimeOculta(respuestasEl);
            
            System.out.println("Inserta una letra ");
            respues = teclado.next().toLowerCase().charAt(0);
            

            for(int i = 0; i < desgu.length; i++){
                if(desgu[i]==respues)
                
                {
                    respuestasEl[i] = desgu[i];
                    desgu[i] = ' ';
                    aciertos++;
                }
            }    
            intentos++;
        }
        


        if(aciertos == respuestasEl.length){
            System.out.print("Has ganado el Gulag ");
            imprimeOculta(respuestasEl);
        }
        
        else{
            System.out.println("=======================================");
            System.out.print("Ojo a la comedia");
            System.out.println("");
            System.out.println("Lo siento amigo pero la palabra era: ");
            for(int i = 0; i < copia.length; i++){
                System.out.print(copia[i] + " ");
            }
        }
        
        intentos = 0;
        aciertos = 0;
        
        respues = pregunta("Volver a jugar?",teclado);
        }while(respues != 'n');
       
    }
    
   
    private static char[] desgu(String palAzar){
        char[] letras;

        letras = new char[palAzar.length()];
        for(int i = 0; i < palAzar.length(); i++)

        {
            letras[i] = palAzar.charAt(i);
        }

        return letras;
    }
    
    

    private static void imprimeOculta(char[] respuestasEl){
        
        for(int i = 0; i < respuestasEl.length; i++)
        
        {
            System.out.print(respuestasEl[i] + " ");
        }
    }
    
    
    public static char pregunta(String men, Scanner teclado) {
        char respues;

        System.out.println("[salir/no]");
        System.out.println("///////////");
        System.out.println("Repetir= S");
        System.out.println("Salir= N");


        System.out.println("Demonios Crack, Asi se quedo :0");
        //Prueba de un cadaver xd
        System.out.println("     ________ __ ");
        System.out.println("    |        |  |  ");
        System.out.println("    |      __----__");
        System.out.println("    |      ( 7 7 )");
        System.out.println("    |      (__O__) ");
        System.out.println("    |        | | ");
        System.out.println("    |         |    ");
        System.out.println("    |        |  | ");
        System.out.println("_________    |  |");


        //prueba
        
        respues = teclado.next().toLowerCase().charAt(0);

        while (respues != 's' && respues != 'n')
        
        {
            System.out.println("");
        }
        
        return respues;
    }
    
}