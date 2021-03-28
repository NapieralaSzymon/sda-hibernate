package pl.sda.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main
{

    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
            .buildSessionFactory();
        try (Session session = sessionFactory.openSession())
        {
            List< Category > categories = session.createQuery( "from Category", Category.class )
                .list();
            for( Category category : categories )
            {
                System.out.println();
                System.out.println( category );
                System.out.println( category.getBooks() );
                System.out.println();
            }
        }
    }

}
