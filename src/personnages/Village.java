package personnages;

public class Village {
	private String nom;
	private Gaulois[] villageois;
	private Chef chef;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	private boolean ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			return true;
		}
		return false;

	}

	private Gaulois trouverHabitant(int reference) {
		if (0 <= reference && reference < villageois.length) {
			return villageois[reference];
		}
		return null;
	}
	
	private void afficherVillageois() {
		System.out.println("Dans le village "+nom+" du Chef "+ chef.getNom() +" Vivent les legendaires gaulois :");
		int indice =0;
		while (villageois[indice]!=null) {
			System.out.println(" - "+villageois[indice].getNom());
			indice++;
		}
		

	}

	public static void main(String[] args) {
		Village desIrreductibles = new Village("Village des Irreductibles", 30);
		Chef Abrax = new Chef("Abraracourcix", 6, desIrreductibles);
		desIrreductibles.setChef(Abrax);
		Gaulois Asterix = new Gaulois("Asterix", 8);
		desIrreductibles.ajouterHabitant(Asterix);
		Gaulois Obelix = new Gaulois("Obélix", 25);
		desIrreductibles.ajouterHabitant(Obelix);
		desIrreductibles.afficherVillageois();
	}

}
