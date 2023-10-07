package com.ohgiraffers.practice20231006.computerRequest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
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
                        2310,
                        2670,
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
    void testInsertComSpec(String company, String cpuName, CPU_MFR cpuMfr, String gpuCardName, int gpuCoreAmount, int gptMemorySize, int gpuBaseClock, int gpuBoostClock, int memory, String motherBoard, MB_Compatible mbCompatible, String storage, String psu, String comCase) {
        ComputerSpecRequestDTO computerSpecRequestDTO = new ComputerSpecRequestDTO(company, cpuName, cpuMfr,  gpuCardName, gpuCoreAmount, gptMemorySize, gpuBaseClock, gpuBoostClock, memory, motherBoard, mbCompatible, storage, psu, comCase);
        Assertions.assertDoesNotThrow(
                () -> computerSpecInsertService.registComSpec(computerSpecRequestDTO)
        );
    }

    /* 그냥 ENUM을 잘못 입력한 경우 */
    @ParameterizedTest
    @CsvSource("'컴디시', '13400F', '둘다', '이엠텍 지포스 RTX 4070 Ti GAMINGPRO D6X 12GB', 7680, 12, 2310, 2610 , 16, 'MSI MAG B760M 박격포', 'INTEL', 'SK하이닉스 Platinum P41 M.2 NVMe', '마이크로닉스 Classic II 풀체인지 800W 80PLUS BRONZE 230V EU', 'BRAVOTEC GUARDIAN 3100M V2 타이탄 글래스'")
    void testInsertComSpecWithCSV0(String company, String cpuName, CPU_MFR cpuMfr, String gpuCardName, int gpuCoreAmount, int gptMemorySize, int gpuBaseClock, int gpuBoostClock, int memory, String motherBoard, MB_Compatible mbCompatible, String storage, String psu, String comCase) {
        ComputerSpecRequestDTO computerSpecRequestDTO = new ComputerSpecRequestDTO(company, cpuName, cpuMfr,  gpuCardName, gpuCoreAmount, gptMemorySize, gpuBaseClock, gpuBoostClock, memory, motherBoard, mbCompatible, storage, psu, comCase);
        Assertions.assertDoesNotThrow(
                () -> computerSpecInsertService.registComSpec(computerSpecRequestDTO)
        );
    }

    /* CPU 메인보드 관련해서 예외를 발생시키기 */
    @ParameterizedTest
    @CsvSource("'컴디시', '13400F', 'INTEL', '이엠텍 지포스 RTX 4070 Ti GAMINGPRO D6X 12GB', 7680, 12, 2310, 2610 , 16, 'MSI MAG B760M 박격포', 'AMD', 'SK하이닉스 Platinum P41 M.2 NVMe', '마이크로닉스 Classic II 풀체인지 800W 80PLUS BRONZE 230V EU', 'BRAVOTEC GUARDIAN 3100M V2 타이탄 글래스'")
    void testInsertComSpecWithCSV1(String company, String cpuName, CPU_MFR cpuMfr, String gpuCardName, int gpuCoreAmount, int gptMemorySize, int gpuBaseClock, int gpuBoostClock, int memory, String motherBoard, MB_Compatible mbCompatible, String storage, String psu, String comCase) {
        ComputerSpecRequestDTO computerSpecRequestDTO = new ComputerSpecRequestDTO(company, cpuName, cpuMfr,  gpuCardName, gpuCoreAmount, gptMemorySize, gpuBaseClock, gpuBoostClock, memory, motherBoard, mbCompatible, storage, psu, comCase);
        Assertions.assertDoesNotThrow(
                () -> computerSpecInsertService.registComSpec(computerSpecRequestDTO)
        );
    }

    /* GPU 스펙 관련해서 예외를 발생시키기 */
    @ParameterizedTest
    @CsvSource("'컴디시', '13400F', 'INTEL', '이엠텍 지포스 RTX 4070 Ti GAMINGPRO D6X 12GB', 1980, 7, 700, 600, 16, 'MSI MAG B760M 박격포', 'INTEL', 'SK하이닉스 Platinum P41 M.2 NVMe', '마이크로닉스 Classic II 풀체인지 800W 80PLUS BRONZE 230V EU', 'BRAVOTEC GUARDIAN 3100M V2 타이탄 글래스'")
    void testInsertComSpecWithCSV2(String company, String cpuName, CPU_MFR cpuMfr, String gpuCardName, int gpuCoreAmount, int gptMemorySize, int gpuBaseClock, int gpuBoostClock, int memory, String motherBoard, MB_Compatible mbCompatible, String storage, String psu, String comCase) {
        ComputerSpecRequestDTO computerSpecRequestDTO = new ComputerSpecRequestDTO(company, cpuName, cpuMfr,  gpuCardName, gpuCoreAmount, gptMemorySize, gpuBaseClock, gpuBoostClock, memory, motherBoard, mbCompatible, storage, psu, comCase);
        Assertions.assertDoesNotThrow(
                () -> computerSpecInsertService.registComSpec(computerSpecRequestDTO)
        );
    }

    /* insert를 했으니 이제 CRUD를 할 차례 */

    /* select */
    @ParameterizedTest
    @CsvSource("1")
    void testSelectWithComSpecNo0(int no) {
        Assertions.assertDoesNotThrow(
                () -> computerSpecInsertService.findComSpec(no)
        );

        ComputerSpec computerSpec = computerSpecInsertService.findComSpec(no);
        Assertions.assertEquals(no, computerSpec.getComSpecNo());
    }

    /* 오류 만들기 */
    @ParameterizedTest
    @CsvSource("1000")
    void testSelectWithComSpecNo1(int no) {
        Assertions.assertDoesNotThrow(
                () -> computerSpecInsertService.findComSpec(no)
        );

        ComputerSpec computerSpec = computerSpecInsertService.findComSpec(no);
        Assertions.assertEquals(no, computerSpec.getComSpecNo());
    }

    /* 갯수 조회 */
    /* 테이블 확인하고 해야 합니다. */
    @Test
    void testComSpecCount() {
        Assertions.assertEquals(2, computerSpecInsertService.findComSpecCount());
    }

    /* update, 견적준 회사 이름 변경하기 */
    @ParameterizedTest
    @CsvSource("1,'컴퓨존'")
    void testModifyCompany(int comSpecNo, String company) {
        ComputerSpec computerSpec = computerSpecInsertService.modifyCompany(comSpecNo, company);

        Assertions.assertEquals(company, computerSpec.getCompany());
    }

    /* 항목 하나 제거하기 */
    /* 5번 이상 insert 한 다음 하는 것을 추천합니다. */
}
