package pl.sda.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "smartphone" )
public class Smartphone extends Phone
{

    @Column(name = "smartphone_system")
    private String system;

    public String getSystem()
    {
        return system;
    }

    public void setSystem( String aSystem )
    {
        system = aSystem;
    }

    @Override
    public String toString()
    {
        return "Smartphone{" + "system='" + system + '\'' + ", id=" + id + ", number='" + number + '\'' + '}';
    }

}
