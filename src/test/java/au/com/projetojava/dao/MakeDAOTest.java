package au.com.projetojava.dao;

import au.com.projetojava.model.Make;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by vinidev on 14/06/16.
 */
public class MakeDAOTest {

    @Test
    @Ignore
    public void save(){
        Make make = new Make();
        make.setDescription("Pfizer");

        MakeDAO makeDao = new MakeDAO();
        makeDao.save(make);
    }

    @Test
    public void list(){
        MakeDAO makeDao = new MakeDAO();
        makeDao.list();
    }

    @Test
    public void search(){
        Long id = 1L;
        MakeDAO makeDao = new MakeDAO();
        makeDao.search(id);
    }

    @Test
    public void merge(){
        Make make = new Make();
        make.setDescription("Kawasaki");

        MakeDAO makeDao = new MakeDAO();
        makeDao.merge(make);
    }

    @Test
    public void mergeEdit(){
        Make make = new Make();
        MakeDAO makeDao = new MakeDAO();

        make = makeDao.search(2L);
        make.setDescription("Honda");
        makeDao.merge(make);
    }

}
