public class Persona {
    
    //attributi
    private String nome;
    private String cognome;
    private int età;
    

    
    //metodo costruttore
    public Persona(String nome, String cognome,int età){
        this.nome=nome;
        this.cognome=cognome;
        this.età=età;


        
    }
    
    public Persona(){
        this.nome="";
        this.cognome="";
        this.età=0;


    }
    
    public Persona(Persona that){
        this.nome=that.nome;
        this.cognome=that.cognome;
        this.età=that.età;


    }
    
    
    //metodi get  
    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public int getEtà(){
        return this.età;
    }


    
    //metodi set   
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    public void setEtà(int età){
        this.età=età;
    }

    
    
        
        public String toString(){
        return "Nome "+this.nome+" Cognome "+this.cognome+" Età "+this.età;
    }
    
    
    public boolean equals(Persona that){
       boolean r=false;
       if(this.nome==that.nome && this.cognome==that.cognome && this.età==that.età){
           r=true;
       }
       return r;
    }
}