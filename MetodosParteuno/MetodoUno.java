import java.util.Scanner;

public class MetodoUno{ 
    Scanner entrada = new Scanner(System.in);
        
    int figura; 
    int base;
    int altura;
    int radio;
    int ladoa; 
    int ladob;

    
    double perimetro;
     double area;
    
    public void Figuras(){

        System.out.println("Juarez Diaz Isaac Uriel - 3IV9");


        System.out.println("Bienvenido Comediante");
        System.out.println("Seleccione Una Opcion");


        System.out.println("1 -Circulo");
        System.out.println("2 - Rectangulo");
        System.out.println("3 - Cuadrado");
        System.out.println("4  - Triangulo");
        
        figura = entrada.nextInt();
        
        switch(figura){
            case 1:
                Circo();
            break;

            case 2:
                Recta();
            break;
            
            case 3:
                Cuadra();
            break;

            case 4:
                Tria();
            break;
        }
    }



    public void Circo()
    
    {
        System.out.println("OJOO Te mandaron al circo xd");
        System.out.println("Inserta el Radio");
        
        radio = entrada.nextInt();
        perimetro = (2*3.14)*radio;
        area = 3.14*(radio*radio);
        
        System.out.println("La circunferencia es  " + perimetro);
        System.out.println("El Area es " + area);

        System.out.println("Ten mas cuidado con la comedia compañero, no querras estar en el circo"); 
    }


    public void Recta()
    
    {
        System.out.println("Introduce la base de tu rectangulo");
        
        base = entrada.nextInt();
        
        System.out.println("Ahora introduce la altura");
        
        altura = entrada.nextInt();
        perimetro = base*altura;
        area = 2*(base+altura);

        System.out.println("El perimetro es de " + perimetro);
        System.out.println("El area es " + area);
    }


    public void Cuadra()
    
    {
        System.out.println("Inserta el lado del cuadrado");

        base = entrada.nextInt();
        perimetro = base*4;
        area = base*base;

        System.out.println("El perimetro es " + perimetro);
        System.out.println("El area es " + area);
    }


    public void Tria()
    
    {
        System.out.println("Inserta la base ");
        
        base = entrada.nextInt();

        System.out.println("Inserta a y b");
        
        ladoa = entrada.nextInt();
        ladob = entrada.nextInt();

        System.out.println("InSerta la altura");
        
        altura = entrada.nextInt();

        perimetro = base+ladoa+ladob;
        area = altura*(base/2);

        System.out.println("El perimetro es  " +  perimetro);
        System.out.println("El area es " + area);
    }

    
}
