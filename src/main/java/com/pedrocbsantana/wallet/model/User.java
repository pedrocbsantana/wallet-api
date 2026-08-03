package com.pedrocbsantana.wallet.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class User {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(mappedBy = "user")
    private Account account;
    private String username;
    private String password;
    private String name;

}
