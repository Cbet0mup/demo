package com.example.demo.XML.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JacksonXmlRootElement(localName = "IRP_LIST")
public class IrpListRoot {

    @JacksonXmlProperty(localName = "IRP")
    @JsonPropertyOrder(alphabetic = true)
    private Collection<Map<String, ?>> irpTicketCollection;
}
