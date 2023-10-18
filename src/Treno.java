public class Treno {
    
    //attributi
    private String nome;
    private Motore motore;
    private int velocitàmassima;
    private String destinazione;


    
    //metodo costruttore
    public Treno(String nome,int velocitàmassima,Motore motore, String destinazione){

        this.nome=nome;
        this.velocitàmassima=velocitàmassima;
        this.motore=motore;
        this.destinazione=destinazione;

        
    }
    
    public Treno(){
        this.nome="";
        this.velocitàmassima=0;
        this.motore=null;
        this.destinazione="";

    }
    
    public Treno(Treno that){
        this.nome=that.nome;
        this.velocitàmassima=that.velocitàmassima;
        this.motore=that.motore;
        this.destinazione=that.destinazione;

    }
    
    
    //metodi get  
    public String getNome(){
        return this.nome;
    }
    public int getVelocitàmassima(){
        return this.velocitàmassima;
    }
    public Motore getMotore(){
        return this.motore;
    }
    public String getDestinazione(){
        return this.destinazione;
    }


    
    //metodi set   
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setVelocitàmassima(int velocitàmassima){
        this.velocitàmassima=velocitàmassima;
    }
    public void setMotore(Motore motore){
        this.motore=motore;
    }
    public void setDestinazione(String destinazione){
        this.destinazione=destinazione;
    }
    


        
        public String toString(){
        return " tipo di treno "+this.nome+" velocità massima k/h "+this.velocitàmassima+" motore "+this.motore+" destinazione "+this.destinazione;
    }
    
    
    public boolean equals(Treno that){
       boolean r=false;
       if(this.nome==that.nome && this.velocitàmassima==that.velocitàmassima && this.motore==that.motore && this.destinazione==that.destinazione){
           r=true;
       }
       return r;
    }

}