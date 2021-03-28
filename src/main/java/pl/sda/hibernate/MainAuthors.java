package pl.sda.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainAuthors
{

    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
            .buildSessionFactory();
        try (Session session = sessionFactory.openSession())
        {
            List< Author > authors = session.createQuery( "from Author", Author.class )
                .list();
            for( Author author : authors )
            {
                System.out.println();
                System.out.println( author );
                System.out.println( author.getBooks() );
                System.out.println();
            }
        }
    }

}
