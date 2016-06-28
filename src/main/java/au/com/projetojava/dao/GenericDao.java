package au.com.projetojava.dao;

import au.com.projetojava.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import javax.transaction.Transactional;
import java.lang.reflect.ParameterizedType;
import java.util.List;

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

    public List<Entity> list(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        try{
            session.beginTransaction();
            Criteria criteria   = session.createCriteria(this.instance);
            List<Entity> result = criteria.list();
            session.getTransaction().commit();
            return result;
        }catch (RuntimeException ex){
            throw ex;
        }finally {
            //session.close();
        }
    }

    public Entity search(Long id){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        try{
            session.beginTransaction();
            Criteria criteria   = session.createCriteria(this.instance);
            criteria.add(Restrictions.idEq(id));
            Entity result = (Entity) criteria.uniqueResult();
            session.getTransaction().commit();
            return result;
        }catch (RuntimeException ex){
            throw ex;
        }finally {
            //session.close();
        }
    }

    public void delete(Entity entity){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.delete(entity);
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

    public void update(Entity entity){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.update(entity);
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

    public void merge(Entity entity){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.merge(entity);
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
