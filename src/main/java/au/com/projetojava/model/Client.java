package au.com.projetojava.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by vinidev on 14/06/16.
 */
@SuppressWarnings("serial")
@Entity
public class Client extends GenericDomain {

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date     dateCreated;

    @Column(nullable = false)
    private Boolean  let;

    @OneToOne
    @JoinColumn(nullable = false)
    private Person person;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Boolean getLet() {
        return let;
    }

    public void setLet(Boolean let) {
        this.let = let;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
