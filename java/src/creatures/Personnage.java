package creatures;

public class Personnage extends Creature {
	
	protected Equipements equipements;
	protected Magie magie;

	public Personnage(String nom, int pdv, int arm, int ini, short[] magie) {
		super(nom,pdv, arm, ini);
		this.equipements= new Equipements();
		this.magie = new Magie(magie[0],magie[1],magie[2],magie[3],magie[4]);
	}
	
	public String toString() {
		return nom + ": \n" 
				+ String.valueOf(pointsdevie) + "Sève\n"
				+ String.valueOf(armure) + "Ecorce\n"
				+ String.valueOf(initiative) + "Pollen"
				+ equipements.toString()
				+ magie.toString();
	}
	
	

}
