package com.example.demo.XML.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;


@AllArgsConstructor
@ToString
@NoArgsConstructor
@Builder
@Data
@JacksonXmlRootElement(localName = "IRP")
public class IrpDataDTO {

    @JacksonXmlProperty(localName = "N_IRP")
    private String ticketId;

    @JacksonXmlProperty(localName = "TF_ID")
    private String tfomsTicketId;

    @JacksonXmlProperty(localName = "IRP_TYPE")
    private Byte ticketType;

    @JacksonXmlProperty(localName = "DATE_CREATE")
    private String dateCreate;

    @JacksonXmlProperty(localName = "TIME_CREATE")
    private String timeCreate;

    @JacksonXmlProperty(localName = "WAY")
    private byte way;

    @JacksonXmlProperty(localName = "WAY_N")
    private String wayOrg;

    @JacksonXmlProperty(localName = "METHOD")
    private Byte method;
    private Byte method_map;

    @JacksonXmlProperty(localName = "HOW")
    private byte how;

    @JacksonXmlProperty(localName = "THEME")
    private String ticketThemeIdTfVarchar;

    @JacksonXmlProperty(localName = "TEXT")
    private String ticketText;

    @JacksonXmlProperty(localName = "MEASURES")
    private String measures;

    @JacksonXmlProperty(localName = "ZH_D")
    private String complaintType;

    @JacksonXmlProperty(localName = "OTV_T")
    private byte orgWork;

    @JacksonXmlProperty(localName = "OTV_KON")
    private String orgWorkCode;

    @JacksonXmlProperty(localName = "EMPLOYEE_1")
    private String employeeBusiness;

    @JacksonXmlProperty(localName = "EMPLOYEE_IT")
    private String employeeIT;

    @JacksonXmlProperty(localName = "Z_SV")
    private ZSvPerson z_SV;

    @JacksonXmlProperty(localName = "IN_SV")
    private InSvPerson inSvPerson;

    @JacksonXmlProperty(localName = "DATA_PLAN")
    private String planDate;

    @JacksonXmlProperty(localName = "DATE_CLOSE")
    private String closeDate;

    @JacksonXmlProperty(localName = "RESULT")
    private String result;

    @JacksonXmlProperty(localName = "PR_OUT")
    private Integer redirectionOrganization;

    @JacksonXmlProperty(localName = "DATE_CROSS")
    private String redirectionDate;

    @JacksonXmlProperty(localName = "TIME_CROSS")
    private String redirectionTime;

    @JacksonXmlProperty(localName = "DISTRICT")
    private String municipalityKrd;

    @JacksonXmlProperty(localName = "DISTRICT_COMPLAINT")
    private String complaintDistrict;

    @JacksonXmlProperty(localName = "MO_COMPLAINT")
    private String complaintMoCode;

    @JacksonXmlProperty(localName = "NUMBER_CLOSE")
    private String numberClose;

    @JacksonXmlProperty(localName = "THF")
    private Short medicalCare;

    @JacksonXmlProperty(localName = "PR_OMP")
    private Short medicalProf;

    @JacksonXmlProperty(localName = "LINE_1")
    private String line1;

    @JacksonXmlProperty(localName = "LINE_IT")
    private String lineIt;

    @JacksonXmlProperty(localName = "TERR")
    private String municipality;

    @JacksonXmlProperty(localName = "CODE_PG")
    private String codePg;

    @JacksonXmlProperty(localName = "ZPZ")
    private String zpz;

    @JacksonXmlProperty(localName = "MSG_RESULT")
    private String msgResult;

    @JacksonXmlProperty(localName = "MO_ERR")
    private String medicalOrganizationError;

    @JacksonXmlProperty(localName = "TEXT_RESULT")
    private String ticketTextResult;

}
