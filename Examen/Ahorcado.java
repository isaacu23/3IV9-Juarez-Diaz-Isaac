import java.util.*;


public class Ahorcado{

    Scanner entrada = new Scanner(System.in);


    public String palabra;


    private int ultimaletra;
    public char ultimal;
    



    public Ahorcado(){

    }

    public void palabra(String palabra){

        this.palabra = palabra;
        this.ultimaletra = ultimaletra;
        this.ultimaletra = ultimaletra;
        

    }

    public String GetPalabra(){
        return palabra;
    }

    public void SetPalabra(String palabra){
        this.palabra = palabra;
    }

   

    
    public void Eleccion(){

        try{
            
        System.out.println("Juarez Diaz Isaac Uriel");
        System.out.println("Adivina Adivinador");
        System.out.println("Muy bien ciudadano promedio adivina la siguiente palabra");
        System.out.println("Tendras solo 5 intentos");
        System.out.println("");
        System.out.println("[Primera Palabra]");
        System.out.println("=======================================");
        ultimaletra = palabra.length()-1;
        ultimal = palabra.charAt(ultimaletra);

            palabra = entrada.next();

           
            
            System.out.println("Pistas: ");
            System.out.println("La palabra inicia con: ");
            System.out.println("Inicia con: "+palabra.charAt(0));
            System.out.println("La palabra termina con: "+ultimal);
            
            
        }
        catch(NullPointerException e)

        {

            System.out.println("Has Ganado el Gulag");
            
        }
        
    }

   
    }

    

