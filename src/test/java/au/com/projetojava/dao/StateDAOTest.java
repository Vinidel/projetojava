package au.com.projetojava.dao;

import au.com.projetojava.model.State;
import org.junit.Test;

/**
 * Created by vinidev on 14/06/16.
 */
public class StateDAOTest {

    @Test
    public void save(){
        State state = new State();
        state.setName("Victoria");
        state.setShortName("VIC");

        StateDAO stateDAO = new StateDAO();
        stateDAO.save(state);
    }
}
