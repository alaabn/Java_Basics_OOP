package Collections;

public class Test {
    public static void main(String[] args) {
        // Test the Etudiant class
        Etudiant etudiant1 = new Etudiant(1, "Enis", "Hash");
        Etudiant etudiant2 = new Etudiant(2, "Jawhar", "Z");
        Etudiant etudiant3 = new Etudiant(3, "Akil", "B");

        UniversityArrayList university = new UniversityArrayList();

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
    }
}