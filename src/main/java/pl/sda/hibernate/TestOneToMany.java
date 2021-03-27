package pl.sda.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class TestOneToMany
{

    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
            .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Query< Author > query = session.createQuery( "from Author", Author.class );
        List< Author > list = query.list();
        for( Author author : list )
        {
            System.out.println( author );
            System.out.println( author.getBooks() );
        }
        session.close();
    }

}
