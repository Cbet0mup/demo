package com.example.strategyexample.strategy.strategyList;

import com.example.strategyexample.strategy.RegionCode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProcessFileStrategyExperimentalClassTest {
    private final String message = "12345678901234567890";

    private final XmlG1File file = XmlG1File
            .builder()
            .file(message.getBytes())
            .regionCode(RegionCode.REGION_74)
            .fileName("fileHuyail.xml")
            .build();

    @Autowired
    private ProcessFileStrategyExperimentalClass strategyExperimentalClass;


    @Test
    void printString() {
        strategyExperimentalClass.printString(file);

    }
}