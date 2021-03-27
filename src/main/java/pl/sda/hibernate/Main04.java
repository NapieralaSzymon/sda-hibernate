package pl.sda.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main04
{

    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
            .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Query< Book > query = session.createQuery( "from Book where title like :name", Book.class );
        query.setParameter( "name", "Charlie%" );
        System.out.println( query.list() );
        session.close();
    }

}
