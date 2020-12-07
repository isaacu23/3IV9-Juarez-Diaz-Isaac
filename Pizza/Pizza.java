public class Pizza{

    private String masa;
    private String[] salsa;
    protected String[] ingredientes;



    public Pizza(){}
    
    public Pizza(String masa, String[] salsa, String[] ingredientes)
    
    {
        this.masa = masa;
        this.salsa = salsa;
        this.ingredientes = ingredientes;
    }



    public String getMasa() 


    {
        return masa;
    }


    public void setMasa(String masa)


     {
        this.masa = masa;
    }


    public String[] getSalsa() 
    
    {
        return salsa;
    }


    public void setSalsa(String[] salsa) 
    
    {
        this.salsa = salsa;
    }


    public String[] getIngredientes()
    
    {
        return ingredientes;
    }


    public void setIngredientes(String[] ingredientes) 
    
    {
        this.ingredientes = ingredientes;
    }


    public void hornear()
    
    {
        System.out.println("Honear la pizza toma 15 min");
    }


    public void cortar(int porciones)


    
    {
        switch(porciones){
            case 1:
                System.out.println("Se divide en 4");
                break;
            case 2:
                System.out.println("Se divide en 8");
                break;
            case 3:
                System.out.println("Se divide en 12");
                break;
            case 4:
                System.out.println("Se divide en 16");
            break;
        }
    }



    public void empacar(){
        System.out.println("Preparate para disfrutarla");
        System.out.println("Tu pizza estar lista muy promnto comediante");
        System.out.println("Si gustas dejar propina no hay roblema");
    }
}