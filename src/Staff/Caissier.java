package Staff;

public class Caissier extends Employe {
    private int numero_caisse;

    public Caissier(int Id, String nom, String adresse, int nbr_heures, int numero_caisse) {
        super(Id, nom, adresse, nbr_heures);
        this.numero_caisse = numero_caisse;
    }

    public void afficher() {
        super.afficher();
        System.out.println(" #Caisse: " + numero_caisse);
    }

    @Override
    public String toString() {
        return super.toString() + " #Caisse: " + numero_caisse;
    }

    public double calculSalaire() {
        return nbr_heures > 150 ? 180 * 5 + (nbr_heures - 180) * 11.5 : nbr_heures * 5;
    }
}
