package org.example;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="customer")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="orderDate", nullable = false)
    private Date orderDate;

    @Column(name="amount")
    private int amount;

    @ManyToOne
    @JoinColumn(name="customer")
    private Customer customer;
}
