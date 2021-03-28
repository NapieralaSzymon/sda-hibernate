package pl.sda.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Developer extends Person
{

    @Column( name = "language" )
    private String language;

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage( String aLanguage )
    {
        language = aLanguage;
    }

    @Override
    public String toString()
    {
        return "Developer{" + "firstName='" + getFirstName() + '\'' + ",lastName='" + getLastName() + '\''
            + ",language='" + language + '\'' + '}';
    }

}
