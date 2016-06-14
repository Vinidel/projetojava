package au.com.projetojava.dao;

import au.com.projetojava.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.lang.reflect.ParameterizedType;

/**
 * Created by vinidev on 14/06/16.
 */
public class GenericDao<Entity> {

    private Class<Entity> instance;

    @SuppressWarnings("unchecked")
    public GenericDao(){
        this.instance = (Class<Entity>)((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public void save(Entity entity){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        }catch(RuntimeException ex){
            if(transaction !=  null){
                transaction.rollback();
            }
            throw ex;
        }finally {
            //session.close();
        }
    }
}
