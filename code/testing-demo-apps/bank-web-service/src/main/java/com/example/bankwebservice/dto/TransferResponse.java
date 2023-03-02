package com.example.bankwebservice.dto;

import com.example.bankwebservice.entity.Transaction;
import lombok.Data;

@Data
public class TransferResponse {

    private int transactionId;
    private double currentBalance;
    private String message;

}
