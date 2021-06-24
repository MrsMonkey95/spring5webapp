/** Created by MrsMonkey95 on 24.06.2021
 *  for Spring Framework 5 course, Spring Data Repositories. */
package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
