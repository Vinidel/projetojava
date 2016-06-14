package au.com.projetojava.dao;

import au.com.projetojava.model.Person;
import au.com.projetojava.model.User;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by vinidev on 15/06/16.
 */
public class UserDAOTest {

    @Test
    @Ignore
    public void save(){
        PersonDAO personDAO = new PersonDAO();
        User user           = new User();
        Person person       = personDAO.search(3L);
        UserDAO userDAO     = new UserDAO();

        user.setActive(true);
        user.setPerson(person);
        user.setPassword("iuhdfu");
        user.setUserType('A');
        userDAO.save(user);
    }
}
