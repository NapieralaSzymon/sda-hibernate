package pl.sda.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table( name = "animal" )
@Inheritance( strategy = InheritanceType.JOINED )
public class Animal extends AbstractModel
{

    @Column( name = "name" )
    protected String name;

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
        return "Animal{" + "name='" + name + '\'' + '}';
    }

}
