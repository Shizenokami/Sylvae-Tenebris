package creatures;

public abstract class Creature {
	
	protected String nom;	
	protected int[] pdv;
	protected int[] arm;
	protected int[] ini;
	

	public Creature(String nom, int[] pdv, int[] arm, int[] ini) {
		this.nom=nom;
		this.pdv = new int[] {pdv[0],pdv[1],pdv[0]+ (int) Math.floor(Math.random()*(pdv[1]-1)+1)};
		this.arm = new int[] {arm[0],arm[1],arm[0]+ (int) Math.floor(Math.random()*(arm[1]-1)+1)};
		this.ini = new int[] {ini[0],ini[1],ini[0]+ (int) Math.floor(Math.random()*(ini[1]-1)+1)};
	}
	
	public void addPdv(int val) {
		pdv[2] = Math.min(pdv[2]+val,pdv[0]+pdv[1]);
	}
	
	public void addArm(int val) {
		arm[2] = Math.min(arm[2]+val,arm[0]+arm[1]);
	}
	
	public void addIni(int val) {
		ini[2] = Math.min(ini[2]+val,ini[0]+ini[1]);
	}
	
	public int getPdv() {
		return pdv[2];
	}
	
	public int getArm() {
		return arm[2];
	}
	
	public int getIni() {
		return ini[2];
	}
	
	public String toString() {
		return nom + ": \n" 
				+ pdv + "PdV\n"
				+ arm + "Armure\n"
				+ ini + "Initiative";
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
		} else if (def.equals("encaisse")) {
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
		}
	}

}
