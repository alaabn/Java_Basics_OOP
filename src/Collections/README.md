# Collections Exercices (ArrayList, TreeSet, HashSet, TreeMap, HashMap)

### Parti I

1. Ecrivez la classe Etudiant. Un étudiant est caractérisé par un id, un nom et un prenom. Cette classe possède :
2 constructeurs dont un sans paramètre.
    * Les méthodes getId(), getNom(), getPrenom(), setId(..), setNom(...), setPrenom(...) permettant d’accéder aux attributs en écriture et en lecture.
    * La redéfinition de la méthode boolean equals(Object o), permettant de tester l'égalité entre 2 étudiants selon l’id.
    * La redéfinition de la méthode toString(), permettant de donner une représentation de l'étudiant sous forme d'une chaîne de caractères

2. Ecrivez un programme main permettant de tester toutes les méthodes de la classe.
3. Créez l’interface IUniversity
    ```Java
    public interface IUniversity{
        public void ajouterEtudiant(Etudiant e);
        public boolean rechercherEtudiant(Etudiant e);
        public boolean rechercherEtudiant(String nom);
        public void supprimerEtudiant(Etudiant e);
        public void displayEtudiants();
        public void trierEtudiantsParId();
        public void trierEtudiantsParNom();
    }
    ```
4. Construisez la classe UniversityArrayList qui implémente l'interface IUniversity et qui repose sur l'utilisation d’un ArrayList pour la gestion de la liste des étudiants.

---
 ### Partie II

 1. Ecrivez la classe Enseignant. Un enseignant sera caractérisé par un id, un nom et un prenom. Cette classe possède :
    * 2 constructeurs dont un sans paramètre.
    * Les méthodes getId(), getNom(), getPrenom(), setId(..), setNom(...), setPrenom(...) permettant d’accéder aux attributs en écriture et en lecture.
    * La redéfinition de la méthode méthode boolean equals(Object o), permettant de tester l'égalité entre 2 étudiants selon l’id.
    * La redéfinition de la méthode toString(), permettant de donner une représentation de l’enseignant sous forme d'une chaîne de caractères

2. Ecrire un programme main permettant de tester toutes les méthodes de la classe.
3. Créez l’interface IGestionEnseignant
    ```java
    public interface IGestionEnseignant{
        public void ajouterEnseignant(Enseignant e);
        public boolean rechercherEnseignant (Enseignant e);
        public boolean rechercherEnseignant (int id);
        public void supprimerEnseignant (Enseignant e);
        public void displayEnseignants();
    }
    ```

4. Construisez les classes GestionEnseignantHashSet et GestionEnseignantTreeSet qui implémentent l'interface IGestionEnseignant et qui reposent sur l'utilisation respective d’un HashSet et d’un TreeSet pour la gestion de la liste des enseignants.

---
### Partie III

1. Ecrivez les classes Employe et Departement Un employé est caractérisé par un cin, un matricule, un nom et un prenom. Un département est caractérisé par son identifiant et son nom. Chaque classe possède :
    * Deux constructeurs dont un sans paramètre.
    * Les getters et les setters
    * La méthode toString()
    * La méthode equals
2. Créez l’interface ISociete
    ```java
    public interface ISociete {
        public void ajouterEmployeDepartement(Employe e,Departement d);
        public void supprimerEmploye(Employe e);
        public void afficherLesEmployesLeursDepartements();
        public void afficherLesEmployes();
        public void afficherLesDepartements();
        public void afficherDepartement(Employe e);
        public boolean rechercherEmploye(Employe e);
        public boolean rechercherDepartement(Departement e);
    }
    ```
3. Construisez les classes SocieteHashMap et SocieteTreeMap qui implémentent l'interface ISociete et qui reposent sur l'utilisation respective d’un HashMap et d’un TreeMap pour la gestion des employés ainsi que leurs départements respectifs.