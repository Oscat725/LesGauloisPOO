package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;

	public Romain(String nom, int force ) {
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
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

	private void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat "+nom+" est deja bien protege");
		break;
		case 1:
			if (equipements[0] ==equipement) {
				System.out.println("Le soldat "+nom+" a deja un "+equipement+" !");
				
			}
			else {
				equipements[1]=equipement;
				System.out.println("Le soldat "+nom+" s'equipe avec un "+equipement);
			}
			break;
		case 0:
			equipements[0]=equipement;
			System.out.println("Le soldat "+nom+" s'equipe avec un "+equipement);
		}

	}
	
	
	public static void main(String[] args) {
		Romain Minus = new Romain("Minus", 6);
		System.out.println(Equipement.Bouclier);
	}
}
