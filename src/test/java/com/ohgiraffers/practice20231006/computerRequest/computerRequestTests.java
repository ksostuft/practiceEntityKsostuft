package com.ohgiraffers.practice20231006.computerRequest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
public class computerRequestTests {

    @Autowired
    private ComputerSpecService computerSpecInsertService;

    private static Stream<Arguments> getComSpec() {
        return Stream.of(
                Arguments.of(
                            "컴디시",
                        "13400F",
                        "INTEL",
                        "이엠텍 지포스 RTX 4070 Ti GAMINGPRO D6X 12GB",
                        3072,
                        8,
                        2670,
                        "NVIDIA",
                        16,
                        "MSI MAG B760M 박격포",
                        "INTEL",
                        "SK하이닉스 Platinum P41 M.2 NVMe",
                        "마이크로닉스 Classic II 풀체인지 800W 80PLUS BRONZE 230V EU",
                        "BRAVOTEC GUARDIAN 3100M V2 타이탄 글래스"
                )
        );
    }
    @ParameterizedTest
    @MethodSource("getComSpec")
    void testInsertComSpec(String company, String cpuName, CPU_MFR cpuMfr, String gpuCardName, int gpuCoreAmount, int gptMemorySize, int gpuBoostClock, GPU_MFR gpuMfr, int memory, String motherBoard, MB_Compatible mbCompatible, String storage, String psu, String comCase) {
        ComputerSpecRequestDTO computerSpecRequestDTO = new ComputerSpecRequestDTO(company, cpuName, cpuMfr,  gpuCardName, gpuCoreAmount, gptMemorySize, gpuBoostClock, gpuMfr, memory, motherBoard, mbCompatible, storage, psu, comCase);
        Assertions.assertDoesNotThrow(
                () -> computerSpecInsertService.registComSpec(computerSpecRequestDTO)
        );
    }


}
