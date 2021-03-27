package pl.sda.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main01
{

    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
            .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Query< Book > query = session.createQuery( "from Book", Book.class );
        List< Book > books = query.list();
        for( Book book : books )
        {
            System.out.println( book );
        }
        session.close();
    }

}
