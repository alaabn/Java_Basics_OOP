package Collections.Interface;

import Collections.Map.Departement;
import Collections.Map.Employe;

public interface ISociete {
    public void ajouterEmployeDepartement(Employe e, Departement d);

    public void supprimerEmploye(Employe e);

    public void afficherLesEmployesLeursDepartements();

    public void afficherLesEmployes();

    public void afficherLesDepartements();

    public void afficherDepartement(Employe e);

    public boolean rechercherEmploye(Employe e);

    public boolean rechercherDepartement(Departement e);
}
