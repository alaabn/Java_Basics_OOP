package Produits;

import java.util.Date;

public class Produit {
    protected int Id;
    protected String libelle, marque;
    protected double prix;
    protected Date date_expiration;

    public Produit() {
    }

    public Produit(int Id, String libelle) {
        this.Id = Id;
        this.libelle = libelle;
    }

    public Produit(int Id, String libelle, String marque) {
        this.Id = Id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public Produit(int Id, String libelle, String marque, double prix) {
        this.Id = Id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public Produit(int Id, String libelle, String marque, double prix, Date date_expiration) {
        this.Id = Id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.date_expiration = date_expiration;
    }

    public void afficher() {
        System.out.println("Produit --> Id: " + Id + " Libelle: " + libelle + " Marque: " + marque + " Prix: " + prix
                + " Date D'expiration: " + date_expiration);
    }

    public void setPrix(double prix) {
        if (prix > 0)
            this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Detail Produit --> Id: " + Id + " Libelle: " + libelle + " Marque: " + marque + " Prix: " + prix
                + " Date D'expiration: " + date_expiration;
    }

    public void setDateExpiration(Date date_expiration) {
        this.date_expiration = date_expiration;
    }

    public boolean comparer(Produit p) {
        if (p.equals(this))
            return true;
        return false;
    }

    public static boolean comparer(Produit p1, Produit p2) {
        if (p1.equals(p2))
            return true;
        return false;
    }

    public String determinerTypeProduit() {
        if (this instanceof ProduitFruit)
            return "Fruit";
        if (this instanceof ProduitLegume)
            return "Legume";
        return "pas de type";
    }
}
