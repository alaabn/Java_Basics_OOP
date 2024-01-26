package Produits;

;

public class ProduitLegume extends ProduitAgricole {
    public ProduitLegume(int Id, String libelle, String type, double quantite, String saison) {
        super(Id, libelle, type, quantite, saison);
    }

    @Override
    public void afficher() {
        System.out.println("Id: " + Id + " Type: " + type + " Libelle: " + libelle + " Quantité: " + quantite);
    }

    @Override
    public boolean estFrais(String saison) {
        String[] saisons = { "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre",
                "octobre", "novembre", "décembre" };

        for (int i = 0; i < saisons.length; i++) {
            if (saison == saisons[i] && this.saison == saisons[i == 0 ? 11 : i - 1] || saison == this.saison)
                return true;
        }

        return false;
    }
}
