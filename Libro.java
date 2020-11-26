public class Libro{
    
    private String Titulo;
    private String Autor;
    private int noLibro;
    private int noPrestados;

    public Libro(){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.noLibro = noLibro;
        this.noPrestados = noPrestados;
    }

    public void setTitulo(String Titulo){
        this.Titulo = Titulo;
    }
    public String getTitulo(){
        return Titulo;
    }

    public void setAutor(String Autor){
        this.Autor = Autor;
    }
    public String getAutor(){
        return Autor;
    }

    public void setNoLibro(int noLibro){
        this.noLibro = noLibro;
    }
    public int getNoLibro(){
        return noLibro;
    }

    public void setNoPrestados(int noPrestados){
        this.noPrestados = noPrestados;
    }
    public int getNoPrestados(){
        return noPrestados;
    }
}
