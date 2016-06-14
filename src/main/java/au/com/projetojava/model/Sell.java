package au.com.projetojava.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by vinidev on 14/06/16.
 */
@SuppressWarnings("serial")
@Entity
public class Sell extends GenericDomain {

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date hour;

    @Column(nullable = false, precision = 7, scale = 2)
    private BigDecimal totalPrice;

    @ManyToOne
    private Client client;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Employee employee;



}
