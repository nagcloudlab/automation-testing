package com.example.bankwebservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private double amount;
    private double closingBalance;
    private TransactionType type;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "account_number")
    private Account account;
    private String remarks;



}
