package au.com.projetojava.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by vinidev on 14/06/16.
 */
@SuppressWarnings("serial")
@Entity
public class Employee extends GenericDomain {

    @Column(length = 15, nullable = false)
    private String employeeNumber;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date adimissionDate;

    @OneToOne
    @JoinColumn(nullable = false)
    private Person person;

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Date getAdimissionDate() {
        return adimissionDate;
    }

    public void setAdimissionDate(Date adimissionDate) {
        this.adimissionDate = adimissionDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}