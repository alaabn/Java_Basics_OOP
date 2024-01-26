package Produits;

import Produits.Interface.Critere;

public abstract class ProduitAgricole extends Produit implements Critere {
    protected String type, saison;
    protected double quantite;

    public ProduitAgricole(int Id, String libelle, String type, double quantite, String saison) {
        super(Id, libelle);
        this.type = type;
        this.saison = saison;
        this.quantite = quantite;
    }

    public double getQuantite() {
        return quantite;
    };
}
