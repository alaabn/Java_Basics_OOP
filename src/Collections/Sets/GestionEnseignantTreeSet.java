package Collections.Sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import Collections.Interface.IGestionEnseignant;

public class GestionEnseignantTreeSet implements IGestionEnseignant {
    private Set<Enseignant> treeE = new TreeSet<Enseignant>(Comparator.comparingInt(Enseignant::getId));

    @Override
    public void ajouterEnseignant(Enseignant e) {
        treeE.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return treeE.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant e : treeE) {
            if (e.getId() == id)
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        treeE.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for (Enseignant e : treeE)
            System.out.println(e);
    }

}
