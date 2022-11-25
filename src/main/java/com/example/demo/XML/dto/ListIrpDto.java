package com.example.demo.XML.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JacksonXmlRootElement(localName = "IRP_LIST")
public class ListIrpDto {
    @JacksonXmlProperty(localName = "IRP")
    @JacksonXmlCData
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<IrpDataDTO> list;
}
