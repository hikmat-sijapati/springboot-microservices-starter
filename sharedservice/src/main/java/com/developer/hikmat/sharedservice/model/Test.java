package com.developer.hikmat.sharedservice.model;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_seq_gen")
    @SequenceGenerator(name = "test_seq_gen", sequenceName = "test_seq")
    private long id;

    private String name;
}
