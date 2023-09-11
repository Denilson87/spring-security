package com.heath.Patientsapi.models;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.UniqueElements;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="tb-user")
public class UserModel implements Serializable {

    private static final long serialVersionUID =1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private String name;
    @Column
    @UniqueElements
    private String email;
    @Column
    private Integer role;
}
