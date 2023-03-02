package com.example.bankwebservice.api;

import com.example.bankwebservice.entity.Transaction;
import com.example.bankwebservice.exception.NotFoundException;
import com.example.bankwebservice.entity.Account;
import com.example.bankwebservice.repository.AccountRepository;
import com.example.bankwebservice.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/accounts")
public class AccountsController {

    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;

    @GetMapping
    public ResponseEntity<?> getAccounts() {
        Iterable<Account> accounts = accountRepository.findAll();
        return ResponseEntity.ok(accounts);
    }

    @GetMapping("/{number}")
    public ResponseEntity<?> getAccount(
            @PathVariable String number
    ) {
        Account account = accountRepository.findById(number).orElseThrow(() -> new NotFoundException("account: " + number));
        return ResponseEntity.ok(account);
    }

    @GetMapping("/{number}/transactions")
    public ResponseEntity<?> getTransactions(
            @PathVariable String number
    ) {
        Iterable<Transaction> transactions = transactionRepository.findByAccount(number);
        return ResponseEntity.ok(transactions);
    }

}
