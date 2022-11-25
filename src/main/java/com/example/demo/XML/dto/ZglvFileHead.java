package com.example.demo.XML.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@JacksonXmlRootElement(localName = "ZGLV")
public class ZglvFileHead {

    @JacksonXmlProperty(localName = "VERSION")
    @Getter
    @Setter
    private String version;

    @JacksonXmlProperty(localName = "DATA")
    @Getter
    @Setter
    private String dateForm;

    @JacksonXmlProperty(localName = "YEAR")
    @Getter
    @Setter
    private String yearReport;

    @JacksonXmlProperty(localName = "MONTH")
    @Getter
    @Setter
    private String monthReport;

    @JacksonXmlProperty(localName = "DAY")
    @Getter
    @Setter
    private String dayReport;

    @JacksonXmlProperty(localName = "TIME")
    @Getter
    @Setter
    private String timeReport;

    @JacksonXmlProperty(localName = "SMO")
    @Getter
    @Setter
    private String smoCode;

    @JacksonXmlProperty(localName = "FILENAME")
    @Getter
    @Setter
    private String fileName;
}