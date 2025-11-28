package com.wellsfargo.counselor.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;


@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private final LocalDate creationDate = LocalDate.now();

    protected Portfolio() {
    }

    public Portfolio(Long portfolioId, Long clientId){
        this.portfolioId = portfolioId;
        this.clientId = clientId;
        //this.creationDate = ;
    }

    public void setClientID(Long clientId){
        this.clientId = clientId;
    }

    public Long getClientID(){
        return clientId;
    }

    public Long getPortfolioID(){
        return portfolioId;
    }

    public LocalDate getCreationDate(){
        return creationDate;
    }
}
