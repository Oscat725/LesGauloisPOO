package personnages;

import java.util.Set;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	public Gaulois(String nom, int force, Village village) {
		this.nom = nom;
		this.force = force;
		this.village = village;

	}

	public String getNom() {
		return nom;
	}

	private void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	private void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8, null);
		System.out.println(Asterix);
		Romain Cesar = new Romain("Cesar", 5);
		Asterix.prendreParole();
		Asterix.parler("Yo soy el Asterix");
		Asterix.frapper(Cesar);
	}
}
