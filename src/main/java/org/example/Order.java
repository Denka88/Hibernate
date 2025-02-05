package org.example;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="customer")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="orderDate", nullable = false)
    private LocalDate orderDate;

    @Column(name="amount")
    private double amount;

    @ManyToOne
    @JoinColumn(name="customer")
    private Customer customer;

    public Order(LocalDate orderDate, double amount, Customer customer) {
        this.orderDate = orderDate;
        this.amount = amount;
        this.customer = customer;
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
