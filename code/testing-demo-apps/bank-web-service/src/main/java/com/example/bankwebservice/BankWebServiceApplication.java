package com.example.bankwebservice;

import com.example.bankwebservice.entity.Account;
import com.example.bankwebservice.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BankWebServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankWebServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(
            AccountRepository accountRepository
    ) {
        return args -> {
            Account account1 = new Account("111", 1000.00);
            Account account2 = new Account("222", 1000.00);
            accountRepository.saveAll(List.of(account1, account2));
        };
    }

}
