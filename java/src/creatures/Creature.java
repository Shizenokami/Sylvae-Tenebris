package creatures;

public abstract class Creature {
	
	protected String nom;	
	protected int pointsdevie;
	protected int armure;
	protected int initiative;
	

	public Creature(String nom,int pdv,int arm,int ini) {
		this.nom=nom;
		this.pointsdevie=pdv;
		this.armure=arm;
		this.initiative=ini;
	}
	
	public void addPdv(int val) {
		this.pointsdevie+=val;
	}
	
	public void addArm(int val) {
		this.armure+=val;
	}
	
	public void addIni(int val) {
		this.initiative+=val;
	}
	
	public int getPdv() {
		return this.pointsdevie;
	}
	
	public int getArm() {
		return this.armure;
	}
	
	public int getIni() {
		return this.initiative;
	}
	
	public String toString() {
		return nom + ": \n" 
				+ String.valueOf(pointsdevie) + "PdV\n"
				+ String.valueOf(armure) + "Armure\n"
				+ String.valueOf(initiative) + "Initiative";
	}
	
	//  ACTIONS
	public void attaque(int stat, char stattype,Equipement stuff, Personnage ennemi,String def) {
		if (def.equals("parade")) {
			if (stattype=='E') {
				this.addArm(-stat);
			} else if (stattype=='S') {
				this.addPdv(-stat);
			} else if (stattype=='P') {
				this.addIni(-stat);
			} else {
				
			}
			int val = stuff.getDeg();
			ennemi.addArm(-val*stat);
		} else if (def.equals("esquive")) {
			if (stattype=='E') {
				this.addArm(-stat);
			} else if (stattype=='S') {
				this.addPdv(-stat);
			} else if (stattype=='P') {
				this.addIni(-stat);
			} else {
				
			}
			int val = stuff.getDeg();
			ennemi.addIni(-val*stat);
		} else if (def.equals("")) {
			if (stattype=='E') {
				this.addArm(-stat);
			} else if (stattype=='S') {
				this.addPdv(-stat);
			} else if (stattype=='P') {
				this.addIni(-stat);
			} else {
				
			}
			int val = stuff.getDeg();
			ennemi.addPdv(-val*stat);
		}
	}

}
