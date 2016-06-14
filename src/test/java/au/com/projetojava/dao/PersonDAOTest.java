package au.com.projetojava.dao;

import au.com.projetojava.model.Person;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * Created by vinidev on 15/06/16.
 */
public class PersonDAOTest {

    @Test
    public void save(){
        Person person       = new Person();
        CityDAO cityDAO     = new CityDAO();
        PersonDAO personDAO = new PersonDAO();

        person.setName("Gabriela");
        person.setCity(cityDAO.search(1L));
        person.setComplemento("Apart 234");
        person.setCpf("654.645.645-55");
        person.setEmail("gabi@gmail.com");
        person.setMobile("65464654654");
        person.setNumber((short) 654);
        person.setPhone("6556445646");
        person.setPostCode("2205");
        person.setRg("56454646");
        person.setStreet("Innesdale");
        person.setSuburb("Wolli Creek");
        personDAO.save(person);


    }
    @Test
    public void list(){
        PersonDAO personDAO = new PersonDAO();
        List<Person> states = personDAO.list();
    }

    @Test
    public void search(){
        Long id = 1L;
        PersonDAO personDAO = new PersonDAO();
        Person p            = personDAO.search(id);
    }

    @Test
    @Ignore
    public void delete(){
        Long id = 2L;
        PersonDAO personDAO = new PersonDAO();
        Person person       = personDAO.search(id);
        personDAO.delete(person);

    }

    @Test
    public void update(){
        Long id = 3L;
        PersonDAO personDAO = new PersonDAO();
        Person person       = personDAO.search(id);

        person.setName("Test");
        personDAO.update(person);
    }
}
