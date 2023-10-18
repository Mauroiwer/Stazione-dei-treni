
public class App
{
	public static void main(String[] args) {
	   Motore motore= new Motore(1500);
	   Treno tsr= new Treno("TSR",70, motore,"kyoto");
	   Pilota mauro= new Pilota("Mauro", "Depari", 17, 'D');
	   
	   
	   System.out.println(tsr.toString());
	   System.out.println(mauro.toString());
	   System.out.println(motore.toString());

	   
	}
}
