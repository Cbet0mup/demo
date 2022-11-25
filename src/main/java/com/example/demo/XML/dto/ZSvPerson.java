package com.example.demo.XML.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@JacksonXmlRootElement(localName = "Z_SV")
public class ZSvPerson {

    @JacksonXmlProperty(localName = "Z_F")
    private String lastName;

    @JacksonXmlProperty(localName = "Z_I")
    private String name;

    @JacksonXmlProperty(localName = "Z_O")
    private String patronymic;

    @JacksonXmlProperty(localName = "Z_DR")
    private String birthDate;

    @JacksonXmlProperty(localName = "Z_ENP")
    private String polisNum;

    @JacksonXmlProperty(localName = "Z_SMO")
    private String smoCode;

    @JacksonXmlProperty(localName = "Z_DOCTYPE")
    private String docType;

    @JacksonXmlProperty(localName = "Z_DOCSER")
    private String docSer;

    @JacksonXmlProperty(localName = "Z_DOCNUM")
    private String docNum;

    @JacksonXmlProperty(localName = "ADR")
    private String address;

    @JacksonXmlProperty(localName = "PHONE")
    private String phone;

    @JacksonXmlProperty(localName = "E-MAIL")
    private String email;
}
