import java.util.Scanner;
import java.util.*;
import java.io.*;

class EstructuraDatos{

    public static void main(String[] args) throws IOException{

        Scanner entrada = new Scanner(System.in);

        int opcion;
        int edad; 
        int temp; 
        int numero; 
        int base; 
        int altura; 
        int lado,A;
        int lado,B; 
        int radio;
        int chicle; 
        int choc; 
        int h2o;
        int jugo;
        char letra; 
        char temperatura; 
        char convertir;
        double area;
        double perimetro;
        double volumen;
        double resultado;
        double monto; 
        double uno;
        double dos; 
        double tres; 


    do{
        
        System.out.println("Juarez Diaz Isaac Uriel-3IV9");
        System.out.println(" ");
        System.out.println("Escoja una opcion");
        System.out.println("1.o Con descuento.");
        System.out.println("2.o Transformar de decimales a binarios.");
        System.out.println("3.o Temperaturas.");
        System.out.println("4.o Identificador de positivos y negativos.");
        System.out.println("5.o  El Precio.");
        System.out.println("6.o El Area, El perimetro o volumen.");
        System.out.println("7.o Tabla de valores.");
        System.out.println("8.o Calcular factorial.");
        System.out.println("9.o Cuadrado de asteriscos.");
        System.out.println("10.o Cuadrado de asteriscos hueco.");
        System.out.println("11.o Patron de asteriscos.");
        System.out.println("12.o Diamante de asteriscos.");
        System.out.println("13.o Calculadora.");
        System.out.println("14.o Salir.");

        opcion = entrada.nextInt();

        switch(opcion) {
            case 1:

                do{
                    System.out.println("Inserte su edad.");
                edad = entrada.nextInt();
                if(edad > 65){
                    System.out.println("Aplica un descuento del 40 %. Demonios Gumb ERES UN SUERTUDO");
                }

                if(edad < 21){
                    System.out.println("¿Tus padres son socios de el establecimiento? Escriba s para si o n para no.");
                        letra = entrada.next().charAt(0);
                        if(letra == 's'){
                            System.out.println("Descuento de 45 %. Demonios gumb eres un GENIO");
                        }
                        else if(letra == 'n'){
                            System.out.println("Descuento de 25 %. Gracias");
                        }
                }
                if(edad >= 21 & edad <= 65){
                    System.out.println("Gracias por la visita, Eres grande Drake");
                }

                System.out.println(" ");
                System.out.println("Escriba r si quiere repetir el programa.");
                System.out.println("Si quiere volver al menu principal, escriba m.");
                letra = entrada.next().charAt(0);
                }

                while(letra ==  'r');

                    break;

            case 2:
                do{
                System.out.println("Ingrese un numero entero y positivo para hacer la conversion.");
                num = entrada.nextInt ();
                String binario = "";

                if (num > 0)
                {

                while (num > 0){
                    if (num % 2 == 0)
                    {
                        binario = "0" + binario;
                    }
                    else
                    {
                        binario = "1" + binario;
                    }

                    num = (int) num/2;
                }
                }
                else if(num == 0){
                    binario = "0";
                }
                else
                {
                    binario = "Pon solo numeros positivos";
                }
                System.out.println("La conversion resulta en: " + binario + ".");
                
                System.out.println(" ");
                System.out.println("Digite r si quiere repetir el programa.");
                System.out.println("Si quiere volver al menu principal, escriba m.");
                letra = entrada.next().charAt(0);
                }
                while(letra ==  'r');

                break;



            case 3:
                do{
                
                tem = 0;
                
                System.out.println("Escriba temperatura.");
                tem = entrada.nextInt();
                
                System.out.println(" ");
                System.out.println("C = Celsius. F = Farenheit. K = Kelvin. R = Rankine.");
                System.out.println(" ");
                System.out.println("Con base en lo anterior, digita la unidad de su temperatura:");
                temperatura = entrada.next().charAt(0);

                System.out.println("Escriba con que se  quiere convertir:");
                conversion = entrada.next().charAt(0);
                
                if(temperatura == 'C' & conversion == 'C')
                    {
                        System.out.println("El valor es el mismo. Escriba una conversion valida.");
                    }
                    else if(temperatura == 'C' & conversion == 'F')
                    {
                        resultado = tem*33.8;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'C' & conversion == 'K')
                    {
                        resultado = tem*274.15;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'C' & conversion == 'R')
                    {
                        resultado = tem*493.47;
                        System.out.println("El resultado es: " + resultado);
                    }

                    if(temperatura == 'F' & conversion == 'F')
                    {
                        System.out.println("El valor es el mismo. Escriba una conversion valida.");
                    }
                    else if(temperatura == 'F' & conversion == 'C')
                    {
                        resultado = tem*-17.22;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'F' & conversion == 'K')
                    {
                        resultado = tem*255.92;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'F' & conversion == 'R')
                    {
                        resultado = tem*460.67;
                        System.out.println("El resultado es: " + resultado);
                    }

                    if(temperatura == 'K' & conversion == 'K')
                    {
                        System.out.println("El valor es el mismo. Escriba una conversion valida.");
                    }
                    else if(temperatura == 'K' & conversion == 'F')
                    {
                        resultado = tem*-457.87;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'K' & conversion == 'C')
                    {
                        resultado = tem*-272.15;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'K' & conversion == 'R')
                    {
                        resultado = tem*1.8;
                        System.out.println("El resultado es: " + resultado);
                    }

                    if(temperatura == 'R' & conversion == 'R')
                    {
                        System.out.println("El valor es el mismo. Escriba una conversion valida.");
                    }
                    else if(temperatura == 'R' & conversion == 'F')
                    {
                        resultado = tem*-458.67;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'R' & conversion == 'K')
                    {
                        resultado = tem*0.55;
                        System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'R' & conversion == 'C')
                    {
                        resultado = tem*-272.594;
                        System.out.println("El resultado es: " + resultado);
                    }

                    System.out.println(" ");
                    System.out.println("Escriba r si quiere repetir el programa.");
                    System.out.println("Si quiere volver al menu principal, escriba m.");
                    letra = entrada.next().charAt(0);
                    }
                    while(letra ==  'r');

                break;
                


            case 4:
                do{
                System.out.println("Escriba tres numeros y sabras la verdad de si son positivos o nehgartivos.");
                primero = entrada.nextDouble();
                segundo = entrada.nextDouble();
                tercero = entrada.nextDouble();

                if(primero == 0){
                    System.out.println("El primer numero es neutro.");
                }
                    else if(primero < 0){
                        System.out.println("El primer numero es negativo.");
                    }
                    else{
                        System.out.println("El primer numero es positivo.");
                    }

                if(segundo == 0){
                    System.out.println("El segundo numero es neutro.");
                }
                    else if(segundo < 0){
                        System.out.println("El segundo numero es negativo.");
                    }                
                    else{
                        System.out.println("El segundo numero es positivo.");
                    }
                
                if(tercero == 0){
                    System.out.println("El tercer numero es neutro.");
                }
                    else if(tercero < 0){
                        System.out.println("El tercer numero es negativo.");
                    }
                    else{
                    System.out.println("El tercer numero es positivo.");
                    }

                    System.out.println(" ");
                    System.out.println("Escriba r si quiere repetir el programa.");
                    System.out.println("Si quiere volver al menu principal, escriba m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');

                break;



            case 5:
                do{
                System.out.println("Estan a la venta estos productos");
                System.out.println("Pelota - 10 $. Balon - 100 $. Gatorade - 19 $. Agua Natural - 7 $.");
                System.out.println(" ");
                
                pelota = 10;
                balon = 100;
                gatorad = 19;
                agua = 7;
                monto = 0;
                
                do{System.out.println("Escriba cuantas pelotas ha solicitado.");
                pelota = entrada.nextInt();
                }while(pelota < 0);

                do{System.out.println("Escriba cuantos balones ha solicitado.");
                balon = entrada.nextInt();
                }while(balon < 0);

                do{System.out.println("Escriba cuantos gatorade ha solicitado.");
                gatorad = entrada.nextInt();
                }while(gator < 0);

                do{System.out.println("Escriba cuantas botellas de agua ha solicitado.");
                agua = entrada.nextInt();
                }while(agua < 0);
                
                monto = (pelota + balon + gator + agua);

                System.out.println("Su total es de " + monto + " . Gracias por su dinero.");

                System.out.println(" ");
                System.out.println("Escriba r si quiere repetir el programa.");
                System.out.println("Si quiere volver al menu principal, escriba m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'r');


                break;



            case 6:

                do{System.out.println(" con base en la nomenclatura, Elige una funcion.");
                System.out.println("1, Area y Perimetro de un rectangulo; 2, Perimetro de un triangulo; 3, Volumen de una esfera; 4, Volumen de un cilindro.");

                opcion = entrada.nextInt();

                if(opcion == 1){
                    System.out.println("base del rectangulo");
                    base = entrada.nextInt();

                    System.out.println("altura del rectangulo");
                    altura = entrada.nextInt();

                    perimetro = base*altura;
                    area = 2*(base+altura);

                    System.out.println("El perimetro es de " + perimetro);
                    System.out.println("El area es de" + area);
                }

                if(opcion == 2)
                {
                    System.out.println("base del triangulo.");
                    base = entrada.nextInt();

                    System.out.println("Introduce uno a uno los dos lados restantes del triangulo.");
                    ladoA = entrada.nextInt();
                    ladoB = entrada.nextInt();

                    System.out.println("altura del triangulo");
                    altura = entrada.nextInt();

                    perimetro = base+ladoA+ladoB;
                    area = altura*(base/2);

                    System.out.println("El perimetro es de " + perimetro);
                    System.out.println("El area es de" + area);
                }

                if(opcion == 3)
                {
                    System.out.println("Radio de la esfera");
                    radio = entrada.nextInt();

                    System.out.println("altura de la esfera");
                    altura = entrada.nextInt();

                    volumen = 4*3.14*((radio*radio*radio)/3);

                    System.out.println("El volumen es de " + volumen);
                }


                if(opcion == 4)
                {
                    System.out.println("Radio del cilindro");
                    radio = entrada.nextInt();

                    System.out.println("altura del cilindro");
                    altura = entrada.nextInt();

                    volumen = 3.14*(radio*radio)*altura;

                    System.out.println("El volumen es de " + volumen);
                }

                System.out.println(" ");
                System.out.println("Escriba r si desea repetir el programa.");
                System.out.println("Si quiere volver al menu principal, escriba m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'r');

                break;



            case 7:
                do{
                System.out.println("Tabla con unidades, decenas, centenas y millares del uno al diez.");

                System.out.println("\tN\t\t\t");
                System.out.println("\t1\t10\t100\t1000");
                System.out.println("\t2\t20\t200\t2000");
                System.out.println("\t3\t30\t300\t3000");
                System.out.println("\t4\t40\t400\t4000");
                System.out.println("\t5\t50\t500\t5000");
                System.out.println("\t6\t60\t600\t6000");
                System.out.println("\t7\t70\t700\t7000");
                System.out.println("\t8\t80\t800\t8000");
                System.out.println("\t9\t90\t900\t9000");
                System.out.println("\t10\t100\t1000\t1000");
                

                System.out.println(" ");
                System.out.println("Escriba r si desea repetir el programa.");
                System.out.println("Si quiere volver al menu principal, escriba m.");
                letra = entrada.next().charAt(0);
                }
                while(letra ==  'r');

                break;
            


            case 8:
                do{
                System.out.println("Escriba el numero del cual desea conocer su factorial:");
 
                int calculo = 0;

                while(calculo < 1) {
                    try {
                        calculo = entrada.nextInt();
                        if(calculo < 1)
                            System.out.println("ponga un valor mayor, pero ojo a la comedia, debe ser distinto al  0.");
                    }catch(InputMismatchException e) {
                        System.out.println("valor numerico.");
                        entrada.nextLine();
                    }
                }

                long factorial = 1L;

                for(int i = calculo; i > 0; i--) {
                    factorial=factorial*i;
                }
         
                System.out.println("El factorial de " + calculo + " es " + factorial + ".");

                System.out.println(" ");
                System.out.println("Escriba r si desea repetir el programa.");
                System.out.println("Si quiere volver al menu principal, escriba m.");
                letra = entrada.next().charAt(0);
                }
                while(letra ==  'r');

                break;
            


            case 9:
                do{

                System.out.println("No disponible por el momento.");

                System.out.println(" ");
                System.out.println("Escriba r si desea repetir el programa.");
                System.out.println("Si quiere volver al menu principal, escriba m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'r');

                break;
            


            case 10:
                do{

                System.out.println("No disponible por el momento.");

                System.out.println(" ");
                System.out.println("Escriba r si desea repetir el programa.");
                System.out.println("Si quiere volver al menu principal, escriba m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'r');

                break;



            case 11:
                do{

                System.out.println("No disponible por el momento.");

                System.out.println(" ");
                System.out.println("Escriba r si desea repetir el programa.");
                System.out.println("Si quiere volver al menu principal, escriba m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'r');

                break;

           case 12:
                do{

                System.out.println("No disponible por el momento.");

                System.out.println(" ");
                System.out.println("Escriba r si desea repetir el programa.");
                System.out.println("Si quiere volver al menu principal, escriba m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'r');

                break;

            case 13:
                do{

                System.out.println("La Super Calculadora de Dos Variables.");
                System.out.println(" ");
                System.out.println(" primer numero.");
                primero = entrada.nextDouble();

                System.out.println(" ");
                System.out.println(" segundo numero.");
                segundo = entrada.nextDouble();

                System.out.println(" ");
                System.out.println(" operacion a realizar: ");
                System.out.println(" ");
                System.out.println("su = suma. es = resta. mult = multiplicacion. div = division. j = residuo.");
                letra = entrada.next().charAt(0);
                System.out.println(" ");

                if(letra == 'su')
                {
                    resultado = primero+segundo;
                    System.out.println("El resultado de " + primero + " mas " + segundo + " es: " + resultado);
                }

                if(letra == 'es')
                {
                    resultado = primero-segundo;
                    System.out.println("El resultado de  " + primero + " menos " + segundo + " es: " + resultado);
                }

                if(letra == 'mult')
                {
                    resultado = primero*segundo;
                    System.out.println("El resultado de multiplicar " + primero + " por " + segundo + " es: " + resultado);
                }

                if(letra == 'div')
                {
                    resultado = primero/segundo;
                    System.out.println(" dividir " + primero + " entre " + segundo + " es: " + resultado);
                }

                if(letra == 'j')
                {
                    resultado = primero%segundo;
                    System.out.println("El residuo de dividir " + primero + " entre " + segundo + " es: " + resultado);
                }

                    System.out.println(" ");
                    System.out.println("Escriba r si desea repetir el programa.");
                    System.out.println("Si quiere volver al menu principal, escriba m.");
                    letra = entrada.next().charAt(0);
                }while(letra ==  'r');
                
                break;
            
            default:
                System.out.println("Amonos uwu.");   
        }
        System.out.println(" ");
        System.out.println("Escriba m nuevamente para ir al menu principal.");
        System.out.println("Escriba x para cerrar el programa.");
        System.out.println(" ");
        System.out.println("Programa hecho por:");
        System.out.println("3IV9juarez Diaz isaac");
        letra = entrada.next().charAt(0);

    }while(letra == 'm');       
    }
}
