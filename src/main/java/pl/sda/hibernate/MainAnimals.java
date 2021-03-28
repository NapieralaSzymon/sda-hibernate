package pl.sda.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainAnimals
{

    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
            .buildSessionFactory();
        try (Session session = sessionFactory.openSession())
        {
            Transaction transaction = session.beginTransaction();
            Animal animal1 = new Animal();
            animal1.setName( "Słoń" );
            session.save( animal1 );
            Animal animal2 = new Animal();
            animal2.setName( "Żyrafa" );
            session.save( animal2 );
            Dog dog1 = new Dog();
            dog1.setName( "Pies" );
            dog1.setRace( "Owczarek niemiecki" );
            session.save( dog1 );
            Dog dog2 = new Dog();
            dog2.setName( "Pies" );
            dog2.setRace( "Kundel" );
            session.save( dog2 );
            transaction.commit();
            List< Animal > animals = session.createQuery( "from Animal ", Animal.class )
                .list();
            System.out.println( "Zwierzęta:" );
            for( Animal animal : animals )
            {
                System.out.println( animal );
            }
            List< Dog > dogs = session.createQuery( "from Dog ", Dog.class )
                .list();
            System.out.println( "Psy:" );
            for( Dog dog : dogs )
            {
                System.out.println( dog );
            }
        }
    }

}
