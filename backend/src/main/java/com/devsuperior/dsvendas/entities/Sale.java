package com.devsuperior.dsvendas.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    public Sale() {
    }

    public Sale(long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }

    public long getId() {
        return id;
    }

    public Integer getVisited() {
        return visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
