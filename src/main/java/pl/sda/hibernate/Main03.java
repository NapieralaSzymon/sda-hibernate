package pl.sda.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main03
{

    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
            .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Query< Book > query = session.createQuery( "from Book where id = :id", Book.class );
        query.setParameter( "id", 1 );
        System.out.println( query.uniqueResult() );
        session.close();
    }

}
