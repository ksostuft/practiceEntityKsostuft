package com.ohgiraffers.practice20231006.computerRequest;

public class ComputerSpecRequestDTO {
    private String company;
    private String cpuName;
    private String gpuCardName;
    private int gpuCoreAmount;
    private double gptMemorySize;
    private double gpuBoostClock;
    private String memory;
    private String motherBoard;
    private String storage;
    private String psu;
    private String ComCase;

    public ComputerSpecRequestDTO() {
    }

    public ComputerSpecRequestDTO(String company, String cpuName, String gpuCardName, int gpuCoreAmount, double gptMemorySize, double gpuBoostClock, String memory, String motherBoard, String storage, String psu, String comCase) {
        this.company = company;
        this.cpuName = cpuName;
        this.gpuCardName = gpuCardName;
        this.gpuCoreAmount = gpuCoreAmount;
        this.gptMemorySize = gptMemorySize;
        this.gpuBoostClock = gpuBoostClock;
        this.memory = memory;
        this.motherBoard = motherBoard;
        this.storage = storage;
        this.psu = psu;
        ComCase = comCase;
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
        return gptMemorySize;
    }

    public void setGptMemorySize(double gptMemorySize) {
        this.gptMemorySize = gptMemorySize;
    }

    public double getGpuBoostClock() {
        return gpuBoostClock;
    }

    public void setGpuBoostClock(double gpuBoostClock) {
        this.gpuBoostClock = gpuBoostClock;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
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
        return ComCase;
    }

    public void setComCase(String comCase) {
        ComCase = comCase;
    }

    @Override
    public String toString() {
        return "ComputerSpecRequestDTO{" +
                "company='" + company + '\'' +
                ", cpuName='" + cpuName + '\'' +
                ", gpuCardName='" + gpuCardName + '\'' +
                ", gpuCoreAmount=" + gpuCoreAmount +
                ", gptMemorySize=" + gptMemorySize +
                ", gpuBoostClock=" + gpuBoostClock +
                ", memory='" + memory + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", storage='" + storage + '\'' +
                ", psu='" + psu + '\'' +
                ", ComCase='" + ComCase + '\'' +
                '}';
    }
}
