package fr.eni.tp_forum.bll;

import fr.eni.tp_forum.bo.Message;
import fr.eni.tp_forum.bo.Sujet;
import fr.eni.tp_forum.dal.MessageMongoRepository;
import fr.eni.tp_forum.dal.SujetMongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class DAOMessageMongo implements IDAOMessage {

    private final MessageMongoRepository messageMongoRepository;
    private final SujetMongoRepository sujetMongoRepository;

    public DAOMessageMongo(MessageMongoRepository messageMongoRepository, SujetMongoRepository sujetMongoRepository) {
        this.messageMongoRepository = messageMongoRepository;
        this.sujetMongoRepository = sujetMongoRepository;
    }

    public Message ajouterMessageAuSujet(Message message, Sujet sujet) {
        messageMongoRepository.save(message);
        return message;
    }
}
