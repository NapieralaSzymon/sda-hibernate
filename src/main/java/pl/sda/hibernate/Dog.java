package pl.sda.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "dog" )
public class Dog extends Animal
{

    @Column( name = "race" )
    private String race;

    public String getRace()
    {
        return race;
    }

    public void setRace( String aRace )
    {
        race = aRace;
    }

    @Override
    public String toString()
    {
        return "Dog{" + "race='" + race + '\'' + ", name='" + name + '\'' + '}';
    }

}
