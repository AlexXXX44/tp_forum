package fr.eni.tp_forum.rest;

import fr.eni.tp_forum.ServiceResponse;
import fr.eni.tp_forum.bll.IDAOSujet;
import fr.eni.tp_forum.bll.SujetService;
import fr.eni.tp_forum.bo.Sujet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SujetRestController {

    IDAOSujet daoSujet;

    @PostMapping("/api/v1/sujet")
    public Sujet testInsert() {
        Sujet sujet = new Sujet();
        sujet.nom = "test";
        daoSujet.ajouterSujet(sujet);
        return sujet;
    }

    @GetMapping("/api/v1/sujets/{id}")
    public ServiceResponse<Sujet> sujetGetById(@PathVariable String id) {
        ServiceResponse<Sujet> response = SujetService.getSujetById(id);

        return response;
    }

    @GetMapping("/api/v1/sujets/")
    public ServiceResponse<List<Sujet>> sujetsGetAll() {
        List<Sujet> sujets = daoSujet.findAll();
        ServiceResponse<List<Sujet>> response = SujetService.getAll();

        return response;
    }
}
