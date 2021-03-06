package pl.sda.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainBooksWithCategories
{

    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
            .buildSessionFactory();
        try (Session session = sessionFactory.openSession())
        {
            List< Book > books = session.createQuery( "from Book", Book.class )
                .list();
            for( Book book : books )
            {
                System.out.println();
                System.out.println( book );
                System.out.println( book.getCategories() );
                System.out.println();
            }
        }
    }

}
