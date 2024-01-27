package Collections;

import Collections.ArrayList.Etudiant;
import Collections.ArrayList.UniversityArrayList;
import Collections.Interface.IGestionEnseignant;
import Collections.Interface.ISociete;
import Collections.Interface.IUniversity;
import Collections.Map.Departement;
import Collections.Map.Employe;
import Collections.Map.SocieteHashMap;
import Collections.Map.SocieteTreeMap;
import Collections.Sets.Enseignant;
import Collections.Sets.GestionEnseignantHashSet;
import Collections.Sets.GestionEnseignantTreeSet;

public class Test {
    public static void main(String[] args) {
        // Partie I
        System.out.println("Partie I:");

        Etudiant etudiant1 = new Etudiant(1, "Enis", "Hash");
        Etudiant etudiant2 = new Etudiant(2, "Jawhar", "Z");
        Etudiant etudiant3 = new Etudiant(3, "Akil", "B");

        IUniversity university = new UniversityArrayList();

        university.ajouterEtudiant(etudiant1);
        university.ajouterEtudiant(etudiant2);
        university.ajouterEtudiant(etudiant3);

        System.out.println("\nListe des étudiants avant le tri:");
        university.displayEtudiants();

        System.out.println("\nRecherche d'un étudiant par nom:");
        System.out.println("\nRecherche de 'Enis': " + university.rechercherEtudiant("Enis"));

        System.out.println("\nSuppression d'un étudiant:");
        university.supprimerEtudiant(etudiant2);
        university.displayEtudiants();

        System.out.println("\nTri des étudiants par nom:");
        university.trierEtudiantsParNom();
        university.displayEtudiants();

        System.out.println("\nTri des étudiants par id:");
        university.trierEtudiantsParId();
        university.displayEtudiants();

        // Partie II
        System.out.println("\nPartie II:");

        Enseignant enseignant1 = new Enseignant(1, "Amine", "J");
        Enseignant enseignant2 = new Enseignant(2, "Mahmoud", "B");
        Enseignant enseignant3 = new Enseignant(3, "Sami", "L");

        IGestionEnseignant gestionEnseignantHashSet = new GestionEnseignantHashSet();

        gestionEnseignantHashSet.ajouterEnseignant(enseignant1);
        gestionEnseignantHashSet.ajouterEnseignant(enseignant2);
        gestionEnseignantHashSet.ajouterEnseignant(enseignant3);

        System.out.println("\nRecherche d'enseignant par ID dans HashSet :");
        System.out.println("Enseignant avec ID 2 trouvé : " + gestionEnseignantHashSet.rechercherEnseignant(2));
        System.out.println("Enseignant avec ID 4 trouvé : " + gestionEnseignantHashSet.rechercherEnseignant(4));
        System.out.println("Enseignant 3: " + gestionEnseignantHashSet.rechercherEnseignant(enseignant3));

        gestionEnseignantHashSet.displayEnseignants();

        IGestionEnseignant gestionEnseignantTreeSet = new GestionEnseignantTreeSet();

        gestionEnseignantTreeSet.ajouterEnseignant(enseignant1);
        gestionEnseignantTreeSet.ajouterEnseignant(enseignant2);
        gestionEnseignantTreeSet.ajouterEnseignant(enseignant3);

        System.out.println("\nRecherche d'enseignant par ID dans TreeSet :");
        System.out.println("Enseignant avec ID 2 trouvé : " + gestionEnseignantTreeSet.rechercherEnseignant(2));
        System.out.println("Enseignant avec ID 4 trouvé : " + gestionEnseignantTreeSet.rechercherEnseignant(4));
        System.out.println("Enseignant 3: " + gestionEnseignantTreeSet.rechercherEnseignant(enseignant3));

        gestionEnseignantTreeSet.displayEnseignants();

        // Partie III
        System.out.println("\nPartie III:");

        ISociete societeHashMap = new SocieteHashMap();

        Employe employe1 = new Employe(123456, 001, "Enis", "H");
        Employe employe2 = new Employe(789012, 002, "Jaw", "Z");

        Departement departement1 = new Departement(1, "IT");
        Departement departement2 = new Departement(2, "HR");

        societeHashMap.ajouterEmployeDepartement(employe1, departement1);
        societeHashMap.ajouterEmployeDepartement(employe2, departement2);

        System.out.println("\nRecherche d'employe dans HashMap :");
        System.out.println("Employe1 trouvé : " + societeHashMap.rechercherEmploye(employe1));
        System.out.println("Employe2 trouvé : " + societeHashMap.rechercherEmploye(employe2));

        System.out.println("\nAffichage Employes et Departements dans HashMap: ");
        societeHashMap.afficherLesEmployesLeursDepartements();

        // Test avec SocieteTreeMap
        System.out.println("\nTest avec SocieteTreeMap:");

        ISociete societeTreeMap = new SocieteTreeMap();

        Employe employe3 = new Employe(345678, 003, "Ahmed", "F");
        Employe employe4 = new Employe(901234, 004, "Sami", "B");

        Departement departement3 = new Departement(3, "Finance");
        Departement departement4 = new Departement(4, "Marketing");

        societeTreeMap.ajouterEmployeDepartement(employe3, departement3);
        societeTreeMap.ajouterEmployeDepartement(employe4, departement4);

        System.out.println("\nRecherche d'employe dans TreeMap :");
        System.out.println("Employe1 trouvé : " + societeTreeMap.rechercherEmploye(employe1));
        System.out.println("Employe2 trouvé : " + societeTreeMap.rechercherEmploye(employe2));

        System.out.println("\nAffichage Employes et Departements dans TreeMap: ");
        societeTreeMap.afficherLesEmployesLeursDepartements();

    }
}