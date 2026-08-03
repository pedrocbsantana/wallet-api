package com.pedrocbsantana.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pedrocbsantana.wallet.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
