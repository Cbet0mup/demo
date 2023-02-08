package com.example.strategyexample.strategy.strategyList.strategy;

import com.example.strategyexample.strategy.RegionCode;
import com.example.strategyexample.strategy.strategyList.G1File;
import com.example.strategyexample.strategy.strategyList.G1FileProcessor;
import lombok.NonNull;
import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class Region74G1FileProcessorStrategy implements G1FileProcessor {
    @Override
    public @NotNull String process(G1File g1File) {


        return g1File.getFileName() + "Region74Strategy";
    }

    @Override
    public @NonNull RegionCode getRegionCode() {
        return RegionCode.REGION_74;
    }
}
