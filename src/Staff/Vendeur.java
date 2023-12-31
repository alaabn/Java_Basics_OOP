package Staff;

public class Vendeur extends Employe {
    private double taux_de_vente;

    public Vendeur(int Id, String nom, String adresse, int nbr_heures, double taux_de_vente) {
        super(Id, nom, adresse, nbr_heures);
        this.taux_de_vente = taux_de_vente;
    }

    public void afficher() {
        super.afficher();
        System.out.println(" Taux de Ventes: " + taux_de_vente);
    }

    @Override
    public String toString() {
        return super.toString() + " Taux de Ventes: " + taux_de_vente;
    }

    public double calculSalaire() {
        return 450 * taux_de_vente;
    }
}