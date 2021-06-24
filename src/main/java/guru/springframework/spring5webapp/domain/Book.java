/** Created by MrsMonkey95 on 24.06.2021
 *  for Spring Framework 5 course, JPA entities. */
package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    // annotate as ID
    @Id
    // tell Hibernate how to generate
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String title;
    private String isbn;

    @ManyToMany
    // set up a join table
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;

    public Book() {
    }

    public Book(String title, String isbn, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
