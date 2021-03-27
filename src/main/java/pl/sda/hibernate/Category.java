package pl.sda.hibernate;

import java.util.Set;

public class Category
{

    private Integer id;
    private String name;
    private Set< Book > books;

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer aId )
    {
        id = aId;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String aName )
    {
        name = aName;
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
        return "Category{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

}
