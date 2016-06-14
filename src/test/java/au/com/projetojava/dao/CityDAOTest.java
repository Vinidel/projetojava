package au.com.projetojava.dao;

import au.com.projetojava.model.City;
import au.com.projetojava.model.State;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * Created by vinidev on 14/06/16.
 */
public class CityDAOTest {

    @Test
    @Ignore
    public void save(){
        StateDAO stateDAO  = new StateDAO();
        State state        = stateDAO.search(1L);
        CityDAO cityDAO    = new CityDAO();
        City city          = new City();

        city.setName("Sydney");
        city.setState(state);
        cityDAO.save(city);
    }

    @Test
    public void list(){
        CityDAO cityDAO     = new CityDAO();
        List<City> cities   = cityDAO.list();

    }

    @Test
    public void search(){
        Long id         = 1L;
        CityDAO cityDAO = new CityDAO();
        City city       = cityDAO.search(id);
        System.out.println("Name: " + city.getName());
    }

    @Test
    @Ignore
    public void delete(){
        Long id         = 4L;
        CityDAO cityDAO = new CityDAO();
        City city       = cityDAO.search(id);
        cityDAO.delete(city);
    }

    @Test
    public void update(){
        Long id         = 1L;
        CityDAO cityDAO = new CityDAO();
        City city       = cityDAO.search(id);
        city.setName("Marilia");
        cityDAO.update(city);
    }


}
