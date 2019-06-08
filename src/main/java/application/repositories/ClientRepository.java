package application.repositories;

import application.entities.Clients;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Clients, Integer> {


}
