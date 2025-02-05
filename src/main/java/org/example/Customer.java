package org.example;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Long id;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="email", nullable=false)
    private String email;

    @Column(name="customer", nullable=false)
    private Long customer;
}
