package com.example.bankwebservice.service;


import com.example.bankwebservice.entity.Transaction;
import com.example.bankwebservice.entity.TransactionType;
import com.example.bankwebservice.exception.InvalidInputException;
import com.example.bankwebservice.exception.NotFoundException;
import com.example.bankwebservice.entity.Account;
import com.example.bankwebservice.repository.AccountRepository;
import com.example.bankwebservice.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransferServiceImpl implements TransferService {


    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;

    @Override
    @Transactional
    public Transaction transfer(double amount, String source, String destination) {

        Account sourceAccount = accountRepository.findById(source).orElseThrow(() -> new NotFoundException("account: " + source));
        Account destinationAccount = accountRepository.findById(destination).orElseThrow(() -> new NotFoundException("account: " + destination));

        if (sourceAccount.getBalance() < amount)
            throw new InvalidInputException("Insufficient funds");

        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        destinationAccount.setBalance(destinationAccount.getBalance() + amount);

        Transaction debitTransaction = new Transaction();
        debitTransaction.setType(TransactionType.DEBIT);
        debitTransaction.setAmount(amount);
        debitTransaction.setDate(new Date());
        debitTransaction.setAccount(sourceAccount);
        debitTransaction.setClosingBalance(sourceAccount.getBalance());


        Transaction creditTransaction = new Transaction();
        creditTransaction.setType(TransactionType.CREDIT);
        creditTransaction.setAmount(amount);
        creditTransaction.setDate(new Date());
        creditTransaction.setAccount(destinationAccount);
        creditTransaction.setClosingBalance(sourceAccount.getBalance());

        transactionRepository.saveAll(List.of(debitTransaction, creditTransaction));


        accountRepository.save(sourceAccount);
        accountRepository.save(destinationAccount);

        return debitTransaction;


    }


}
