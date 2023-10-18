public class Motore {
    
    //attributi
    private int cavalli;


    

    
    //metodo costruttore
    public Motore(int cavalli){
        this.cavalli=cavalli;


        
    }
    
    public Motore(){
        this.cavalli=0;



    }
    
    public Motore(Motore that){
        this.cavalli=that.cavalli;


    }
    
    
    //metodi get  
    public int getNome(){
        return this.cavalli;
    }


    
    //metodi set   
    
    public void setNome(int cavalli){
        this.cavalli=cavalli;
    }


    
    
        
        public String toString(){
        return "Cavalli "+this.cavalli;
    }
    
    
    public boolean equals(Motore that){
       boolean r=false;
       if(this.cavalli==that.cavalli){
           r=true;
       }
       return r;
    }
}