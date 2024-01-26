# Collections Exercices (ArrayList)

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