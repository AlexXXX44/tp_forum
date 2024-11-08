package fr.eni.tp_forum.dal;

import fr.eni.tp_forum.bo.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface MessageMongoRepository extends MongoRepository<Message, String> {

}
