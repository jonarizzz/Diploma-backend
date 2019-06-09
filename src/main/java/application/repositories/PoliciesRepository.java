package application.repositories;

import application.entities.Policies;
import org.springframework.data.repository.CrudRepository;

public interface PoliciesRepository extends CrudRepository<Policies, Integer> {
}
