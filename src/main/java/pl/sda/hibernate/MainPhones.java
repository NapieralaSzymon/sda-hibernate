package pl.sda.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainPhones
{

    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure()
            .buildSessionFactory();
        try (Session session = sessionFactory.openSession())
        {
            Transaction transaction = session.beginTransaction();
            Phone phone1 = new Phone();
            phone1.setId( 1 );
            phone1.setNumber( "111111111" );
            session.save( phone1 );
            Phone phone2 = new Phone();
            phone2.setId( 2 );
            phone2.setNumber( "222222222" );
            session.save( phone2 );
            Smartphone smartphone1 = new Smartphone();
            smartphone1.setId( 3 );
            smartphone1.setNumber( "333333333" );
            smartphone1.setSystem( "Android" );
            session.save( smartphone1 );
            Smartphone smartphone2 = new Smartphone();
            smartphone2.setId( 4 );
            smartphone2.setNumber( "444444444" );
            smartphone2.setSystem( "Windows Phone" );
            session.save( smartphone2 );
            transaction.commit();
            List< Phone > phones = session.createQuery( "from Phone", Phone.class )
                .list();
            System.out.println( "Telefony:" );
            for( Phone phone : phones )
            {
                System.out.println( phone );
            }
            List< Smartphone > smartphones = session.createQuery( "from Smartphone ", Smartphone.class )
                .list();
            System.out.println( "Smartfony:" );
            for( Smartphone smartphone : smartphones )
            {
                System.out.println( smartphone );
            }
        }
    }

}
