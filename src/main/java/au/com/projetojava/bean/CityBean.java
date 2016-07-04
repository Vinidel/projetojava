package au.com.projetojava.bean;

import au.com.projetojava.dao.CityDAO;
import au.com.projetojava.dao.StateDAO;
import au.com.projetojava.model.City;
import org.omnifaces.util.Messages;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.util.List;

/**
 * Created by vinidev on 4/07/16.
 */
@ManagedBean
@ViewScoped
public class CityBean {

    private City city;

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    private List<City> cities;

    public City getCity() {
        return this.city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void newCity(){
        this.city = new City();
    }

    public void save(){
        try{
            CityDAO cityDAO = new CityDAO();
            cityDAO.save(this.city);
            setCities(cityDAO.list());
            Messages.addGlobalInfo("City " + this.city.getName() + " saved");
            newCity();
        }catch(RuntimeException ex){
            ex.printStackTrace();
            Messages.addGlobalError("Error when saving " + this.city.getName());
        }
    }


    @PostConstruct
    public void list(){
        try{
            CityDAO cityDAO = new CityDAO();
            this.cities = cityDAO.list();
            newCity();
        }catch(RuntimeException ex){
            ex.printStackTrace();
            Messages.addGlobalError("Error listing cities ");
        }
    }
}
