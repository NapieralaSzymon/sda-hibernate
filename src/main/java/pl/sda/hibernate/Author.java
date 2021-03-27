package pl.sda.hibernate;

import java.util.Set;

public class Author
{

    private Integer id;
    private String firstName;
    private String lastName;
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
