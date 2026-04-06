package com.example.adotme.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

@Entity
@Table(name = "animals")
@Getter @Setter
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private Integer age;

    @Enumerated
    @Column(nullable = false)
    private AnimalStatus status = AnimalStatus.AVAILABLE;

    @ManyToOne
    @JoinColumn(name = "ong_id", nullable = false)
    private Ong ong;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
