package pl.sda.hibernate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table( name = "person" )
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class Person extends AbstractModel
{

    @Column( name = "first_name" )
    private String firstName;

    @Column( name = "last_name" )
    private String lastName;

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

    @Override
    public String toString()
    {
        return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }

}
