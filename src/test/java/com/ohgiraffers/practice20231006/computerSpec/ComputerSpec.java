package com.ohgiraffers.practice20231006.computerSpec;

import javax.persistence.*;



@Entity
@Table(name = "COM_SPEC")
public class ComputerSpec {

    @Id
    @Column(name = "COM_SPEC_NO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int comSpecNo;

    @Embedded
    private CPUSpec cpuSpec;

    @Embedded
    private GPUSpec gpuSpec;

    @Column
    private String memory;

    @Column
    private String motherBoard;

    @Embedded
    Storage storage;

    @Column
    private String psu;

    @Column
    private String ComCase;
}
