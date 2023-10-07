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
        isPositiveAndReally(gpuCoreAmount, gpuMemorySize, gpuBaseClock, gpuBoostClock);
        this.gpuCardName = gpuCardName;
        this.gpuCoreAmount = gpuCoreAmount;
        this.gpuMemorySize = gpuMemorySize;
        this.gpuBaseClock = gpuBaseClock;
        this.gpuBoostClock = gpuBoostClock;
    }

    private void isPositiveAndReally(int gpuCoreAmount, double gpuMemorySize, int gpuBaseClock, int gpuBoostClock) {
        String message = "";
        boolean isNegative = false;
        if(gpuCoreAmount < 2000) {
            isNegative = true;
            message += "GPU 코어 수가 2000개 미만입니다.\n";
        }
        if(gpuMemorySize < 8) {
            isNegative = true;
            message += "GPU 메모리가 8GB 미만입니다.\n";
        }
        if(gpuBaseClock < 1000) {
            isNegative = true;
            message += "GPU 베이스 클럭이 1000Mhz 미만입니다.\n";
        }
        if(gpuBoostClock < gpuBaseClock) {
            isNegative = true;
            message += "GPU 부스트 클럭은 베이스 클럭보다 높아야 합니다.\n";
        }
        if(isNegative) {
            throw new IllegalArgumentException(message);
        }
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
