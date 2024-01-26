# Exceptions & Error Handling Exercices

Définir une classe Pile qui implémente une pile d’objets avec un tableau de taille fixe.
1. Cette classe contient les champs suivants :
    ```java
        private static final int DIM = 10;
        private Object [] tab;
        private int nbElem;
    ```
2. Définir un constructeur sans argument permettant de créer le tableau tab de taille DIM
3. Ecrire une méthode void empiler (Object o) qui ajoute un nouvel objet o à la pile
4. Ecrire une méthode Object depiler() qui supprime le sommet de la pile.
5. Créer une exception personnalisée nommée PilePleineException. Cette exception sera levée dans
le cas où la pile est pleine.
6. Créer une exception personnalisée nommée PileVideException. Cette exception sera levée dans le
cas où la pile est vide.
7. Modifier la méthode empiler pour qu’elle génère une exception PilePleineException.
8. Modifier la méthode depiler pour qu’elle génère une exception PileVideException.
9. Ecrire une méthode main permettant de:
    1. Empiler les arguments de la ligne de commande
        ```json
        // dans le ficher .vscode/launch.json ajouter les arguments
        {
        "configurations": [
                {
                    ...
                },
                {
                    ... ,
                    "args": "a, b, c, d, e, f, g, h, i, j, k"
                }
            ]
        }
        ```
    2. Afficher les objets empilés dans l’ordre inverse.