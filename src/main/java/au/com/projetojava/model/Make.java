package au.com.projetojava.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by vinidev on 14/06/16.
 */
@SuppressWarnings("serial")
@Entity
public class Make extends GenericDomain {

        @Column(length=50, nullable = false)
        private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
