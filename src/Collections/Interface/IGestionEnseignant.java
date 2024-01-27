package Collections.Interface;

import Collections.Sets.Enseignant;

public interface IGestionEnseignant {
    public void ajouterEnseignant(Enseignant e);

    public boolean rechercherEnseignant(Enseignant e);

    public boolean rechercherEnseignant(int id);

    public void supprimerEnseignant(Enseignant e);

    public void displayEnseignants();
}