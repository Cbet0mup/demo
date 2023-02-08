package com.example.strategyexample.strategy.strategyList.strategy;

import com.example.strategyexample.strategy.RegionCode;
import lombok.NonNull;

public interface RegionCodeStrategy {

    @NonNull
    RegionCode getRegionCode();

}
