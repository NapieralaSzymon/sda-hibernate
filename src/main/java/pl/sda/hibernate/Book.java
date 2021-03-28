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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "book" )
public class Book
{

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;

    @Column( name = "title" )
    private String title;

    @ManyToOne
    @JoinColumn( name = "author_id" )
    private Author author;

    @ManyToMany
    @JoinTable( //
        name = "book_category", //
        joinColumns = @JoinColumn( name = "book_id" ), //
        inverseJoinColumns = @JoinColumn( name = "category_id" ) )
    private Set< Category > categories;

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer aId )
    {
        id = aId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle( String aTitle )
    {
        title = aTitle;
    }

    public Author getAuthor()
    {
        return author;
    }

    public void setAuthor( Author aAuthor )
    {
        author = aAuthor;
    }

    public Set< Category > getCategories()
    {
        return categories;
    }

    public void setCategories( Set< Category > aCategories )
    {
        categories = aCategories;
    }

    @Override
    public String toString()
    {
        return "Book{" + "id=" + id + ", title='" + title + '\'' + ", author=" + author + '}';
    }

}
