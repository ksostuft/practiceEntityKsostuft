package com.ohgiraffers.practice20231006.computerSpec;

import javax.persistence.*;

@Entity
@Table(name = "COM_SPEC")
public class ComputerSpec {

    @Id
    @Column(name = "COM_SPEC_NO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int comSpecNo;
}
