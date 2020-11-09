import java.util.*;
public class Arreglos{
public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

//parte para switch
        int Opcion;
        char letra;

        Arreglos meCalcular = new Arreglos();
        Arreglos meProm= new Arreglos();
        Arreglos meCalificaciones = new Arreglos();
        Arreglos meLaMatrix = new Arreglos();


        do{
            System.out.println("Programa de Arreglos");
            System.out.println("Escoge un programa ");
            System.out.println("1-Positivos y negativos");
            System.out.println("2- Promedio");
            System.out.println("3- Calificaciones");
            System.out.println("4- Suma de Matrices");

            Opcion = entrada.nextInt();

            switch(Opcion){
                case 1:
                    do{
                        meCalcular.Calcular();
                        System.out.println("Para salir del programa presiona 's' si deseas repetirlo presiona 'r'");
                        letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;


                case 2:
                    do{
                        meProm.Prom();
                        System.out.println("Para salir del programa presiona 's' si deseas repetirlo presiona 'r'");
                        letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;


                case 3:
                    do{
                        meCalificaciones.Calificaciones();
                        System.out.println("Para salir del programa presiona 's' si deseas repetirlo presiona 'r'");
                        letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;


                case 4:
                    do{
                        meLaMatrix.LaMatrix();
                        System.out.println("Para salir del programa presiona 's' si deseas repetirlo presiona 'r'");
                        letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;


            }
        System.out.println("Salir del Mebu= 's' o en dado caso 'c'");
        letra = entrada.next().charAt(0);
        }
        while(letra == 'c');
    }

    public void Calcular()
    {
        //primera parte
        Scanner entrada = new Scanner(System.in);
        
        int numeros[] = new int [10];
        int pos = 0;
        int neg= 0;
        int cero = 0;
        int i;
        double PromP = 0;
        double PromN = 0;
        double SumaDePos = 0;
        double SumaDeNeg = 0;

        
        System.out.println("Ingresa 10 numeros");
        System.out.println("Pueden ser Positivos o Negativos");

        for (i = 0; i < numeros.length; i++){
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (i = 0; i < numeros.length; i++){
            if (numeros[i] > 0){
                pos++;
                SumaDePos = SumaDePos + numeros[i];
            }
            else if (numeros[i] < 0){
                neg++;
                SumaDeNeg = SumaDeNeg + numeros[i];
            }
            else {
                cero++;
            }
        }


        PromP = SumaDePos/pos;
        PromN = SumaDeNeg/neg;

        if(PromP <= 0){
            System.out.println("Alto comediantwe No hay numeros positivos");
        }
        else{
            System.out.println("El promedio de numeros positivos es de: " + PromP);
        }

        if(PromN>= 0){
            System.out.println("No hay negativos");
        }
        else{
            System.out.println("El promedio de los numeros negativos es de : " + PromN);
        }
    }

    public void Prom()
    {
        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int [10];
        int i;
        double proP = 0;

        System.out.println("Ingrese diez numeros enteros uwu");
        for (i = 0; i < 10; i++) {
            System.out.print("Numero " + i + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){
                proP = proP + numeros[i];
            }
        }

        System.out.println("El promedio de los valores ubicados en posiciones pares es: " + proP/5);              
    }


    public void Calificaciones()
    {
        Scanner entrada = new Scanner(System.in);
        
        int numeros[] = new int[10];
        int resultados[] = new int [10];
        int rep = 0;
        int ap = 0;
        int i;
        int pro=0;
        int min=0;
        int max=0;
        int suma = 0;

        min=max=numeros[0];

        System.out.println("Ingrese diez calificaciones");
        System.out.println("Me huele a masacre xd");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Calificacion num " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (i = 0; i < numeros.length; i++) 
        {
            suma = suma + numeros[i];

            if (numeros[i] <= 5) {
                rep++;
            }
            else if (numeros[i] >= 6){
                ap++;
            }
            if(min>numeros[i])
			{
				min=numeros[i];
			}
			if(max<numeros[i])
			{
				max=numeros[i];
            }
        }


        for (i = 0; i < numeros.length; i++)
        {
            resultados [i] = numeros[i] * 1;
        }

        System.out.println("Calificaciones:");
        for (i = 0; i < numeros.length; i++)
        {
            System.out.println(resultados[i]);
        }

        pro = suma/numeros.length;
        System.out.println("Promedio del grupo: " + pro);
        System.out.println("Calificacion mas alta: " + max);
        System.out.println("Calificacion mas baja: " + min);
        System.out.println("Los superiores al promedio: ");
        for (i = 0; i < numeros.length; i++){
            if (numeros[i] > pro)
             {
                System.out.println("Calificacion en la posicion: " + (i + 1));
            }
        }

        System.out.println("Aprobados: " + ap);
        System.out.println("Reprobados: " + rep);

    }


    public void LaMatrix()
    {

        Scanner entrada = new Scanner (System.in);
        
        int matrizA[][] = new int [3][3];
        int matrizB[][] = new int [3][3];
        int matrizS[][] = new int [3][3];
        int i;
        int j;

        System.out.println("Datos de la matriz ");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                System.out.print("Escribe el valor de [" + i + "] [" + j + "]: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }


        System.out.println("Datos de la matriz B ");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                System.out.print("Escribe el valor de [" + i + "] [" + j + "]: ");
                matrizB[i][j] = entrada.nextInt();
            }
        }


        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                 matrizS[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }


        System.out.println(" resultante de la suma:");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++) {
                System.out.println(matrizS[i][j]);
            }           
        }
    }
}