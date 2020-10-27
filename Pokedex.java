import java.util.Scanner;
import java.util.*;
import java.io.*;
class pokedex{
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int charmander;
        int bulbasoar; 
        int squartle;
         int Vida; 
         int vida2; 
         int id; 
         int ataque; 
         int ataque2; 
         int opcion; 
         int fuerza; 
         int defensa;
            Vida = 100;
            fuerza = 200;
            defensa = 150;
//mi creacion
            System.out.println("Juarez Diaz Isaac uriel");
            System.out.println("Examen 3iv9");
            //menu
        do{
            System.out.println("Escoge un Pokemon y te dare sus datos");
            System.out.println("1.- Charmander");
            System.out.println("2.- Bulbasoar");
            System.out.println("3.- Squartle");
            System.out.println("4.- Batalla pokemon");
            System.out.println("5.- Salir");
            
            opcion = entrada.nextInt();
            
            switch(opcion){//charmander
                case 1:
                    ataque = 200;
                    ataque2 = 75;
                    id = 236564;
                    System.out.println("Charmander");
                    System.out.println("1. Vida" + Vida);
                    System.out.println("2. ID" + id);
                    System.out.println("7. Charmander");
                    System.out.println("3.Su fuerza  " + fuerza );
                    System.out.println("4.Su defenza " + defensa);
                    System.out.println("5. Ataque es  " + ataque);
                    System.out.println("6. Ataque secundario " + ataque2);
                break;
                case 2: //bulbasor
                    id = 01234;
                    ataque = 15;
                    ataque2 = 75;
                    System.out.println("Bulbasoar");
                    System.out.println("1. Vida" + Vida);
                    System.out.println("2. ID" + id);
                    System.out.println("7.bulbasor");
                    System.out.println("3. Su fuerza  " + fuerza );
                    System.out.println("4. Su defenza " + defensa);
                    System.out.println("5. Ataque es  " + ataque);
                    System.out.println("6.Ataque secund" + ataque2);
                break;
                case 3://squartle
                    id = 12345;
                    ataque = 100;
                    ataque2 = 150;
                    System.out.println("Squartle");
                    System.out.println("1. Vida " + Vida);
                    System.out.println("2. ID " + id);
                    System.out.println("7.squartle");
                    System.out.println("3.Su fuerza  " + fuerza );
                    System.out.println("4. Su defenza  " + defensa);
                    System.out.println("5. Ataque es" + ataque);
                    System.out.println("6.Ataque secundario  " + ataque2);
                break;

                case 4://squartle
               System.out.println("Batalla Pokemon");
               System.out.println("Opciones");
               System.out.println(" 1.Charmander");
               System.out.println("2.Bulbasor");
               System.out.println("3. Squartle");

               pokemon = entrada.nextInt();

               if (pokemon == 1){
                System.out.println(" charmander");
                System.out.println("Atento comediante");
                System.out.println("Vas a pelear a muerte con squartle");
                
                System.out.println("Elige tu ataque, (1= ataque, 2= ataque2");

                ataque = entrada.nextInt();
                if (ataque == 1){
                System.out.println("has atcado a bulbasour (planta) con un ataque fuego, el ataque es critico y bulbasour es derrotado");
                }else{
                    System.out.println(" es derrotado");
                    System.out.println("C harmander esta muerto");
                }
            }

            if (pokemon == 2){
                System.out.println(" Bulbasoe");
                System.out.println("Atento comediante");
                System.out.println("Vas a pelear a muerte con squartle");
                
                System.out.println("Elige tu, (1= ataque, 2= ataque2");

                ataque = entrada.nextInt();
                if (ataque == 1){
                System.out.println("has Atacado al contrrtincante");
                }else{
                    System.out.println("Bulbasoer esta casi muerto");
                    System.out.println("saquertle ha sido derrotado y esta cansado");
                }
            }


            if (pokemon == 3){
                System.out.println(" Squartle");
                System.out.println("Atento comediante");
                System.out.println("Vas a pelear a charmander");
                
                System.out.println("Elige tu ataque, (1= ataque, 2= ataque2");

                ataque = entrada.nextInt();
                if (ataque == 1){
                System.out.println("has atcado a a charmanders derrotado");
                }else{
                    System.out.println("Ya casi es  derrotado");
                    System.out.println("Esta derrotado");
                }
            }
            break;
                

                
            }
        } while(opcion != 5);
    }
}