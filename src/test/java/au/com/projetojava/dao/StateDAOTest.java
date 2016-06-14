package au.com.projetojava.dao;

import au.com.projetojava.model.State;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * Created by vinidev on 14/06/16.
 */
public class StateDAOTest {

    @Test
    @Ignore
    public void save(){
        State state = new State();
        state.setName("Victoria");
        state.setShortName("VIC");

        StateDAO stateDAO = new StateDAO();
        stateDAO.save(state);
    }
    @Test
    public void list(){
        StateDAO stateDAO = new StateDAO();
        List<State> states = stateDAO.list();
    }

    @Test
    public void search(){
        Long id = 1L;
        StateDAO stateDAO = new StateDAO();
        State state = stateDAO.search(id);

    }

    @Test
    @Ignore
    public void delete(){
        Long id = 9L;
        StateDAO stateDAO = new StateDAO();
        State state = stateDAO.search(id);
        stateDAO.delete(state);

    }

    @Test
    public void update(){
        Long id = 9L;
        StateDAO stateDAO = new StateDAO();
        State state = stateDAO.search(id);
        state.setShortName("DF");
        stateDAO.update(state);

    }
}
