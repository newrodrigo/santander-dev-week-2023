package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "availabe_limit", scale = 2, precision = 13)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public Card setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Card setNumber(String number) {
        this.number = number;
        return this;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public Card setLimit(BigDecimal limit) {
        this.limit = limit;
        return this;
    }
}

