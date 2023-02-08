package com.example.strategyexample.strategy.strategyList;

import com.example.strategyexample.strategy.strategyList.strategy.RegionCodeStrategy;
import org.jetbrains.annotations.NotNull;

public interface G1FileProcessor extends RegionCodeStrategy {
    @NotNull
    String process(G1File file);
}
