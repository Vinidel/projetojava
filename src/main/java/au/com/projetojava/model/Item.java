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
public class Item extends GenericDomain{


    @Column(nullable = false)
    private Short qty;

    @Column(nullable = false, precision = 7, scale = 2)
    private BigDecimal parcialPrice;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Employee employee;

    public Short getQty() {
        return qty;
    }

    public void setQty(Short qty) {
        this.qty = qty;
    }

    public BigDecimal getParcialPrice() {
        return parcialPrice;
    }

    public void setParcialPrice(BigDecimal parcialPrice) {
        this.parcialPrice = parcialPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
