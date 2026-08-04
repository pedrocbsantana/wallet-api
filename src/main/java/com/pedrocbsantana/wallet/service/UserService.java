package com.pedrocbsantana.wallet.service;

import org.springframework.stereotype.Service;

import com.pedrocbsantana.wallet.repository.AccountRepository;
import com.pedrocbsantana.wallet.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final AccountRepository accountRepository;

    public UserService(UserRepository userRepository, AccountRepository accountRepository) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
    }
}
