package com.ohgiraffers.practice20231006.computerRequest;

public class ComputerSpecRequestDTO {
    private String company;
    private String cpuName;
    private CPU_MFR cpuMfr;
    private String gpuCardName;
    private int gpuCoreAmount;
    private double gpuMemorySize;
    private int gpuBoostClock;
    private GPU_MFR gpuMfr;
    private int memory;
    private String motherBoard;
    private String storage;
    private String psu;
    private String comCase;

    public ComputerSpecRequestDTO() {
    }

    public ComputerSpecRequestDTO(String company, String cpuName, CPU_MFR cpuMfr, String gpuCardName, int gpuCoreAmount, double gpuMemorySize, int gpuBoostClock, GPU_MFR gpuMfr, int memory, String motherBoard, String storage, String psu, String comCase) {
        this.company = company;
        this.cpuName = cpuName;
        this.cpuMfr = cpuMfr;
        this.gpuCardName = gpuCardName;
        this.gpuCoreAmount = gpuCoreAmount;
        this.gpuMemorySize = gpuMemorySize;
        this.gpuBoostClock = gpuBoostClock;
        this.gpuMfr = gpuMfr;
        this.memory = memory;
        this.motherBoard = motherBoard;
        this.storage = storage;
        this.psu = psu;
        this.comCase = comCase;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public CPU_MFR getCpuMfr() {
        return cpuMfr;
    }

    public void setCpuMfr(CPU_MFR cpuMfr) {
        this.cpuMfr = cpuMfr;
    }

    public String getGpuCardName() {
        return gpuCardName;
    }

    public void setGpuCardName(String gpuCardName) {
        this.gpuCardName = gpuCardName;
    }

    public int getGpuCoreAmount() {
        return gpuCoreAmount;
    }

    public void setGpuCoreAmount(int gpuCoreAmount) {
        this.gpuCoreAmount = gpuCoreAmount;
    }

    public double getGpuMemorySize() {
        return gpuMemorySize;
    }

    public void setGpuMemorySize(double gpuMemorySize) {
        this.gpuMemorySize = gpuMemorySize;
    }

    public int getGpuBoostClock() {
        return gpuBoostClock;
    }

    public void setGpuBoostClock(int gpuBoostClock) {
        this.gpuBoostClock = gpuBoostClock;
    }

    public GPU_MFR getGpuMfr() {
        return gpuMfr;
    }

    public void setGpuMfr(GPU_MFR gpuMfr) {
        this.gpuMfr = gpuMfr;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getPsu() {
        return psu;
    }

    public void setPsu(String psu) {
        this.psu = psu;
    }

    public String getComCase() {
        return comCase;
    }

    public void setComCase(String comCase) {
        this.comCase = comCase;
    }

    @Override
    public String toString() {
        return "ComputerSpecRequestDTO{" +
                "company='" + company + '\'' +
                ", cpuName='" + cpuName + '\'' +
                ", cpuMfr=" + cpuMfr +
                ", gpuCardName='" + gpuCardName + '\'' +
                ", gpuCoreAmount=" + gpuCoreAmount +
                ", gpuMemorySize=" + gpuMemorySize +
                ", gpuBoostClock=" + gpuBoostClock +
                ", gpuMfr=" + gpuMfr +
                ", memory=" + memory +
                ", motherBoard='" + motherBoard + '\'' +
                ", storage='" + storage + '\'' +
                ", psu='" + psu + '\'' +
                ", comCase='" + comCase + '\'' +
                '}';
    }
}
