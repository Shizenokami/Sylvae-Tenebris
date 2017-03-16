package creatures;

public class Magie {
	
	protected short Destr;
	protected short Regen;
	protected short Alté;
	protected short Conju;
	protected short Ampli;
	
	public Magie (short dest, short regen, short alte, short conju, short ampli) {
		if (dest<4 && regen <4 && alte <4 && conju<4 && ampli<4) {
			this.Destr=dest;
			this.Regen=regen;
			this.Alté=alte;
			this.Conju=conju;
			this.Ampli=ampli;
		} else {
			System.out.println("erreur, aucune des valeures ne doit dépasser 3.");
		}
	}
	
	

}
