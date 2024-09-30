package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + ">>");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public int preparerPotion() {
		Random generateur=new Random();
		int valeurpot;
		valeurpot = generateur.nextInt(effetPotionMax);
		while (valeurpot < effetPotionMin) {
			valeurpot = generateur.nextInt(effetPotionMax);
		}
		if (valeurpot > 7) {
			System.out.println("J'ai prepare une super potion de forece "+valeurpot);
			return valeurpot;
		} else {
			System.out.println("Je n'ai pas trouve tous les ingredients, ma potion est seulement de force "+valeurpot);
			return valeurpot;
		}
		
	}

	public void booster(Gaulois gaulois) {
		if (gaulois.getNom()=="Obélix") {
			System.out.println("Non, Obélix !... Tu n'auras pas de potion magique!");
		} else {
			gaulois.boirePotion(preparerPotion());
		}
		
	}

}
