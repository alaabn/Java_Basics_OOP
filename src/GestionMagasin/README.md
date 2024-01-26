# Basics Java OOP Exercices

### Partie I
Une boite de développement désire développer une application de gestion de
ressources de magasin de produits alimentaires.
Avant d’entamer la réalisation de ce programme, la société a commencé par une
étude du marché qui a permis de dégager les différentes caractéristiques d’un
produit alimentaire et qui sont :
 * Un identifiant (entier)
 * Un libellé (chaine de caractère)
 * Une marque (chaine de caractère)
 * Un prix (un nombre réel)

Le programme doit permettre à l’utilisateur de :
1. Créer un produit vide (sans attributs)
2. Créer des nouveaux produits tout en spécifiant les caractéristiques suivantes :
    1. 1021, Lait et Delice
    2. 2510, Yaourt et Vitalait
    3. 3250, Tomate, Sicam et 1.200
3. Afficher les détails de chaque produit créé en implémentant une méthode
**afficher()**.
4. Attribuer le prix 0.700 au produit lait, afficher le produit modifié.
5. Compléter les informations manquantes pour chaque produit
6. Afficher les produits modifiés.
7. Ajouter (redéfinir) la méthode *toString()* dans la classe Produit qui
renvoie une chaîne de caractères décrivant le produit.
8. Afficher maintenant les produits déjà créés en faisant appel à la méthode
**toString()**.
9. Ajouter un attribut « date d’expiration » de type **Date** et affecter des dates
aux produits existants.
---
### Partie II
Dans le cadre de l’amélioration du programme sur lequel vous êtes affectés
dans l’entreprise et dans un souci constant d’adaptation aux besoins du client,
vous êtes demandés de créer un autre module afin de gérer les besoins des
propriétaires des magasins.
Les différentes caractéristiques d’un magasin:
* Un identifiant
* Un nom
* Une adresse
* Capacité du magasin
* Un ensemble de produits

Le module doit permettre aux propriétaires des magasins en premier lieu d’ajouter
un nouveau produit au magasin, tout en prenant en considération qu’un magasin
peut contenir au maximum 50 produits.
Vous êtes aussi demandés d’afficher les caractéristiques du magasin, et le nom et
le prix de l’ensemble de ses produits.

Afin de protéger les différentes caractéristiques des objets crées votre
supérieur vous demande de restreindre l’accès aux attributs de la classe Produit
en prenant en considération que le prix de ce dernier ne doit pas être négatif.
Ensuite il vous suggère d’organiser le code en des différents packages.
Finalement le programme doit permettre à son propriétaire de savoir le nombre
total de tous les produits de tous les magasins.

---
### Partie III
Une fois le client a testé les fonctionnalités précédemment développées
(ajout et l’affichage des produits dans les magasins), il constate quelques
problèmes et lacunes au niveau de la gestion des produits, tels que la possibilité
d’avoir des redondances de certains produits dans le même magasin.
Pour cela votre supérieur vous demande de faire les modifications
nécessaires afin de remédier à ce problème :

1. Créer une méthode « comparer » qui permet de tester la conformité de
produits, sachant que le client considère deux produits identiques dans le cas
où ils ont le même identifiant, libellé et prix,
Ceci doit être fait avec deux façons :
    1. Méthode « comparer » prend un seul produit en paramètre
    2. Méthode « comparer » prend deux produits en paramètre

