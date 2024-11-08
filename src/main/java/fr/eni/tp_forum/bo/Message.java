package fr.eni.tp_forum.bo;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

//@Document("messages")
public class Message {

    @Id
    private String id;

    private String texte;

    private String auteur;

    private LocalDateTime date_creation;

    private Sujet sujet;

    public Message() {
    }

    public Message(String id, String texte, String auteur, LocalDateTime date_creation, Sujet sujet) {
        super();
        this.id = id;
        this.texte = texte;
        this.auteur = auteur;
        this.date_creation = date_creation;
        this.sujet = sujet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public LocalDateTime getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(LocalDateTime date_creation) {
        this.date_creation = date_creation;
    }

    public Sujet getSujet() {
        return sujet;
    }

    public void setSujet(Sujet sujet) {
        this.sujet = sujet;
    }
}
