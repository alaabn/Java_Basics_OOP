package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Collections.Interface.ISociete;

public class SocieteHashMap implements ISociete {
    private Map<Employe, Departement> hashME = new HashMap<Employe, Departement>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        hashME.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        hashME.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Entry<Employe, Departement> e : hashME.entrySet())
            System.out.println(e.getKey() + " --> " + e.getValue());
    }

    @Override
    public void afficherLesEmployes() {
        for (Entry<Employe, Departement> e : hashME.entrySet())
            System.out.println(e.getKey());
    }

    @Override
    public void afficherLesDepartements() {
        for (Entry<Employe, Departement> e : hashME.entrySet())
            System.out.println(e.getValue());
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(hashME.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        for (Entry<Employe, Departement> ee : hashME.entrySet())
            if (ee.getKey() == e)
                return true;
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        for (Entry<Employe, Departement> ee : hashME.entrySet())
            if (ee.getValue() == e)
                return true;
        return false;
    }
}
