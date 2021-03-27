package pl.sda.hibernate;

public class Category
{

    private Integer id;
    private String name;

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

    @Override
    public String toString()
    {
        return "Category{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

}
