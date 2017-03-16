package creatures;

import java.util.ArrayList;

public class Equipements {
	
	public ArrayList<Equipement> equipements = new ArrayList<Equipement>();
	
	public Equipements() {
		
	}
	
	public void addEquipement(Equipement stuff) {
		this.equipements.add(stuff);
	}
	
	public void rmvEquipement(Equipement stuff) {
		equipements.remove(stuff);
	}
	
	public String toString() {
		String c = "" ;
		for (Equipement e : this.equipements) {
			c+=e.toString();
		} return c;
	}
	

}
