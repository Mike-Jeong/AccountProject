package com.example.account.service;

import com.example.account.domain.Account;
import com.example.account.domain.AccountStatus;
import com.example.account.repository.AccountRepository;
import com.example.account.repository.AccountUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    private final AccountUserRepository;

    @Transactional
    public void createAccount(Long userId, Long initialBalance) {
        accountRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User Not Found."));
    }

    @Transactional
    public Account getAccount(Long id) {
        if(id < 0){
            throw new RuntimeException("Minus");
        }
        return accountRepository.findById(id).get();
    }
}
