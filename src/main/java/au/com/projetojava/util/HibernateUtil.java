package au.com.projetojava.util;

/**
 * Created by vinidev on 13/06/16.
 */
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    private static SessionFactory sessionFactory = createSesionFactory();

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private static SessionFactory createSesionFactory() {
        try {
            Configuration configuration     = new Configuration().configure();
            ServiceRegistry registry        = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            SessionFactory factory          = configuration.buildSessionFactory(registry);
            return factory;
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}