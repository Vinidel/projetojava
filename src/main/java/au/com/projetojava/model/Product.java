package au.com.projetojava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

/**
 * Created by vinidev on 14/06/16.
 */
@SuppressWarnings("serial")
@Entity
public class Product extends GenericDomain {

    @Column(length = 80, nullable = false)
    private String description;

    @Column(nullable = false)
    private Short qty;

    @Column(nullable = false, precision =  6, scale = 2)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Make make;

    public String getDescription() {
        return description;
    }

    public Short getQty() {
        return qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Make getMake() {
        return make;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQty(Short qty) {
        this.qty = qty;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setMake(Make make) {
        this.make = make;
    }
}
