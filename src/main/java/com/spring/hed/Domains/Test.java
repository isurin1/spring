package com.spring.hed.Domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Test {
    @Id @GeneratedValue
    @Column(name = "id")
    private Long id;

    private String name;
}
