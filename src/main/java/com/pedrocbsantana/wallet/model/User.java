package com.pedrocbsantana.wallet.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
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
