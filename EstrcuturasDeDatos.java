import java.util.Scanner;
import java.util.*;
import java.io.*;

class Main{

    public static void main(String[] args) throws IOException{

        Scanner entrada = new Scanner(System.in);

        int opcion;
        int edad;
        int tem; 
        int num;
        int base; 
        int altura; 
        int ladoA; 
        int ladoB; 
        int radio; 
        int pelota; 
        int balon; 
        int gator; 
        int agua;
        char letra;
        char temperatura;
        char conversion;
        double area;
        double perimetro;
         double volumen; 
         double resultado; 
         double monto; 
         double primero; 
         double segundo; 
         double tercero; 
         double primer; 
         double segun; 

    do{
       
        System.out.println("Juarez Diaz Isaac Uriel 3IV9.");
        System.out.println("Elija una opcion:");
        System.out.println("1.o Aplicar descuento.");
        System.out.println("2.o Conversion de decimales.");
        System.out.println("3.o temperaturas.");
        System.out.println("4.o Identificar positivos y negativos.");
        System.out.println("5.o Precio.");
        System.out.println("6.o Area el perimetro o volumen.");
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
                    System.out.println("Escriba su edad.");
                edad = entrada.nextInt();
                if(edad > 65){
                    System.out.println("Descuento de 40 %. Demonios gumb que suerte.");
                }
                if(edad < 21){
                    System.out.println("¿Tus padres son socios de el establecimiento? Escriba s para si o n para no.");
                        letra = entrada.next().charAt(0);
                        if(letra == 's'){
                            System.out.println("Su descuento es de 45 %. Demonios gumb eres un GENIO.");
                        }
                        else if(letra == 'n'){
                            System.out.println("Su descuento es de 25 %. Graciass.");
                        }
                }
                if(edad >= 21 & edad <= 65){
                    System.out.println("Gracias por visitarnos.");
                }

                System.out.println(" ");
                System.out.println("Escriba r si quiere repetir el programa.");
                System.out.println("Si quiere volver al menu principal, escriba m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'r');

                    break;

            case 2:
                do{
                System.out.println("Ingrese un numero entero y positivo .");
                num = entrada.nextInt ();
                String binario = "";
                if (num > 0){

                while (num > 0){
                    if (num % 2 == 0){
                        binario = "0" + binario;
                    }
                    else{
                        binario = "1" + binario;
                    }

                    num = (int) num/2;
                }
                }
                else if(num == 0){
                    binario = "0";
                }
                else{
                    binario = "Ingrese solo numeros positivos";
                }
                System.out.println("La conversion resulta en: " + binario + ".");
                
                System.out.println(" ");
                System.out.println("Digite r si quiere repetir el programa.");
                System.out.println("Si quiere volver al menu principal, escriba m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'r');

                break;

            case 3:
                do{
                
                tem = 0;
                
                System.out.println("Escriba la temperatura.");
                tem = entrada.nextInt();
                
                System.out.println(" ");
                System.out.println("C = Celsius. F = Farenheit. K = Kelvin. R = Rankine.");
                System.out.println(" ");
                System.out.println("Con base en la anterior, digita una letra:");
                temperatura = entrada.next().charAt(0);

                System.out.println("A que desea convertir:");
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
                    }while(letra ==  'r');

                break;
                
            case 4:
                do{
                System.out.println("Escriba tres numeros ojo que te diremos su naturaleza.");
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
                System.out.println("Estan disponibles estos productos:");
                System.out.println("Pelota - 10 $. Balon - 100 $. Gatorade - 19 $. Agua Natural - 7 $.");
                System.out.println(" ");
                
                pelota = 10;
                balon = 100;
                gator = 19;
                agua = 7;
                monto = 0;
                
                do{System.out.println("Escriba cuantas pelotas .");
                pelota = entrada.nextInt();
                }while(pelota < 0);

                do{System.out.println("Escriba cuantos balones .");
                balon = entrada.nextInt();
                }while(balon < 0);

                do{System.out.println("Escriba cuantos gatorade .");
                gator = entrada.nextInt();
                }while(gator < 0);

                do{System.out.println("Escriba cuantas botellas .");
                agua = entrada.nextInt();
                }while(agua < 0);
                
                monto = (pelota + balon + gator + agua);

                System.out.println("Sus productos son un total de " + monto + " . Gracias por su compra.");

                System.out.println(" ");
                System.out.println("Escriba r si quiere repetir el programa.");
                System.out.println("Si quiere volver al menu principal, escriba m.");
                letra = entrada.next().charAt(0);
                }while(letra ==  'r');

                break;

            case 6:

                do{System.out.println("Seleccione con base en la nomenclatura una funcion.");
                System.out.println("1, Area y Perimetro de un rectangulo; 2, Perimetro de un triangulo; 3, Volumen de una esfera; 4, Volumen de un cilindro.");

                opcion = entrada.nextInt();

                if(opcion == 1){
                    System.out.println(" base del rectangulo");
                    base = entrada.nextInt();

                    System.out.println("altura del rectangulo");
                    altura = entrada.nextInt();

                    perimetro = base*altura;
                    area = 2*(base+altura);

                    System.out.println("El perimetro es de " + perimetro);
                    System.out.println("El area es de" + area);
                }

                if(opcion == 2){
                    System.out.println("base del triangulo.");
                    base = entrada.nextInt();

                    System.out.println("Introduce uno a uno los dos lados restantes del triangulo.");
                    ladoA = entrada.nextInt();
                    ladoB = entrada.nextInt();

                    System.out.println(" altura del triangulo");
                    altura = entrada.nextInt();

                    perimetro = base+ladoA+ladoB;
                    area = altura*(base/2);

                    System.out.println("El perimetro es de " + perimetro);
                    System.out.println("El area es de" + area);
                }

                if(opcion == 3){
                    System.out.println(" radio de la esfera");
                    radio = entrada.nextInt();

                    System.out.println("Introduce la altura de la esfera");
                    altura = entrada.nextInt();

                    volumen = 4*3.14*((radio*radio*radio)/3);

                    System.out.println("El volumen es de " + volumen);
                }

                if(opcion == 4){
                    System.out.println("Introduce el radio del cilindro");
                    radio = entrada.nextInt();

                    System.out.println("Introduce la altura del cilindro");
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
                System.out.println("Tabla con unidades, decenas, centenas yetc.");

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
                }while(letra ==  'r');

                break;
            
            case 8:
                do{
                System.out.println("Escriba el numero del cual desea conocer su factorial:");
 
                int calculo = 0;

                while(calculo < 1) {
                    try {
                        calculo = entrada.nextInt();
                        if(calculo < 1)
                            System.out.println("Introduzca un valor superior y distinto de 0.");
                    }catch(InputMismatchException e) {
                        System.out.println("Introduzca un valor numerico.");
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
                }while(letra ==  'r');

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

                System.out.println("Bienvenido a la Calculadora de Dos Variables.");
                System.out.println(" ");
                System.out.println("Digite el primer numero.");
                primero = entrada.nextDouble();

                System.out.println(" ");
                System.out.println("Digite el segundo numero.");
                segundo = entrada.nextDouble();

                System.out.println(" ");
                System.out.println("Digite la operacion a realizar: ");
                System.out.println(" ");
                System.out.println("s = suma. e = resta. u = multiplicacion. d = division. j = residuo.");
                letra = entrada.next().charAt(0);
                System.out.println(" ");

                if(letra == 's')
                {
                    resultado = primero+segundo;
                    System.out.println("El resultado de sumar " + primero + " mas " + segundo + " es: " + resultado);
                }

                if(letra == 'e')
                {
                    resultado = primero-segundo;
                    System.out.println("El resultado de restar " + primero + " menos " + segundo + " es: " + resultado);
                }

                if(letra == 'u')
                {
                    resultado = primero*segundo;
                    System.out.println("El resultado de multiplicar " + primero + " por " + segundo + " es: " + resultado);
                }

                if(letra == 'd')
                {
                    resultado = primero/segundo;
                    System.out.println("El resultado de dividir " + primero + " entre " + segundo + " es: " + resultado);
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
                System.out.println("UWU.");   
        }
        System.out.println(" ");
        System.out.println("Escriba m nuevamente para ir al menu principal.");
        System.out.println("Escriba x para cerrar el programa.");
        System.out.println(" ");
        System.out.println("Programa hecho por:");
        System.out.println("3IV9_Andrade Aguilar Arturo Imanol");
        letra = entrada.next().charAt(0);

    }while(letra == 'm');       
    }
}