2. Ajouter une autre méthode qui sert à chercher un produit dans un magasin,
Cette méthode renvoie la position du produit (ou -1 si le produit n’existe pas..

3. Modifier la méthode « ajouterProduit » afin d’ajouter un produit donné une
seule fois

4. Créer une méthode qui permet de supprimer un produit du magasin
5. Créer une méthode qui affiche le magasin ayant un nombre supérieur de
produits entre deux magasins

---
### Parti IV
Maintenant qu’on a réussi à gérer les produits d’un magasin, l’étape
suivante consiste à la gestion des employés des différents magasins. Pour cela on
distingue 3 types d’employés (***Caissier***, ***Responsable*** et ***Vendeur***), sachant qu’un
employé est caractérisé par un ***identifiant***, un ***nom***, une ***adresse*** et un ***nbr_heures***
par mois, avec un maximum de **20 employés par magasin**, ce module doit
permettre l’ajout des différents types d’employés afin de les affecter à un magasin,
tout en tenant compte qu’un vendeur est caractérisé aussi par un ***tauxDeVente***, un
caissier par un ***numeroDeCaisse*** et un responsable par une ***prime***.
1. Créer dans la méthode main deux magasins :
    * (1, " Carrefour", "Centre-Ville ")
    * (2, "Monoprix", "Menzah 6")

2. Créer 2 caissiers, un vendeur et un responsable pour le premier magasin et
un caissier, 3 vendeurs et un responsable pour le deuxième magasin.
3. Afficher les caractéristiques des employés déjà créés (Qu’est-ce que vous
avez remarqué ?)
4. Créer et ajouter quelques produits pour chaque magasin
5. Afficher tous les détails de chaque magasin (id, nom, adresse, capacité, les
produits et les employés).
6. Calculer et afficher les différents salaires pour les différents employés
sachant qu’un salaire se calcule comme suit :
    * Les responsables sont payés suivant le **nombre d'heures** qu'ils ont
travaillé dans un mois + une **prime**. Ils sont payés à **10DT/H** et pour
leurs heures supplémentaires (au-delà de 160 heures) ils sont payés **20%**
de plus que les heures normales.
    * Les caissiers sont payés suivant le **nombre d'heures** qu'ils ont travaillé
dans un mois **5DT/H**, mais pour leurs heures supplémentaires (au-delà
de 180 heures) ils sont payés **15%** de plus que les heures normales.
    * Les vendeurs sont payés avec une somme fixe **450 DT** multipliée par
le ***taux_de_vente (en %)*** qu'ils ont fait.

---
### Partie V

Les propriétaires des différents magasins voulaient gérer leurs magasins
d’une façon qu’ils comportent divers types de produits.
En effet la gestion journalière des différents magasins consiste en l’entrée et la
sortie de divers types de produits alimentaires (produit laitiers et produits
agricoles...), on va s’intéresse aux produits agricoles qui peuvent être soit des
légumes, soit des fruits ;
Tous les produits possèdent des caractéristiques définis auparavant. A
chaque produit agricole est associé un autre attribut pour indiquer la saison de
récolte de ce produit.
On veut manipuler tous les catégories des produits à travers de la même
représentation : celle d’un Produit.

1. Définissez les classes ***ProduitFruit*** et ***ProduitLegume***.
2. Créer les produits suivants :

    |Produit |Id |Type |libellé |quantité |saison|
    |:------|:-:|:---:|:------:|:-------:|:----:|
    |P1      |1254 |Fruit |Fraise |12.3 |Mars|
    |P2 |1224 |Fruit |Pastèque |50 |Juin|
    |P3 |7896 |Fruit |Mandarine |25.6 |Décembre|
    |P4 |8521 |Légumes |Artichauts |14 |Janvier|
3. Utiliser la méthode « ***ajouterProduit(Produit p)*** » pour ajouter ces
produits à un magasin
4. Créer la méthode « ***determinerTypeProduit()***» qui permet de déterminer
pour chaque produits crées sa famille ( fruit ou légumes)
5. Pour chaque produit de type **Fruit** on souhaite calculer la quantité totale
de produit dans le magasin, pour cela on se propose d’ajouter la
méthode « ***float calculStock()*** » dans la classe **Magasin**.
6. Créer une nouvelle interface nommée « **Critere** » qui contient la
méthode ***estFrais(String saison)*** qui se comporte comme suit :
    1. Pour un **ProduitFruit** : retourne **true** si la saison passée en
paramètre est identique à la saison de récolte du produit
    2. Pour un **ProduitLegume** : retourne **true** si la saison passée en
paramètre ne dépasse pas la saison de récolte du produit de plus
que 1 mois