package ch.cdogan.edu.spring.Repository;

/**
 * Created by Dogan on 06.11.16.
 */
import java.util.List;

import ch.cdogan.edu.spring.Entities.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    List<Person> findByLastName(@Param("name") String name);

}
