package au.com.projetojava.util;

import org.hibernate.Session;
import org.junit.Test;

/**
 * Created by vinidev on 13/06/16.
 */
public class HibernateUtilTest {

    @Test
    public void connect(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();
        HibernateUtil.getSessionFactory().close();
    }
}
