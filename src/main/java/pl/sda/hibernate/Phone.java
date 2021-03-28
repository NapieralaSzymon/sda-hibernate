package pl.sda.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table( name = "phone" )
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public class Phone
{

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.SEQUENCE )
    protected Integer id;

    @Column( name = "phone_number" )
    protected String number;

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer aId )
    {
        id = aId;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber( String aNumber )
    {
        number = aNumber;
    }

    @Override
    public String toString()
    {
        return "Phone{" + "id=" + id + ", number='" + number + '\'' + '}';
    }

}
