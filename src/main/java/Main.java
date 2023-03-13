
import entity.Planet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import utils.HibernateUtil;

public class Main {
    public static void main(String[] args) {
//Create Java object
        Planet p = new Planet();
        p.setId("MIN");
        p.setName("Minerva 93");

//Persist object
//        Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        session.persist(p);
//        transaction.commit();
//        session.close();
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Planet.class)
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
//        session.persist(p);
//        transaction.commit();
        session.close();

    }
}
