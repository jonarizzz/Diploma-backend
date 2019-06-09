package application.repositories;

import application.entities.Insurance_types;
import org.springframework.data.repository.CrudRepository;

public interface InsuranceTypesRepository extends CrudRepository<Insurance_types, Integer> {
}
