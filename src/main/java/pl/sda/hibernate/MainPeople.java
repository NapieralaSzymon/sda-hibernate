package pl.sda.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainPeople
{

    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
            .buildSessionFactory();
        try (Session session = sessionFactory.openSession())
        {
            Transaction transaction = session.beginTransaction();
            Person person1 = new Person();
            person1.setFirstName( "Jan" );
            person1.setLastName( "Kowalski" );
            session.save( person1 );
            Person person2 = new Person();
            person2.setFirstName( "Andrzej" );
            person2.setLastName( "Nowak" );
            session.save( person2 );
            Person person3 = new Person();
            person3.setFirstName( "Monika" );
            person3.setLastName( "Iksińska" );
            session.save( person3 );
            Developer developer1 = new Developer();
            developer1.setFirstName( "Adam" );
            developer1.setLastName( "Budzyński" );
            developer1.setLanguage( "Java" );
            session.save( developer1 );
            Developer developer2 = new Developer();
            developer2.setFirstName( "Cezary" );
            developer2.setLastName( "Domański" );
            developer2.setLanguage( "PHP" );
            session.save( developer2 );
            transaction.commit();
            System.out.println( "People:" );
            List< Person > people = session.createQuery( "from Person", Person.class )
                .list();
            for( Person person : people )
            {
                System.out.println( person );
            }
            System.out.println();
            System.out.println( "Developers:" );
            List< Developer > developers = session.createQuery( "from Developer", Developer.class )
                .list();
            for( Developer developer : developers )
            {
                System.out.println( developer );
            }
        }
    }

}
