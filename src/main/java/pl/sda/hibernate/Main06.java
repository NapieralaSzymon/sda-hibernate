package pl.sda.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main06
{

    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
            .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query< Book > query = session.createQuery( "from Book where title = :title", Book.class );
        query.setParameter( "title", "W póstyni i w pószczy" );
        Book book = query.uniqueResult();
        if( book != null )
        {
            book.setTitle( "W pustyni i w puszczy" );
            session.update( book );
        }
        transaction.commit();
        session.close();
    }

}
