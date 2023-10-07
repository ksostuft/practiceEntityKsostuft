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
    private double gptMemorySize;

    @Column(name = "GPU_BOOST_CLOCK")
    private double gpuBoostClock;

    protected GPUSpec() {
    }

    public GPUSpec(String  gpuCardName, int gpuCoreAmount, double gptMemorySize, double gpuBoostClock) {
        this.gpuCardName = gpuCardName;
        this.gpuCoreAmount = gpuCoreAmount;
        this.gptMemorySize = gptMemorySize;
        this.gpuBoostClock = gpuBoostClock;
    }

    public String getGpuCardName() {
        return gpuCardName;
    }

    public int getGpuCoreAmount() {
        return gpuCoreAmount;
    }

    public double getGptMemorySize() {
        return gptMemorySize;
    }

    public double getGpuBoostClock() {
        return gpuBoostClock;
    }

    @Override
    public String toString() {
        return "GPUSpec{" +
                "gpuCardName=" + gpuCardName +
                ", gpuCoreAmount=" + gpuCoreAmount +
                ", gptMemorySize=" + gptMemorySize +
                ", gpuBoostClock=" + gpuBoostClock +
                '}';
    }
}
