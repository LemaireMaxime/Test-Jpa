package Domaine;

import javax.persistence.*;

@Entity
@Table(name="Livre")
public class Livre {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column
    private String Titre;

    @Column
    private String Auteur;

    public Livre() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return Titre;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public void setAuteur(String auteur) {
        Auteur = auteur;
    }
}
