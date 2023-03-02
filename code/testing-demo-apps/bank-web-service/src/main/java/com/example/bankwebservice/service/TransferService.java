package com.example.bankwebservice.service;

import com.example.bankwebservice.entity.Transaction;

public interface TransferService {
    public Transaction transfer(double amount, String source, String destination);
}
