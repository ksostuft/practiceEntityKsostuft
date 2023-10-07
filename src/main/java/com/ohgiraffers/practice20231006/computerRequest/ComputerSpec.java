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

    @Column(name = "MEMORY")
    private int memory;

    @Column(name = "MOTHERBOARD")
    private String motherBoard;

    @Column(name = "MB_COMPATIBLE")
    @Enumerated(EnumType.STRING)
    private MB_Compatible mbCompatible;

    @Column(name = "STORAGE")
    private String storage;

    @Column(name = "PSU")
    private String psu;

    @Column(name = "COM_CASE")
    private String comCase;

    public ComputerSpec() {
    }

    public ComputerSpec(String company, String cpuName, CPU_MFR cpuMfr, GPUSpec gpuSpec, int memory, String motherBoard, MB_Compatible mbCompatible, String storage, String psu, String comCase) {
        checkCompatible(cpuMfr, mbCompatible);
        this.company = company;
        this.cpuName = cpuName;
        this.cpuMfr = cpuMfr;
        this.gpuSpec = gpuSpec;
        this.memory = memory;
        this.motherBoard = motherBoard;
        this.mbCompatible = mbCompatible;
        this.storage = storage;
        this.psu = psu;
        this.comCase = comCase;
    }

    private void checkCompatible(CPU_MFR cpuMfr, MB_Compatible mbCompatible) {
        if(!mbCompatible.name().equals(cpuMfr.name())) {
            throw new IllegalArgumentException("CPU와 메인보드가 호환이 되지 않습니다.");
        }
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

    public int getMemory() {
        return memory;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public MB_Compatible getMbCompatible() {
        return mbCompatible;
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

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "ComputerSpec{" +
                "comSpecNo=" + comSpecNo +
                ", company='" + company + '\'' +
                ", cpuName='" + cpuName + '\'' +
                ", cpuMfr=" + cpuMfr +
                ", gpuSpec=" + gpuSpec +
                ", memory=" + memory +
                ", motherBoard='" + motherBoard + '\'' +
                ", mbCompatible=" + mbCompatible +
                ", storage='" + storage + '\'' +
                ", psu='" + psu + '\'' +
                ", comCase='" + comCase + '\'' +
                '}';
    }
}
