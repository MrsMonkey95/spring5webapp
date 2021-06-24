/** Created by MrsMonkey95 on 24.06.2021
 *  for Spring Framework 5 course, JPA Entities. */

package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.Set;

@Entity

public class Author {

    // annotate as ID
    @Id
    // tell Hibernate how we want it to be generated (auto generation)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;

    // set relationship
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

public Author(){

}
    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
