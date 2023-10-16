public class Pilota  extends Persona{
    
    private char patente;
    
    
        //metodo costruttore
    public Pilota(String nome, String cognome, int eta, char patente){
        super(nome, cognome, eta);
        this.patente=patente;

   

        
    }
    
    public Pilota(){
        super();
        this.patente=0;

  

    }
    
    public Pilota(Pilota that){
        super(that);
        this.patente=that.patente;



    }
    
    
    //metodi get  
    public char getMarca(){
        return this.patente;
    }


    
    //metodi set   
    
    public void setMarca(char patente){
        this.patente=patente;
    }

      

      
      
        
        public String toString(){
        return super.toString()+ " Patente "+this.patente;
    }
    
    
    public boolean equals(Pilota that){
       boolean r=false;
       if(this.patente==that.patente && super.equals(that)){
           r=true;
       }
       return r;
    }

    
    
    
    
}