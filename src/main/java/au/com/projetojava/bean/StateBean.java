package au.com.projetojava.bean;

import au.com.projetojava.dao.StateDAO;
import au.com.projetojava.model.State;
import org.omnifaces.util.Messages;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
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
            stateDAO.merge(this.getState());
            Messages.addGlobalInfo("Name: " + this.state.getName() +  " Saved Succesfully");
            newState();
            setStates(stateDAO.list());
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


    public void remove(ActionEvent actionEvent ){

        try{
            StateDAO stateDAO = new StateDAO();
            this.state = (State) actionEvent.getComponent().getAttributes().get("removedState");

            stateDAO.delete(this.state);
            setStates(stateDAO.list());
            Messages.addGlobalInfo( this.state.getName() + " removed successfully");
        }catch(RuntimeException ex){
            ex.printStackTrace();
            Messages.addGlobalError("Error removing " + this.state.getName());
        }

    }

    public void edit(ActionEvent actionEvent){
        this.state = (State) actionEvent.getComponent().getAttributes().get("editedState");
        Messages.addGlobalInfo( this.state.getName());
    }
}
