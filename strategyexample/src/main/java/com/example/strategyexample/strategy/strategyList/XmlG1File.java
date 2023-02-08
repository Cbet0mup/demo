package com.example.strategyexample.strategy.strategyList;

import com.example.strategyexample.strategy.RegionCode;
import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class XmlG1File implements G1File {

    private byte[] file;

    private String fileName;

    private RegionCode regionCode;

}
