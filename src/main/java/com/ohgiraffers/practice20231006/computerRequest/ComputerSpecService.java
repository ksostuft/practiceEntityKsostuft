package com.ohgiraffers.practice20231006.computerRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ComputerSpecService {
    private ComputerSpecRepository computerSpecRepository;

    @Autowired
    public ComputerSpecService(ComputerSpecRepository computerSpecRepository) {
        this.computerSpecRepository = computerSpecRepository;
    }

    @Transactional
    public void registComSpec(ComputerSpecRequestDTO computerSpecRequestDTO) {
        ComputerSpec computerSpec = new ComputerSpec(
                computerSpecRequestDTO.getCompany(),
                computerSpecRequestDTO.getCpuName(),
                computerSpecRequestDTO.getCpuMfr(),
                new GPUSpec(
                        computerSpecRequestDTO.getGpuCardName(),
                        computerSpecRequestDTO.getGpuCoreAmount(),
                        computerSpecRequestDTO.getGpuMemorySize(),
                        computerSpecRequestDTO.getGpuBaseClock(),
                        computerSpecRequestDTO.getGpuBoostClock()
                ),
                computerSpecRequestDTO.getMemory(),
                computerSpecRequestDTO.getMotherBoard(),
                computerSpecRequestDTO.getMbCompatible(),
                computerSpecRequestDTO.getStorage(),
                computerSpecRequestDTO.getPsu(),
                computerSpecRequestDTO.getComCase()
        );

        computerSpecRepository.save(computerSpec);
    }

}
