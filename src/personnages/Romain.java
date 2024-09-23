package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force ) {
		this.nom = nom;
		this.force = force;
		assert force >0;
	}

	public String getNom() {
		return nom;
	}

	private void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

	private String prendreParole() {

		return "Le romain " + nom + " : ";
	}

	void recevoirCoup(int forceCoup) {
		assert force>0 : "pre-condition de recevoir coup";
		int ini=force;
		force -= forceCoup;
		
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force<ini : "post-condition de recevoir coup";

	}
	
	public static void main(String[] args) {
		Romain Minus = new Romain("Minus", 6);
		System.out.println(Minus);
	}
}
