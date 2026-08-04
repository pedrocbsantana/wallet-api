package com.pedrocbsantana.wallet.dto;

import java.math.BigDecimal;

import com.pedrocbsantana.wallet.model.User;

public record UserResponse(Long id, String username, String name, BigDecimal balance) {

    public static UserResponse from(User user) {
        return new UserResponse(
                user.getId(),
                user.getUsername(),
                user.getName(),
                user.getAccount().getBalance());
    }
}
