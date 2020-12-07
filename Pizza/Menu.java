import java.util.Scanner;

public class Menu {

    private int total = 0;
    private int opc;
    private int compra;



    public void MenuCalcular(){



        Scanner entrada = new Scanner(System.in);

        int ac;

        String que = null;

        final int precio[] = new int[16];
        precio[0] = 75;
        precio[1] = 89;
        precio[2] = 112;
        precio[3] = 135;
        precio[4] = 89;
        precio[5] = 115;
        precio[6] = 135;
        precio[7] = 175;
        precio[8] = 96;
        precio[9] = 119;
        precio[10] = 131;
        precio[11] = 167;
        precio[12] = 88;
        precio[13] = 97;
        precio[14] = 111;
        precio[15] = 157;


        Pizza picsa = null;

        System.out.println("Hola Comediante");
        System.out.println("Bienbenido a la pizza don Luigis");
        System.out.println("Muy bien, ahora dime el tamaño de la orden");

        compra = entrada.nextInt();
        while (compra < 1) {

            do 
            {
                System.out.println("OJOOOO A TU COMEDIA");
                System.out.println("Deja corrijo la orden a nombre de Don comedia");
                compra = entrada.nextInt();
            } while (compra < 1);


        }


        Pizza pizaCool [] = new Pizza[compra];

        for (int i = 0; i < compra; i++) {


            System.out.println("Que pizza quieres?");
            System.out.println("1.- De Queso");
            System.out.println("2.- De Peperoni");
            System.out.println("3.- De Vegetariana");
            opc = entrada.nextInt();

// Espera que el comediante decida
           
            System.out.println("El tamaño no importa crack, pero aqui si xd");
            System.out.println("1. Chica");
            System.out.println("2. Mediana");
            System.out.println("3. Grande");
            System.out.println("4. Familiar");
            ac = entrada.nextInt();
         //Dejar que decida

            switch(opc){
                case 1:
                   
                    picsa = new Queso();

                    Queso ques = new Queso();
                    ques.elegirtipoqueso();

                    picsa.hornear();
                    picsa.cortar(ac);
                    picsa.empacar();
                    if (ques.equals("Sorpresa")){
                        total += precio[ac-1];
                    }


                    else
                    {
                        total += precio[ac+3];
                    }

                    break;



                case 2:
                    picsa = new Peperonni();
                    Peperonni Pep = new Peperonni();
                    Pep.elegirpeperoni();
                    picsa.hornear();
                    picsa.cortar(ac);
                    picsa.empacar();
                    total += precio[ac+7];

                    break;



                case 3:
                    picsa = new Vegetariana();
                    Vegetariana Veg = new Vegetariana();
                    Veg.elegiringredientes();
                    picsa.hornear();
                    picsa.cortar(ac);
                    picsa.empacar();
                    total += precio[ac+11];
                break;


            }
        }
        System.out.println("Su total es de"+total);
    }
}
