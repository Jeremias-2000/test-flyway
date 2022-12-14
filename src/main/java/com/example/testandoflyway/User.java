package com.example.testandoflyway;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "user_test")
public class User implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private String email;





}
