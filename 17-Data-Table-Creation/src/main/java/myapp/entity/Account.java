package myapp.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@MappedSuperclass
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;

}
