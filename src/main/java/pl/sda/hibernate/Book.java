package pl.sda.hibernate;

import java.util.Set;

public class Book
{

    private Integer id;
    private String title;
    private Author author;
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
        return "Book{" + "id=" + id + ", title='" + title + '\'' + ", author=" + author + ", categories="
            + categories + '}';
    }

}
