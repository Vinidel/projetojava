package au.com.projetojava.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by vinidev on 14/06/16.
 */
@SuppressWarnings("serial")
@Entity
public class State extends GenericDomain{

    @Column(name="short_name", length = 3, nullable = false)
    private String shortName;

    @Column(length= 50, nullable = false)
    private String name;

    public String getShortName() {
        return shortName;
    }

    public String getName() {
        return name;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setName(String name) {
        this.name = name;
    }
}
