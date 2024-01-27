import java.time.LocalDate;

import Magasin.Magasin;
import Produits.Produit;
import Produits.ProduitFruit;
import Produits.ProduitLegume;
import Staff.Caissier;
import Staff.Employe;
import Staff.Responsable;
import Staff.Vendeur;

public class Test {
    public static void main(String[] args) {

        System.out.println("**********************************");
        System.out.println("********     Partie 1     ********");
        System.out.println("**********************************\n");

        Produit p1 = new Produit(1021, "Lait", "Delice");
        Produit p2 = new Produit(2510, "Yaourt", "Vitalait");
        Produit p3 = new Produit(3250, "Tomate", "Sicam", 1.200);

        System.out.println("\n********  Question 3 ********\n");
        p1.afficher();
        p2.afficher();
        p3.afficher();

        System.out.println("\n********  Question 4 ********\n");
        p1.setPrix(0.700);
        p1.afficher();

        // question 5
        p2.setPrix(0.450);

        System.out.println("\n********  Question 6 ********\n");
        p1.afficher();
        p2.afficher();
        p3.afficher();

        System.out.println("\n********  Question 8 ********\n");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\n********  Question 9 ********\n");
        p1.setDateExpiration(LocalDate.of(2024, 1, 15));
        p2.setDateExpiration(LocalDate.of(2024, 1, 8));
        p3.setDateExpiration(LocalDate.of(2024, 1, 29));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\n**********************************");
        System.out.println("********     Partie 2     ********");
        System.out.println("**********************************\n");

        // création Magasin
        Magasin m = new Magasin(1, "Aziza", "Sousse");

        // Ajout Produits
        m.ajoutProduit(p1);
        m.ajoutProduit(p2);
        m.ajoutProduit(p3);

        // Affichage Détails Magasin
        m.afficher();

        // Affichage Nombre Totale De Prouits Dans Tous Les Magasins
        System.out.println("Nombre Totale De Prouits Dans Tous Les Magasins: " + Magasin.nbrTotalProduitsMagasins());

        System.out.println("\n**********************************");
        System.out.println("********     Partie 3     ********");
        System.out.println("**********************************\n");

        System.out.println("\n********  Question 1 ********\n");
        System.out.println("Méthode « comparer » prend un seul produit en paramètre " + p1.comparer(p1));
        Produit p11 = new Produit(1021, "Lait", "Delice", 0.700, LocalDate.of(2024, 1, 15));
        System.out.println("Méthode « comparer » prend deux produits en paramètre " + Produit.comparer(p1, p11));

        System.out.println("\n********  Question 3 ********\n");
        System.out.println("Produit Existant (index du produit): " + m.chercherProduit(p1));
        System.out.println("Produit non Existant (-1): " + m.chercherProduit(p11));

        System.out.println("\n********  Question 4 ********\n");
        System.out.println("Nbr Produit avant suppression: " + m.nmbrProduit());
        m.supprimerProduit(p3);
        System.out.println("Nbr Produit aprés suppression: " + m.nmbrProduit());

        System.out.println("\n********  Question 5 ********\n");
        Magasin m1 = new Magasin(2, "Monoprix", "Kef");
        System.out.println(
                "le magasin ayant un nombre supérieur de produits entre deux magasins:  " + Magasin.magasinSup(m1, m));

        System.out.println("**********************************");
        System.out.println("********     Partie 4     ********");
        System.out.println("**********************************\n");

        // question 1
        Magasin m3 = new Magasin(3, "Carrefour", "Menzah");
        Magasin m4 = new Magasin(4, "Champion", "Centre-Ville");

        // question 2
        Employe c1 = new Caissier(1, "ahmed", "sfax", 30, 1);
        Employe c2 = new Caissier(2, "samir", "sousse", 30, 2);
        Employe c3 = new Caissier(3, "amine", "sousse", 30, 1);
        Employe v1 = new Vendeur(1, "karim", "kef", 10, 10.4);
        Employe v2 = new Vendeur(2, "amir", "bizert", 10, 21.8);
        Employe v3 = new Vendeur(3, "nassim", "tunis", 10, 18.4);
        Employe v4 = new Vendeur(4, "mounir", "nabeul", 10, 15.8);
        Employe r1 = new Responsable(1, "Mohamed", "Sousse", 5, 100);
        Employe r2 = new Responsable(2, "Salah", "Sousse", 5, 100);

        m3.ajoutEmploye(c1);
        m3.ajoutEmploye(c2);
        m3.ajoutEmploye(v1);
        m3.ajoutEmploye(r1);

        m4.ajoutEmploye(c3);
        m4.ajoutEmploye(v2);
        m4.ajoutEmploye(v3);
        m4.ajoutEmploye(v4);
        m4.ajoutEmploye(r2);

        // question 3
        r1.afficher();
        c1.afficher();
        v1.afficher();

        // question 4
        m3.ajoutProduit(p1);
        m3.ajoutProduit(p2);
        m3.ajoutProduit(p3);

        m4.ajoutProduit(p1);
        m4.ajoutProduit(p2);
        m4.ajoutProduit(p3);

        System.out.println("\n********  Question 5 ********\n");
        System.out.println(m4.afficher());

        System.out.println("**********************************");
        System.out.println("********     Partie 5     ********");
        System.out.println("**********************************\n");

        System.out.println("\n********  Question 2 ********\n");
        Produit fruit1 = new ProduitFruit(1254, "Fruit", "Fraise", 12.3, "mars");
        Produit fruit2 = new ProduitFruit(1224, "Fruit", "Pastèque", 50.0, "juin");
        Produit fruit3 = new ProduitFruit(7896, "Fruit", "Mandarine", 25.6, "décembre");
        Produit legume = new ProduitLegume(8521, "Légumes", "Artichauts", 14, "janvier");

        fruit1.afficher();
        fruit2.afficher();
        fruit3.afficher();
        legume.afficher();

        // question 3
        m4.ajoutProduit(fruit1);
        m4.ajoutProduit(fruit2);
        m4.ajoutProduit(fruit3);
        m4.ajoutProduit(legume);

        System.out.println("\n********  Question 4 ********\n");
        System.out.println("Determiner Type ¨Produit: \n" + fruit1.determinerTypeProduit()
                + " " + fruit2.determinerTypeProduit() + " " + fruit3.determinerTypeProduit() + " "
                + legume.determinerTypeProduit());

        System.out.println("\n********  Question 5 ********\n");
        System.out.println("Calcul Stock de Fruit: " + m4.calculStock());

        System.out.println("\n********  Question 5 ********\n");
        System.out.println(((ProduitFruit) fruit1).estFrais("mars"));
        System.out.println(((ProduitFruit) fruit2).estFrais("mars"));
        System.out.println(((ProduitLegume) legume).estFrais("janvier"));
        System.out.println(((ProduitLegume) legume).estFrais("février"));
        System.out.println(((ProduitLegume) legume).estFrais("avril"));
    }
}