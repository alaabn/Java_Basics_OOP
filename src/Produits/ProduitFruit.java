package Produits;

public class ProduitFruit extends ProduitAgricole {
    public ProduitFruit(int Id, String libelle, String type, double quantite, String saison) {
        super(Id, libelle, type, quantite, saison);
    }

    @Override
    public void afficher() {
        System.out.println("Id: " + Id + " Type: " + type + " Libelle: " + libelle + " Quantité: " + quantite);
    }

    public double getQuantite() {
        return super.getQuantite();
    }

    @Override
    public boolean estFrais(String saison) {
        return saison == this.saison ? true : false;
    }
}
