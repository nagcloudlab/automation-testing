package com.example.bankwebservice.repository;

import com.example.bankwebservice.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {

    @Query("from Transaction t where t.account.number=:number")
    Iterable<Transaction> findByAccount(String number);

}
