package Collections.Sets;

public class Enseignant {
    private int id;
    private String nom;
    private String prenom;

    public Enseignant() {
    }

    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public int hashCode() {
        int result = id + ((nom == null) ? 0 : nom.hashCode())
                + ((prenom == null) ? 0 : prenom.hashCode());
        return result * 31;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Enseignant other = (Enseignant) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Enseignant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
    }
}
