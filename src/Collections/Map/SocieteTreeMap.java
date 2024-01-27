package Collections.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import Collections.Interface.ISociete;

public class SocieteTreeMap implements ISociete {
    private Map<Employe, Departement> treeME = new TreeMap<Employe, Departement>(
            Comparator.comparingInt(Employe::getCin));

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        treeME.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        treeME.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Entry<Employe, Departement> e : treeME.entrySet())
            System.out.println(e.getKey() + " --> " + e.getValue());
    }

    @Override
    public void afficherLesEmployes() {
        for (Entry<Employe, Departement> e : treeME.entrySet())
            System.out.println(e.getKey());
    }

    @Override
    public void afficherLesDepartements() {
        for (Entry<Employe, Departement> e : treeME.entrySet())
            System.out.println(e.getValue());
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(treeME.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        for (Entry<Employe, Departement> ee : treeME.entrySet())
            if (ee.getKey() == e)
                return true;
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        for (Entry<Employe, Departement> ee : treeME.entrySet())
            if (ee.getValue() == e)
                return true;
        return false;
    }

}
