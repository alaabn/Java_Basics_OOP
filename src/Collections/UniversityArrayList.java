package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Collections.Interface.IUniversity;

public class UniversityArrayList implements IUniversity {
    private List<Etudiant> tabE = new ArrayList<>();

    @Override
    public void ajouterEtudiant(Etudiant e) {
        tabE.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return tabE.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant et : tabE) {
            if (et.getNom() == nom)
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        for (Etudiant et : tabE) {
            if (et.equals(e))
                tabE.remove(et);
        }
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant e : tabE) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        tabE.sort(Comparator.comparing(Etudiant::getId));
    }

    @Override
    public void trierEtudiantsParNom() {
        tabE.sort((e1, e2) -> e1.getNom().compareToIgnoreCase(e2.getNom()));
    }

}
