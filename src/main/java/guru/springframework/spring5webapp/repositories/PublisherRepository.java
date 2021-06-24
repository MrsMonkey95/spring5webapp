/** Created by MrsMonkey95 on 24.06.2021
 *  for Spring Framework 5 course, Repetition Exercise. */
package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
