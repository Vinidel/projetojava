package au.com.projetojava.bean;

import org.omnifaces.util.Messages;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * Created by vinidev on 19/06/16.
 */
@ManagedBean
public class StateBean {

    public void save(){
        Messages.addGlobalInfo("Java Web Programing");
    }
}
