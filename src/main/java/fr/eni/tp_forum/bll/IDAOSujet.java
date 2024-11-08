package fr.eni.tp_forum.bll;

import fr.eni.tp_forum.bo.Sujet;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public interface IDAOSujet {

    Sujet ajouterSujet(Sujet sujet);

    List<Sujet> findAll();

    Sujet findById(String id);
}
