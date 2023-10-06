package com.ohgiraffers.practice20231006.computerSpec;

import javax.persistence.Column;

public class GPUSpec {
    @Column(name = "GPU_CORE_AMOUNT")
    private int gpuCoreAmount;

    @Column(name = "GPU_MEMORY_SIZE")
    private int gptMemorySize;

    @Column(name = "GPU_BOOST_CLOCK")
    private double gpuBoostClock;

    protected GPUSpec() {
    }

    public GPUSpec(int gpuCoreAmount, int gptMemorySize, double gpuBoostClock) {
        this.gpuCoreAmount = gpuCoreAmount;
        this.gptMemorySize = gptMemorySize;
        this.gpuBoostClock = gpuBoostClock;
    }

    public int getGpuCoreAmount() {
        return gpuCoreAmount;
    }

    public int getGptMemorySize() {
        return gptMemorySize;
    }

    public double getGpuBoostClock() {
        return gpuBoostClock;
    }

    @Override
    public String toString() {
        return "GPUSpec{" +
                "gpuCoreAmount=" + gpuCoreAmount +
                ", gptMemorySize=" + gptMemorySize +
                ", gpuBoostClock=" + gpuBoostClock +
                '}';
    }
}
