package Collections.Sets;

import java.util.HashSet;
import java.util.Set;

import Collections.Interface.IGestionEnseignant;

public class GestionEnseignantHashSet implements IGestionEnseignant {
    private Set<Enseignant> hashE = new HashSet<Enseignant>();

    @Override
    public void ajouterEnseignant(Enseignant e) {
        hashE.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return hashE.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant e : hashE) {
            if (e.getId() == id)
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        hashE.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for (Enseignant e : hashE) {
            System.out.println(e);
        }
    }

}
