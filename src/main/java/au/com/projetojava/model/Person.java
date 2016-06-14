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
public class Person extends GenericDomain{

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 14, nullable = false)
    private String cpf;

    @Column(length = 12, nullable = false)
    private String rg;

    @Column(length = 100, nullable = false)
    private String street;

    @Column(nullable = false)
    private Short number;

    @Column(length = 30, nullable = false)
    private String suburb;

    @Column(name = "postcode", length = 10, nullable = false)
    private String postCode;

    @Column(length = 10)
    private String complemento;

    @Column(length = 13, nullable = false)
    private String phone;

    @Column(length = 14, nullable = false)
    private String mobile;

    @Column(length = 100, nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(nullable = false)
    private City city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
