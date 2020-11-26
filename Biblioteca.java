import java.util.*;

public class Biblioteca{
    public void Biblioteca(){
        
        Scanner entrada = new Scanner(System.in);
        Operaciones obj = new Operaciones();

        Libros l = new Libros();

        int Op;
        int i;
        int Cant;
        int ID;

        try{
            do{
                System.out.println("Ingrese la cantidad de libros");
                Cant = entrada.nextInt();

                if(Cant<=0){
                    System.out.println("Ojo a la comedia");
                }
            }while(Cant<=0);

            entrada.nextLine();

            String Titulos[] = new String[Cant];
            String Autores[] = new String[Cant];


            int Libros[] = new int[Cant];
            int Prestados[] = new int[Cant];
            int Disponibles[] = new int[Cant];

            for(i=0;i<Cant;i++)

            {

                System.out.println("Ingrese el titulo del libro del libro "+(i+1));
                Titulos[i] = entrada.nextLine();
                System.out.println("Ingrese el nombre del autor  "+(i+1));
                Autores[i] = entrada.nextLine();
                l.random();
                Libros[i] = l.getNoLibro();
                Prestados[i] = l.getNoPrestados();
            }

            for(i=0;i<Cant;i++){
                Disponibles[i] = (Libros[i]-Prestados[i]);
                System.out.println(Titulos[i]+", "+Autores[i]+", disponibles: "+Disponibles[i]);
            }
            do{
                System.out.println("Elija una opcion");
                System.out.println("1.- Robar xd ");
                System.out.println("2.- Devolver a la policia");
                System.out.println("3.- Salir huyendo");
                Op = entrada.nextInt();

                switch(Op){

                    case 1:
                        obj.mostrar(Titulos, Autores, Disponibles);

                        do{
                            System.out.println("Ingrese el ID del libro que va a Pedir prestado xdxd");
                            ID = entrada.nextInt();

                            if(ID<0||ID>=Cant)

                            {
                                System.out.println("Ojo al  de comedia");
                            }

                        }while(ID<0||ID>=Cant);

                        if(Disponibles[ID]>0)
                        {
                            Disponibles[ID] -= 1;
                        }
                        else

                        {
                            System.out.println("No se puede,admin esperando");
                        }

                    break;


                    case 2:
                        obj.mostrar(Titulos, Autores, Disponibles);

                        do{
                            System.out.println("Ingrese el ID del libro que va a devolver");
                            ID = entrada.nextInt();

                            if(ID<0||ID>=Cant)
                            {
                                System.out.println("Ojo al don comedia");
                            }


                        }while(ID<0||ID>=Cant);

                        Disponibles[ID] += 1;
                    break;


                    case 3:
                        System.out.println("A mimir");
                    break;


                }
            }while(Op!=3);

        }catch(Exception e)

        {
            System.out.println("Ojo al comediante");
        }
    }
}