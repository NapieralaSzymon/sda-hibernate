package pl.sda.hibernate;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "author" )
public class Author
{

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;

    @Column( name = "first_name" )
    private String firstName;

    @Column( name = "last_name" )
    private String lastName;

    @OneToMany
    @JoinColumn( name = "author_id" )
    private Set< Book > books;

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer aId )
    {
        id = aId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String aFirstName )
    {
        firstName = aFirstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String aLastName )
    {
        lastName = aLastName;
    }

    public Set< Book > getBooks()
    {
        return books;
    }

    public void setBooks( Set< Book > aBooks )
    {
        books = aBooks;
    }

    @Override
    public String toString()
    {
        return "Author{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
            + '}';
    }

}
