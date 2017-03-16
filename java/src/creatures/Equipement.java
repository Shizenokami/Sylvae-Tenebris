package creatures;

public class Equipement {
	
	protected String nom;
	protected int statE;
	protected int statS;
	protected int statP;
	protected int deg;
	protected String modificateur;
	
	public Equipement (String nom) {
		this.nom=nom;
	}
	
	public void setStatE(int E) {
		this.statE=E;
	}
	
	public void setStatS(int S) {
		this.statS=S;
	}
	
	public void setStatP(int P) {
		this.statP=P;
	}
	
	public void setDeg(int deg) {
		this.deg=deg;
	}
	
	public void setModificateur(String modif) {
		this.modificateur=modif;
	}
	
	public int getStatE() {
		return statE;
	}
	
	public int getStatS() {
		return this.statS;
	}
	
	public int getStatP() {
		return this.statP;
	}
	
	public int getDeg() {
		return this.deg;
	}
	
	public String getModificateur() {
		return this.modificateur;
	}

}
