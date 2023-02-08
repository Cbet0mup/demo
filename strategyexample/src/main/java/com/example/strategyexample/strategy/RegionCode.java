package com.example.strategyexample.strategy;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
public enum RegionCode {

    /**
     * <h1>Все регионы</h1>
     */
    ALL_REGIONS(0),

    /**
     * <h1>Брянск</h1>
     */
    REGION_32(32),

    /**
     * <h1>Кемерово</h1>
     */
    REGION_42(42),

    /**
     * <h1>Тюмень</h1>
     */
    REGION_72(72),

    /**
     * <h1>Челябинск</h1>
     */
    REGION_74(74);

    private final Integer code;
    private static final Map<Integer, RegionCode> map = Stream.of(RegionCode.values()).collect(Collectors.toMap(RegionCode::getCode, Function.identity()));

    RegionCode(Integer code) {
        this.code = code;
    }

    public static RegionCode valueOf(Integer code) {
        return map.get(code);
    }

    @JsonValue
    public Integer getCode() {
        return code;
    }

    @Override
    public String toString() {
        return String.valueOf(code);
    }
}