public class Treno {
    
    //attributi
    private String nome;
    private Motore motore;
    private int velocitàmassima;


    
    //metodo costruttore
    public Treno(String nome,int velocitàmassima,Motore motore){

        this.nome=nome;
        this.velocitàmassima=velocitàmassima;
        this.motore=motore;

        
    }
    
    public Treno(){
        this.nome="";
        this.velocitàmassima=0;
        this.motore=null;

    }
    
    public Treno(Treno that){
        this.nome=that.nome;
        this.velocitàmassima=that.velocitàmassima;
        this.motore=that.motore;

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
    
        
        public String toString(){
        return " tipo di treno "+this.nome+" velocità massima k/h "+this.velocitàmassima+" motore "+this.motore;
    }
    
    
    public boolean equals(Treno that){
       boolean r=false;
       if(this.nome==that.nome && this.velocitàmassima==that.velocitàmassima && this.motore==that.motore){
           r=true;
       }
       return r;
    }

}