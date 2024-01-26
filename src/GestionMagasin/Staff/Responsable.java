package Staff;

public class Responsable extends Employe {
    private double prime;

    public Responsable(int Id, String nom, String adresse, int nbr_heures, double prime) {
        super(Id, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    public void afficher() {
        super.afficher();
        System.out.println(" Prime: " + prime);
    }

    @Override
    public String toString() {
        return super.toString() + " Prime: " + prime;
    }

    public double calculSalaire() {
        return nbr_heures > 160 ? 160 * 10 + (nbr_heures - 160) * 12 + prime : nbr_heures * 10 + prime;
    }
}
