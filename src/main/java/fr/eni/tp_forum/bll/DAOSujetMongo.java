package fr.eni.tp_forum.bll;

import fr.eni.tp_forum.bo.Sujet;
import fr.eni.tp_forum.dal.SujetMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Profile("mongo")
@Component
public class DAOSujetMongo implements IDAOSujet {

    @Autowired
    private SujetMongoRepository sujetMongoRepository;

    @Override
    public Sujet ajouterSujet(Sujet sujet) {
        sujetMongoRepository.save(sujet);
        return sujet;
    }

    @Override
    public List<Sujet> findAll() {
        return sujetMongoRepository.findAll();
    }

    @Override
    public Sujet findById(String id) {
        return sujetMongoRepository.findById(id).orElse(null);
    }
}
