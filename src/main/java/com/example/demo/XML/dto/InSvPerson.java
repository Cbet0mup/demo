package com.example.demo.XML.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@JacksonXmlRootElement(localName = "IN_SV")
public class InSvPerson {

    @JacksonXmlProperty(localName = "IN_F")
    private String lastName;

    @JacksonXmlProperty(localName = "IN_I")
    private String name;

    @JacksonXmlProperty(localName = "IN_O")
    private String patronymic;

    @JacksonXmlProperty(localName = "IN_DR")
    private String birthDate;

    @JacksonXmlProperty(localName = "IN_ENP")
    private String polisNum;

    @JacksonXmlProperty(localName = "IN_SMO")
    private String smoCode;

    @JacksonXmlProperty(localName = "IN_DOCTYPE")
    private String docType;

    @JacksonXmlProperty(localName = "IN_DOCSER")
    private String docSer;

    @JacksonXmlProperty(localName = "IN_DOCNUM")
    private String docNum;

}
