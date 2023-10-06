package com.ohgiraffers.practice20231006.computerSpec;

import javax.persistence.*;

/*
* 참고: 그냥 간단하게 생각해서 견적을 ‘의뢰 받은 상태’라고 보시면 됩니다.
* 컴퓨터 케이스는 미들 타워, 메인보드는 ATX, M-ATX, 파워는 ATX 크기로 고정합니다.
* CPU, GPU와는 달리 다른 부품은 이름으로 사양을 알 수 있고, 케이스나 파워 같은 경우는 이름이나 사양 만으로 알 수 있기 때문에 깊게 하지 않기로 했습니다.
* 스토리지는 2개 이상 으로 하면 복잡해지기 때문에 1개로 고정합니다.
* 부품 호환 여부는 고려하지 않습니다.
* */

@Entity
@Table(name = "COM_SPEC")
public class ComputerSpec {

    @Id
    @Column(name = "COM_SPEC_NO")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int comSpecNo;

    @Embedded
    private CPUSpec cpuSpec;

    @Embedded
    private GPUSpec gpuSpec;

    @Column
    private String memory;

    @Column
    private String motherBoard;

    @Embedded
    Storage storage;

    @Column
    private String psu;

    @Column
    private String ComCase;
}
