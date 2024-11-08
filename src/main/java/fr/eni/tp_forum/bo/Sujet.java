package fr.eni.tp_forum.bo;

//import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

//@Data
@Document(collection = "sujets")
public class Sujet {

    @Id
    public String id;
    public String nom;
    private String description;

    @DBRef(lazy = false)
    private List<Message> messages = new ArrayList<>();

    public Sujet() {}

    public Sujet(String id, String nom, String description, List<Message> messages) {
        super();
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.messages = messages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
