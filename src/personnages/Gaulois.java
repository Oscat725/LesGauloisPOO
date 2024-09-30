package personnages;

import java.util.Set;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private Village village;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;

	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}



	public void frapper(Romain romain) {

		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		System.out.println("Merci Druide, je sense aue ma force est "+forcePotion+" fois decuplee");
		
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		System.out.println(Asterix);
		Romain Cesar = new Romain("Cesar", 5);
		Asterix.prendreParole();
		Asterix.parler("Yo soy el Asterix");
		Asterix.frapper(Cesar);
	}
}
