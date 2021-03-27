package pl.sda.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class TestCategoryWithBooks
{

    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
            .buildSessionFactory();
        try (Session session = sessionFactory.openSession())
        {
            Query< Category > query = session.createQuery( "from Category", Category.class );
            List< Category > categories = query.list();
            for( Category category : categories )
            {
                System.out.println( category );
                System.out.println( category.getBooks() );
            }
        }
    }

}
