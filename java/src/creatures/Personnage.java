package creatures;

public class Personnage extends Creature {
	
	protected Equipements equipements;
	protected Magie magie;
	

	public Personnage(String nom, int[] pdv, int[] arm, int[] ini, int Pdice, short[] magie) {
		super(nom,pdv, arm, ini);
		this.equipements= new Equipements();
		this.magie = new Magie(magie[0],magie[1],magie[2],magie[3],magie[4]);
	}
	
	public String toString() {
		return nom + ": \n" 
				+ String.valueOf(pdv) + "Sève\n"
				+ String.valueOf(arm) + "Ecorce\n"
				+ String.valueOf(ini) + "Pollen"
				+ equipements.toString()
				+ magie.toString();
	}

	public void resetDailyStats() {
		pdv[2] = pdv[0]+ (int) Math.floor(Math.random()*(pdv[1]-1)+1);
		arm[2] = arm[0]+ (int) Math.floor(Math.random()*(arm[1]-1)+1);
		ini[2] = ini[0]+ (int) Math.floor(Math.random()*(ini[1]-1)+1);
	}
	
	

}
