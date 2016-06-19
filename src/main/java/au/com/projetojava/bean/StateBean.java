package au.com.projetojava.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * Created by vinidev on 19/06/16.
 */
@ManagedBean
public class StateBean {

    public void save(){
        String text = "Java Web Programing";
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, text, text);

        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, message);
    }
}
