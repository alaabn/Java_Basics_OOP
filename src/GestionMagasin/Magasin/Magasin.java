package Magasin;

import Produits.Produit;
import Produits.ProduitFruit;
import Staff.Employe;

public class Magasin {
    private int Id, CPT = 0, CPT_EMP = 0;
    private static int CPT_TOTALE = 0;
    private String nom, adresse;
    private final int CPT_P_MAX = 50;
    private final int CPT_EMP_MAX = 20;
    private Produit[] ensemble_produit = new Produit[CPT_P_MAX];
    private Employe[] employes = new Employe[CPT_EMP_MAX];

    public Magasin(int Id, String nom, String adresse) {
        this.Id = Id;
        this.nom = nom;
        this.adresse = adresse;
    }

    public void ajoutProduit(Produit p) {
        if (CPT <= CPT_P_MAX && chercherProduit(p) < 0) {
            ensemble_produit[CPT++] = p;
            CPT_TOTALE++;
        }
    }

    public String afficher() {
        StringBuilder sb = new StringBuilder();
        sb.append("Detail Magasin --> Id: " + Id + " Nom: " + nom + " Adresse: " + adresse)
                .append("\nProduits Du Magasin -->");
        for (int i = 0; i <= CPT - 1; i++)
            sb.append("\n" + ensemble_produit[i]);
        sb.append("\nEmployes Du Magasin --->");
        for (int i = 0; i <= CPT_EMP - 1; i++)
            sb.append("\n" + employes[i]);

        return sb.toString();
    }

    public static int nbrTotalProduitsMagasins() {
        return CPT_TOTALE;
    }

    public int chercherProduit(Produit p) {
        for (int i = 0; i <= CPT - 1; i++) {
            if (ensemble_produit[i] == p)
                return i;
        }
        return -1;
    }

    public void supprimerProduit(Produit p) {
        if (chercherProduit(p) >= 0)
            for (int i = chercherProduit(p); i <= CPT - 1; i++) {
                ensemble_produit[i] = ensemble_produit[i + 1];
                CPT--;
            }
    }

    public int nmbrProduit() {
        return CPT;
    }

    @Override
    public String toString() {
        return nom;
    }

    public static String magasinSup(Magasin m1, Magasin m2) {
        if (m1.nmbrProduit() > m2.nmbrProduit())
            return m1.toString();
        return m2.toString();
    }

    public void ajoutEmploye(Employe e) {
        if (CPT_EMP <= CPT_EMP_MAX) {
            employes[CPT_EMP++] = e;
        }
    }

    public float calculStock() {
        double stockFruit = 0;
        for (int i = 0; i <= CPT - 1; i++) {
            if (ensemble_produit[i].determinerTypeProduit() == "Fruit") {
                stockFruit += ((ProduitFruit) ensemble_produit[i]).getQuantite();
            }
        }
        return (float) stockFruit;
    }
}
