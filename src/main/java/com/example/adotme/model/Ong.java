package com.example.adotme.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "ongs")
@Getter @Setter
public class Ong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private Long cnpj;
    private String description;
    private String address;
    private Long contact;
    @Enumerated(EnumType.STRING)
    @Column(name = "status_qualified", nullable = false)
    private StatusQualified qualified = StatusQualified.PENDING;

}
