public class Libros 

extends Libro{
    private int rLibro;
    private int rPrestados;


    public Libros(){}
    public void random(){
        
        rLibro = ((int)Math.round(Math.random()*20));

        do
        {
            rPrestados = ((int)Math.round(Math.random()*20));
        }
        while(rPrestados>rLibro);
        setNoLibro(rLibro);
        setNoPrestados(rPrestados);
    }
}