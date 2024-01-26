package Staff;

public abstract class Employe {
    protected int Id, nbr_heures;
    protected String nom, adresse;

    public Employe(int Id, String nom, String adresse, int nbr_heures) {
        this.Id = Id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    public void afficher() {
        System.out.print(
                "Detail Employe --> Id: " + Id + " Nom: " + nom + " Adresse: " + adresse + " #Heures: " + nbr_heures);
    }

    public String toString() {
        return "Detail Employe --> Id: " + Id + " Nom: " + nom + " Adresse: " + adresse + " #Heures: " + nbr_heures;
    }

    public abstract double calculSalaire();
}
