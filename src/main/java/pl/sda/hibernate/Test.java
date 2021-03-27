package pl.sda.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test
{

    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
            .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        // Book book = new Book();
        // book.setTitle( "Dzieci z Bullerbyn" );
        // session.save( book );
        System.out.println( session.createQuery( "from Book", Book.class )
            .list() );
        // Book book = session.createQuery( "from Book where id = 8", Book.class )
        // .uniqueResult();
        // book.setTitle( "Przygody koziołka Matołka" );
        // session.update( book );
        Book book = session.createQuery( "from Book where id = 8", Book.class )
            .uniqueResult();
        session.delete( book );
        transaction.commit();
        System.out.println( session.createQuery( "from Book", Book.class )
            .list() );
        session.close();
    }

}
