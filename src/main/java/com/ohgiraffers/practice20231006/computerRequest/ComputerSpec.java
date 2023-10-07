package com.ohgiraffers.practice20231006.computerRequest;

import javax.persistence.*;



@Entity
@Table(name = "COM_SPEC")
public class ComputerSpec {

    @Id
    @Column(name = "COM_SPEC_NO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int comSpecNo;

    @Column(name = "COMPANY")
    private String company;

    @Column(name = "CPU_NAME")
    private String cpuName;

    @Embedded
    private GPUSpec gpuSpec;

    @Column(name = "MEMORY")
    private String memory;

    @Column(name = "MOTHERBOARD")
    private String motherBoard;

    @Column(name = "STORAGE")
    private String storage;

    @Column(name = "PSU")
    private String psu;

    @Column(name = "COM_CASE")
    private String ComCase;

    public ComputerSpec(String company, String cpuName, GPUSpec gpuSpec, String memory, String motherBoard, String storage, String psu, String comCase) {
        this.company = company;
        this.cpuName = cpuName;
        this.gpuSpec = gpuSpec;
        this.memory = memory;
        this.motherBoard = motherBoard;
        this.storage = storage;
        this.psu = psu;
        ComCase = comCase;
    }

    public int getComSpecNo() {
        return comSpecNo;
    }

    public String getCompany() {
        return company;
    }

    public String getCpuName() {
        return cpuName;
    }

    public GPUSpec getGpuSpec() {
        return gpuSpec;
    }

    public String getMemory() {
        return memory;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public String getStorage() {
        return storage;
    }

    public String getPsu() {
        return psu;
    }

    public String getComCase() {
        return ComCase;
    }

    @Override
    public String toString() {
        return "ComputerSpec{" +
                "comSpecNo=" + comSpecNo +
                ", company='" + company + '\'' +
                ", cpuName='" + cpuName + '\'' +
                ", gpuSpec=" + gpuSpec +
                ", memory='" + memory + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", storage='" + storage + '\'' +
                ", psu='" + psu + '\'' +
                ", ComCase='" + ComCase + '\'' +
                '}';
    }
}
