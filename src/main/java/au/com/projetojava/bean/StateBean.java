package au.com.projetojava.bean;

import au.com.projetojava.dao.StateDAO;
import au.com.projetojava.model.State;
import org.omnifaces.util.Messages;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by vinidev on 19/06/16.
 */
@ManagedBean
@ViewScoped
public class StateBean {
    private State state;
    private List<State> states;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void newState(){
        this.state = new State();
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public void save(){
        try {
            StateDAO stateDAO = new StateDAO();
            stateDAO.save(this.getState());
            Messages.addGlobalInfo("Name: " + this.state.getName() +  " Saved Succesfully");
            newState();
        }catch (RuntimeException ex){
            ex.printStackTrace();
            Messages.addGlobalError("Error when saving " + this.state.getName());
        }
    }

    @PostConstruct
    public void list(){
        try{
            StateDAO stateDAO = new StateDAO();
            this.setStates(stateDAO.list());
        }catch (RuntimeException ex){
            ex.printStackTrace();
            Messages.addGlobalError("Error listing states");
        }
    }
}
