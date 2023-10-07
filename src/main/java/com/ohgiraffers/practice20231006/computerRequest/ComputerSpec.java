package com.ohgiraffers.practice20231006.computerRequest;

import javax.persistence.*;



@Entity
@Table(name = "COM_SPEC")
public class ComputerSpec {

    @Id
    @Column(name = "COM_SPEC_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comSpecNo;

    @Column(name = "COMPANY")
    private String company;

    @Column(name = "CPU_NAME")
    private String cpuName;

    @Column(name = "CPU_MFR")
    @Enumerated(EnumType.STRING)
    private CPU_MFR cpuMfr;

    @Embedded
    private GPUSpec gpuSpec;

    @Column(name = "GPU_MFR")
    @Enumerated(EnumType.STRING)
    private GPU_MFR gpuMfr;

    @Column(name = "MEMORY")
    private int memory;

    @Column(name = "MOTHERBOARD")
    private String motherBoard;

    @Column(name = "STORAGE")
    private String storage;

    @Column(name = "PSU")
    private String psu;

    @Column(name = "COM_CASE")
    private String comCase;

    public ComputerSpec() {
    }

    public ComputerSpec(String company, String cpuName, CPU_MFR cpuMfr, GPUSpec gpuSpec, GPU_MFR gpuMfr, int memory, String motherBoard, String storage, String psu, String comCase) {
        this.company = company;
        this.cpuName = cpuName;
        this.cpuMfr = cpuMfr;
        this.gpuSpec = gpuSpec;
        this.gpuMfr = gpuMfr;
        this.memory = memory;
        this.motherBoard = motherBoard;
        this.storage = storage;
        this.psu = psu;
        this.comCase = comCase;
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

    public CPU_MFR getCpuMfr() {
        return cpuMfr;
    }

    public GPUSpec getGpuSpec() {
        return gpuSpec;
    }

    public GPU_MFR getGpuMfr() {
        return gpuMfr;
    }

    public int getMemory() {
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
        return comCase;
    }

    @Override
    public String toString() {
        return "ComputerSpec{" +
                "comSpecNo=" + comSpecNo +
                ", company='" + company + '\'' +
                ", cpuName='" + cpuName + '\'' +
                ", cpuMfr=" + cpuMfr +
                ", gpuSpec=" + gpuSpec +
                ", gpuMfr=" + gpuMfr +
                ", memory=" + memory +
                ", motherBoard='" + motherBoard + '\'' +
                ", storage='" + storage + '\'' +
                ", psu='" + psu + '\'' +
                ", comCase='" + comCase + '\'' +
                '}';
    }
}
