package com.example.strategyexample.strategy.strategyList.strategy;

import com.example.strategyexample.strategy.RegionCode;
import com.example.strategyexample.strategy.strategyList.G1File;
import com.example.strategyexample.strategy.strategyList.G1FileProcessor;
import lombok.NonNull;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class DefaultRegionG1FileProcessorStrategy implements G1FileProcessor {
    @Override
    public String process(G1File file) {
        return file.getFileName() + "Default";
    }

    @Override
    public @NonNull RegionCode getRegionCode() {
        return RegionCode.ALL_REGIONS;
    }
}
