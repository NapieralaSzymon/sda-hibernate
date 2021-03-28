package pl.sda.hibernate;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table( name = "category" )
public class Category
{

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;

    @Column( name = "name" )
    private String name;

    @ManyToMany
    @JoinTable( //
        name = "book_category", //
        joinColumns = @JoinColumn( name = "category_id" ), //
        inverseJoinColumns = @JoinColumn( name = "book_id" ) )
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
