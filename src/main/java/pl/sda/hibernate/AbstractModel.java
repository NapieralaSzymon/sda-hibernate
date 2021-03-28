package pl.sda.hibernate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractModel
{

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;

    public Integer getId()
    {
        return id;
    }

    public void setId( Integer aId )
    {
        id = aId;
    }

}
