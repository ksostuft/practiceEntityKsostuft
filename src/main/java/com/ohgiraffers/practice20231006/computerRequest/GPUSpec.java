package com.ohgiraffers.practice20231006.computerRequest;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GPUSpec {

    @Column(name = "GPU_CARD_NAME")
    private String gpuCardName;
    @Column(name = "GPU_CORE_AMOUNT")
    private int gpuCoreAmount;
    @Column(name = "GPU_MEMORY_SIZE")
    private double gpuMemorySize;

    @Column(name = "GPU_BASE_CLOCK")
    private int gpuBaseClock;

    @Column(name = "GPU_BOOST_CLOCK")
    private int gpuBoostClock;

    protected GPUSpec() {
    }

    public GPUSpec(String gpuCardName, int gpuCoreAmount, double gpuMemorySize, int gpuBaseClock, int gpuBoostClock) {
        this.gpuCardName = gpuCardName;
        this.gpuCoreAmount = gpuCoreAmount;
        this.gpuMemorySize = gpuMemorySize;
        this.gpuBaseClock = gpuBaseClock;
        this.gpuBoostClock = gpuBoostClock;
    }

    public String getGpuCardName() {
        return gpuCardName;
    }

    public int getGpuCoreAmount() {
        return gpuCoreAmount;
    }

    public double getGpuMemorySize() {
        return gpuMemorySize;
    }

    public int getGpuBaseClock() {
        return gpuBaseClock;
    }

    public int getGpuBoostClock() {
        return gpuBoostClock;
    }

    @Override
    public String toString() {
        return "GPUSpec{" +
                "gpuCardName='" + gpuCardName + '\'' +
                ", gpuCoreAmount=" + gpuCoreAmount +
                ", gpuMemorySize=" + gpuMemorySize +
                ", gpuBaseClock=" + gpuBaseClock +
                ", gpuBoostClock=" + gpuBoostClock +
                '}';
    }
}
