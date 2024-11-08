package fr.eni.tp_forum.dal;

import fr.eni.tp_forum.bll.IDAOSujet;
import fr.eni.tp_forum.bo.Sujet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class DAOSujetMock implements IDAOSujet {

    List<Sujet> sujets = new ArrayList<>();


    @Override
    public Sujet ajouterSujet(Sujet sujet) {
        Sujet foundSujet = sujets.stream().filter(value -> Objects.equals(value, sujet.id)).findFirst().orElse(null);
        if (foundSujet == null) {
            foundSujet.nom = sujet.nom;
            return foundSujet;
        }
        sujets.add(foundSujet);
        return foundSujet;
    }

    @Override
    public List<Sujet> findAll() {
        return List.of();
    }

    @Override
    public Sujet findById(String id) {
//        return sujets.stream().filter(value -> Objects.equals(sujet.id, id)).findFirst().orElse(null);
        return null;
    }
}
