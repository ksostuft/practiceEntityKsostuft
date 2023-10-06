package com.ohgiraffers.practice20231006.computerSpec;

import javax.persistence.Column;

public class CPUSpec {
    @Column(name = "GPU_CORE_AMOUNT")
    private int cpuCoreAmount;

    @Column(name = "THREAD_AMOUNT")
    private int threadAmount;

    @Column(name = "CPU_BASE_CLOCK")
    private double cpuBaseClock;

    @Column(name = "CPU_BOOST_CLOCK")
    private double cpuBoostClock;

    protected CPUSpec() {
    }

    public CPUSpec(int cpuCoreAmount, int threadAmount, double cpuBaseClock, double cpuBoostClock) {
        this.cpuCoreAmount = cpuCoreAmount;
        this.threadAmount = threadAmount;
        this.cpuBaseClock = cpuBaseClock;
        this.cpuBoostClock = cpuBoostClock;
    }

    public int getCpuCoreAmount() {
        return cpuCoreAmount;
    }

    public int getThreadAmount() {
        return threadAmount;
    }

    public double getCpuBaseClock() {
        return cpuBaseClock;
    }

    public double getCpuBoostClock() {
        return cpuBoostClock;
    }

    @Override
    public String toString() {
        return "CPUSpec{" +
                "cpuCoreAmount=" + cpuCoreAmount +
                ", threadAmount=" + threadAmount +
                ", cpuBaseClock=" + cpuBaseClock +
                ", cpuBoostClock=" + cpuBoostClock +
                '}';
    }
}
