package fr.eni.tp_forum.bll;

import fr.eni.tp_forum.ServiceResponse;
import fr.eni.tp_forum.bo.Sujet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class SujetService {

    @Autowired
    static IDAOSujet sujetDao;

    public static ServiceResponse<List<Sujet>> getAll() {

        List<Sujet> sujets = sujetDao.findAll();

        return ServiceResponse.buildReponse("202", "La liste des sujets a été récupérée", sujets);
    }

    public static ServiceResponse<Sujet> getSujetById(String id) {

        Sujet sujet = sujetDao.findById(id);

        return ServiceResponse.buildReponse("202", "Le sujet a été récupérée", sujet);
    }
}
