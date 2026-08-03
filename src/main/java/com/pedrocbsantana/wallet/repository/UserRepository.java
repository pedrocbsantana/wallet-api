package com.pedrocbsantana.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pedrocbsantana.wallet.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
