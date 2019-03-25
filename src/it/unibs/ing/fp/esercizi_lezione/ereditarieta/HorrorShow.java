package it.unibs.ing.fp.esercizi_lezione.ereditarieta;


interface Monster {
  void menace();
}
interface DangerousMonster extends Monster {
  void destroy();
}
interface Lethal {
  void kill();
}
class DragonZilla implements DangerousMonster {
  public void menace() {System.out.println("ORA TI MANGIO ...");}
  public void destroy() {System.out.println("MANGIATO !");}
}
interface Vampire 
    extends DangerousMonster, Lethal {
	  void drinkBlood();
}

class Transilvan implements Vampire {
	public void menace() {System.out.println("ORA TI MORDO ...");}
	public void drinkBlood() {System.out.println("GLU, GLU, GLU ...");}
    public void kill() {System.out.println("VAMPIRIZZATO !");}
	public void destroy() {System.out.println("DISSANGUATO !");}
}


public class HorrorShow 
{
	

  static void canCheAbbaia(Monster b) { 
		b.menace();
		System.out.println("---------------------");
		}
  static void terminator(DangerousMonster d) {
    d.menace();
    d.destroy();
	System.out.println("---------------------");
   }
   static void vampirator(Vampire v) {
	 v.menace();
	 v.drinkBlood();
	 v.kill();
	 System.out.println("---------------------");
   }

   public static void main(String[] args) 
   {
	   
	    DragonZilla drago = new DragonZilla();
		Transilvan dracula = new Transilvan();
		Vampire nosferatu = new Transilvan();
		
    	canCheAbbaia(drago);
		canCheAbbaia(dracula);
    	terminator(nosferatu);
		terminator(drago);
		//vampirator(drago);
		vampirator(dracula);
		vampirator(nosferatu);
  }
}
