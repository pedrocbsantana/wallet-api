package com.pedrocbsantana.wallet.exception;

public class UsernameAlreadyExistsException extends RuntimeException {

    public UsernameAlreadyExistsException(String username) {
        super("Username já cadastrado: " + username);
    }
}
