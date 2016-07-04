package au.com.projetojava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by vinidev on 14/06/16.
 */
@SuppressWarnings("serial")
@Entity
public class City extends GenericDomain {

    @Column(length=50, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(nullable = false)
    private State state;

    public City() {
        this.state = new State();
    }

    public String getName() {
        return name;
    }

    public State getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(State state) {
        this.state = state;
    }
}
