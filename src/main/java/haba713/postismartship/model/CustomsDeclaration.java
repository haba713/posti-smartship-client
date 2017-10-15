
package haba713.postismartship.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sender",
    "receiver",
    "printSet",
    "parcelCount",
    "reference",
    "sourceCountryCode",
    "destinationCountryCode",
    "shippingCodeBorder",
    "shippingCodeDomestic",
    "finance1",
    "finance2",
    "declarantCity",
    "declarantDate",
    "declarant",
    "jobTitle",
    "edocNormal",
    "representative1",
    "representative2",
    "representativeOrgNo",
    "invoiceType",
    "invoiceNo",
    "discount",
    "freightCharges",
    "insuranceCharges",
    "otherCharges",
    "exportLicenseNo",
    "exportDeclaration1",
    "exportDeclaration2",
    "generalNote1",
    "generalNote2",
    "generalNote3",
    "generalNote4",
    "currencyCode",
    "importExportType",
    "invoiceDeclaration1",
    "invoiceDeclaration2",
    "importLicenseNo",
    "certificate",
    "explanation",
    "termCode",
    "termLocation",
    "movementReferenceNo",
    "lines"
})
public class CustomsDeclaration {

    /**
     * 
     */
    @JsonProperty("sender")
    private Sender_ sender;
    /**
     * 
     */
    @JsonProperty("receiver")
    private Receiver_ receiver;
    @JsonProperty("printSet")
    private List<String> printSet = new ArrayList<String>();
    @JsonProperty("parcelCount")
    private Integer parcelCount;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("sourceCountryCode")
    private String sourceCountryCode;
    @JsonProperty("destinationCountryCode")
    private String destinationCountryCode;
    @JsonProperty("shippingCodeBorder")
    private String shippingCodeBorder;
    @JsonProperty("shippingCodeDomestic")
    private String shippingCodeDomestic;
    @JsonProperty("finance1")
    private String finance1;
    @JsonProperty("finance2")
    private String finance2;
    @JsonProperty("declarantCity")
    private String declarantCity;
    @JsonProperty("declarantDate")
    private String declarantDate;
    @JsonProperty("declarant")
    private String declarant;
    @JsonProperty("jobTitle")
    private String jobTitle;
    @JsonProperty("edocNormal")
    private Boolean edocNormal;
    @JsonProperty("representative1")
    private String representative1;
    @JsonProperty("representative2")
    private String representative2;
    @JsonProperty("representativeOrgNo")
    private String representativeOrgNo;
    @JsonProperty("invoiceType")
    private String invoiceType;
    @JsonProperty("invoiceNo")
    private String invoiceNo;
    @JsonProperty("discount")
    private Double discount;
    @JsonProperty("freightCharges")
    private Double freightCharges;
    @JsonProperty("insuranceCharges")
    private Double insuranceCharges;
    @JsonProperty("otherCharges")
    private Double otherCharges;
    @JsonProperty("exportLicenseNo")
    private String exportLicenseNo;
    @JsonProperty("exportDeclaration1")
    private String exportDeclaration1;
    @JsonProperty("exportDeclaration2")
    private String exportDeclaration2;
    @JsonProperty("generalNote1")
    private String generalNote1;
    @JsonProperty("generalNote2")
    private String generalNote2;
    @JsonProperty("generalNote3")
    private String generalNote3;
    @JsonProperty("generalNote4")
    private String generalNote4;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("importExportType")
    private String importExportType;
    @JsonProperty("invoiceDeclaration1")
    private String invoiceDeclaration1;
    @JsonProperty("invoiceDeclaration2")
    private String invoiceDeclaration2;
    @JsonProperty("importLicenseNo")
    private String importLicenseNo;
    @JsonProperty("certificate")
    private String certificate;
    @JsonProperty("explanation")
    private String explanation;
    @JsonProperty("termCode")
    private String termCode;
    @JsonProperty("termLocation")
    private String termLocation;
    @JsonProperty("movementReferenceNo")
    private String movementReferenceNo;
    @JsonProperty("lines")
    private List<Line> lines = new ArrayList<Line>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The sender
     */
    @JsonProperty("sender")
    public Sender_ getSender() {
        return sender;
    }

    /**
     * 
     * @param sender
     *     The sender
     */
    @JsonProperty("sender")
    public void setSender(Sender_ sender) {
        this.sender = sender;
    }

    public CustomsDeclaration withSender(Sender_ sender) {
        this.sender = sender;
        return this;
    }

    /**
     * 
     * @return
     *     The receiver
     */
    @JsonProperty("receiver")
    public Receiver_ getReceiver() {
        return receiver;
    }

    /**
     * 
     * @param receiver
     *     The receiver
     */
    @JsonProperty("receiver")
    public void setReceiver(Receiver_ receiver) {
        this.receiver = receiver;
    }

    public CustomsDeclaration withReceiver(Receiver_ receiver) {
        this.receiver = receiver;
        return this;
    }

    /**
     * 
     * @return
     *     The printSet
     */
    @JsonProperty("printSet")
    public List<String> getPrintSet() {
        return printSet;
    }

    /**
     * 
     * @param printSet
     *     The printSet
     */
    @JsonProperty("printSet")
    public void setPrintSet(List<String> printSet) {
        this.printSet = printSet;
    }

    public CustomsDeclaration withPrintSet(List<String> printSet) {
        this.printSet = printSet;
        return this;
    }

    /**
     * 
     * @return
     *     The parcelCount
     */
    @JsonProperty("parcelCount")
    public Integer getParcelCount() {
        return parcelCount;
    }

    /**
     * 
     * @param parcelCount
     *     The parcelCount
     */
    @JsonProperty("parcelCount")
    public void setParcelCount(Integer parcelCount) {
        this.parcelCount = parcelCount;
    }

    public CustomsDeclaration withParcelCount(Integer parcelCount) {
        this.parcelCount = parcelCount;
        return this;
    }

    /**
     * 
     * @return
     *     The reference
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    /**
     * 
     * @param reference
     *     The reference
     */
    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    public CustomsDeclaration withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceCountryCode
     */
    @JsonProperty("sourceCountryCode")
    public String getSourceCountryCode() {
        return sourceCountryCode;
    }

    /**
     * 
     * @param sourceCountryCode
     *     The sourceCountryCode
     */
    @JsonProperty("sourceCountryCode")
    public void setSourceCountryCode(String sourceCountryCode) {
        this.sourceCountryCode = sourceCountryCode;
    }

    public CustomsDeclaration withSourceCountryCode(String sourceCountryCode) {
        this.sourceCountryCode = sourceCountryCode;
        return this;
    }

    /**
     * 
     * @return
     *     The destinationCountryCode
     */
    @JsonProperty("destinationCountryCode")
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * 
     * @param destinationCountryCode
     *     The destinationCountryCode
     */
    @JsonProperty("destinationCountryCode")
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    public CustomsDeclaration withDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
        return this;
    }

    /**
     * 
     * @return
     *     The shippingCodeBorder
     */
    @JsonProperty("shippingCodeBorder")
    public String getShippingCodeBorder() {
        return shippingCodeBorder;
    }

    /**
     * 
     * @param shippingCodeBorder
     *     The shippingCodeBorder
     */
    @JsonProperty("shippingCodeBorder")
    public void setShippingCodeBorder(String shippingCodeBorder) {
        this.shippingCodeBorder = shippingCodeBorder;
    }

    public CustomsDeclaration withShippingCodeBorder(String shippingCodeBorder) {
        this.shippingCodeBorder = shippingCodeBorder;
        return this;
    }

    /**
     * 
     * @return
     *     The shippingCodeDomestic
     */
    @JsonProperty("shippingCodeDomestic")
    public String getShippingCodeDomestic() {
        return shippingCodeDomestic;
    }

    /**
     * 
     * @param shippingCodeDomestic
     *     The shippingCodeDomestic
     */
    @JsonProperty("shippingCodeDomestic")
    public void setShippingCodeDomestic(String shippingCodeDomestic) {
        this.shippingCodeDomestic = shippingCodeDomestic;
    }

    public CustomsDeclaration withShippingCodeDomestic(String shippingCodeDomestic) {
        this.shippingCodeDomestic = shippingCodeDomestic;
        return this;
    }

    /**
     * 
     * @return
     *     The finance1
     */
    @JsonProperty("finance1")
    public String getFinance1() {
        return finance1;
    }

    /**
     * 
     * @param finance1
     *     The finance1
     */
    @JsonProperty("finance1")
    public void setFinance1(String finance1) {
        this.finance1 = finance1;
    }

    public CustomsDeclaration withFinance1(String finance1) {
        this.finance1 = finance1;
        return this;
    }

    /**
     * 
     * @return
     *     The finance2
     */
    @JsonProperty("finance2")
    public String getFinance2() {
        return finance2;
    }

    /**
     * 
     * @param finance2
     *     The finance2
     */
    @JsonProperty("finance2")
    public void setFinance2(String finance2) {
        this.finance2 = finance2;
    }

    public CustomsDeclaration withFinance2(String finance2) {
        this.finance2 = finance2;
        return this;
    }

    /**
     * 
     * @return
     *     The declarantCity
     */
    @JsonProperty("declarantCity")
    public String getDeclarantCity() {
        return declarantCity;
    }

    /**
     * 
     * @param declarantCity
     *     The declarantCity
     */
    @JsonProperty("declarantCity")
    public void setDeclarantCity(String declarantCity) {
        this.declarantCity = declarantCity;
    }

    public CustomsDeclaration withDeclarantCity(String declarantCity) {
        this.declarantCity = declarantCity;
        return this;
    }

    /**
     * 
     * @return
     *     The declarantDate
     */
    @JsonProperty("declarantDate")
    public String getDeclarantDate() {
        return declarantDate;
    }

    /**
     * 
     * @param declarantDate
     *     The declarantDate
     */
    @JsonProperty("declarantDate")
    public void setDeclarantDate(String declarantDate) {
        this.declarantDate = declarantDate;
    }

    public CustomsDeclaration withDeclarantDate(String declarantDate) {
        this.declarantDate = declarantDate;
        return this;
    }

    /**
     * 
     * @return
     *     The declarant
     */
    @JsonProperty("declarant")
    public String getDeclarant() {
        return declarant;
    }

    /**
     * 
     * @param declarant
     *     The declarant
     */
    @JsonProperty("declarant")
    public void setDeclarant(String declarant) {
        this.declarant = declarant;
    }

    public CustomsDeclaration withDeclarant(String declarant) {
        this.declarant = declarant;
        return this;
    }

    /**
     * 
     * @return
     *     The jobTitle
     */
    @JsonProperty("jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * 
     * @param jobTitle
     *     The jobTitle
     */
    @JsonProperty("jobTitle")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public CustomsDeclaration withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * 
     * @return
     *     The edocNormal
     */
    @JsonProperty("edocNormal")
    public Boolean getEdocNormal() {
        return edocNormal;
    }

    /**
     * 
     * @param edocNormal
     *     The edocNormal
     */
    @JsonProperty("edocNormal")
    public void setEdocNormal(Boolean edocNormal) {
        this.edocNormal = edocNormal;
    }

    public CustomsDeclaration withEdocNormal(Boolean edocNormal) {
        this.edocNormal = edocNormal;
        return this;
    }

    /**
     * 
     * @return
     *     The representative1
     */
    @JsonProperty("representative1")
    public String getRepresentative1() {
        return representative1;
    }

    /**
     * 
     * @param representative1
     *     The representative1
     */
    @JsonProperty("representative1")
    public void setRepresentative1(String representative1) {
        this.representative1 = representative1;
    }

    public CustomsDeclaration withRepresentative1(String representative1) {
        this.representative1 = representative1;
        return this;
    }

    /**
     * 
     * @return
     *     The representative2
     */
    @JsonProperty("representative2")
    public String getRepresentative2() {
        return representative2;
    }

    /**
     * 
     * @param representative2
     *     The representative2
     */
    @JsonProperty("representative2")
    public void setRepresentative2(String representative2) {
        this.representative2 = representative2;
    }

    public CustomsDeclaration withRepresentative2(String representative2) {
        this.representative2 = representative2;
        return this;
    }

    /**
     * 
     * @return
     *     The representativeOrgNo
     */
    @JsonProperty("representativeOrgNo")
    public String getRepresentativeOrgNo() {
        return representativeOrgNo;
    }

    /**
     * 
     * @param representativeOrgNo
     *     The representativeOrgNo
     */
    @JsonProperty("representativeOrgNo")
    public void setRepresentativeOrgNo(String representativeOrgNo) {
        this.representativeOrgNo = representativeOrgNo;
    }

    public CustomsDeclaration withRepresentativeOrgNo(String representativeOrgNo) {
        this.representativeOrgNo = representativeOrgNo;
        return this;
    }

    /**
     * 
     * @return
     *     The invoiceType
     */
    @JsonProperty("invoiceType")
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * 
     * @param invoiceType
     *     The invoiceType
     */
    @JsonProperty("invoiceType")
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public CustomsDeclaration withInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    /**
     * 
     * @return
     *     The invoiceNo
     */
    @JsonProperty("invoiceNo")
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * 
     * @param invoiceNo
     *     The invoiceNo
     */
    @JsonProperty("invoiceNo")
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public CustomsDeclaration withInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
        return this;
    }

    /**
     * 
     * @return
     *     The discount
     */
    @JsonProperty("discount")
    public Double getDiscount() {
        return discount;
    }

    /**
     * 
     * @param discount
     *     The discount
     */
    @JsonProperty("discount")
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public CustomsDeclaration withDiscount(Double discount) {
        this.discount = discount;
        return this;
    }

    /**
     * 
     * @return
     *     The freightCharges
     */
    @JsonProperty("freightCharges")
    public Double getFreightCharges() {
        return freightCharges;
    }

    /**
     * 
     * @param freightCharges
     *     The freightCharges
     */
    @JsonProperty("freightCharges")
    public void setFreightCharges(Double freightCharges) {
        this.freightCharges = freightCharges;
    }

    public CustomsDeclaration withFreightCharges(Double freightCharges) {
        this.freightCharges = freightCharges;
        return this;
    }

    /**
     * 
     * @return
     *     The insuranceCharges
     */
    @JsonProperty("insuranceCharges")
    public Double getInsuranceCharges() {
        return insuranceCharges;
    }

    /**
     * 
     * @param insuranceCharges
     *     The insuranceCharges
     */
    @JsonProperty("insuranceCharges")
    public void setInsuranceCharges(Double insuranceCharges) {
        this.insuranceCharges = insuranceCharges;
    }

    public CustomsDeclaration withInsuranceCharges(Double insuranceCharges) {
        this.insuranceCharges = insuranceCharges;
        return this;
    }

    /**
     * 
     * @return
     *     The otherCharges
     */
    @JsonProperty("otherCharges")
    public Double getOtherCharges() {
        return otherCharges;
    }

    /**
     * 
     * @param otherCharges
     *     The otherCharges
     */
    @JsonProperty("otherCharges")
    public void setOtherCharges(Double otherCharges) {
        this.otherCharges = otherCharges;
    }

    public CustomsDeclaration withOtherCharges(Double otherCharges) {
        this.otherCharges = otherCharges;
        return this;
    }

    /**
     * 
     * @return
     *     The exportLicenseNo
     */
    @JsonProperty("exportLicenseNo")
    public String getExportLicenseNo() {
        return exportLicenseNo;
    }

    /**
     * 
     * @param exportLicenseNo
     *     The exportLicenseNo
     */
    @JsonProperty("exportLicenseNo")
    public void setExportLicenseNo(String exportLicenseNo) {
        this.exportLicenseNo = exportLicenseNo;
    }

    public CustomsDeclaration withExportLicenseNo(String exportLicenseNo) {
        this.exportLicenseNo = exportLicenseNo;
        return this;
    }

    /**
     * 
     * @return
     *     The exportDeclaration1
     */
    @JsonProperty("exportDeclaration1")
    public String getExportDeclaration1() {
        return exportDeclaration1;
    }

    /**
     * 
     * @param exportDeclaration1
     *     The exportDeclaration1
     */
    @JsonProperty("exportDeclaration1")
    public void setExportDeclaration1(String exportDeclaration1) {
        this.exportDeclaration1 = exportDeclaration1;
    }

    public CustomsDeclaration withExportDeclaration1(String exportDeclaration1) {
        this.exportDeclaration1 = exportDeclaration1;
        return this;
    }

    /**
     * 
     * @return
     *     The exportDeclaration2
     */
    @JsonProperty("exportDeclaration2")
    public String getExportDeclaration2() {
        return exportDeclaration2;
    }

    /**
     * 
     * @param exportDeclaration2
     *     The exportDeclaration2
     */
    @JsonProperty("exportDeclaration2")
    public void setExportDeclaration2(String exportDeclaration2) {
        this.exportDeclaration2 = exportDeclaration2;
    }

    public CustomsDeclaration withExportDeclaration2(String exportDeclaration2) {
        this.exportDeclaration2 = exportDeclaration2;
        return this;
    }

    /**
     * 
     * @return
     *     The generalNote1
     */
    @JsonProperty("generalNote1")
    public String getGeneralNote1() {
        return generalNote1;
    }

    /**
     * 
     * @param generalNote1
     *     The generalNote1
     */
    @JsonProperty("generalNote1")
    public void setGeneralNote1(String generalNote1) {
        this.generalNote1 = generalNote1;
    }

    public CustomsDeclaration withGeneralNote1(String generalNote1) {
        this.generalNote1 = generalNote1;
        return this;
    }

    /**
     * 
     * @return
     *     The generalNote2
     */
    @JsonProperty("generalNote2")
    public String getGeneralNote2() {
        return generalNote2;
    }

    /**
     * 
     * @param generalNote2
     *     The generalNote2
     */
    @JsonProperty("generalNote2")
    public void setGeneralNote2(String generalNote2) {
        this.generalNote2 = generalNote2;
    }

    public CustomsDeclaration withGeneralNote2(String generalNote2) {
        this.generalNote2 = generalNote2;
        return this;
    }

    /**
     * 
     * @return
     *     The generalNote3
     */
    @JsonProperty("generalNote3")
    public String getGeneralNote3() {
        return generalNote3;
    }

    /**
     * 
     * @param generalNote3
     *     The generalNote3
     */
    @JsonProperty("generalNote3")
    public void setGeneralNote3(String generalNote3) {
        this.generalNote3 = generalNote3;
    }

    public CustomsDeclaration withGeneralNote3(String generalNote3) {
        this.generalNote3 = generalNote3;
        return this;
    }

    /**
     * 
     * @return
     *     The generalNote4
     */
    @JsonProperty("generalNote4")
    public String getGeneralNote4() {
        return generalNote4;
    }

    /**
     * 
     * @param generalNote4
     *     The generalNote4
     */
    @JsonProperty("generalNote4")
    public void setGeneralNote4(String generalNote4) {
        this.generalNote4 = generalNote4;
    }

    public CustomsDeclaration withGeneralNote4(String generalNote4) {
        this.generalNote4 = generalNote4;
        return this;
    }

    /**
     * 
     * @return
     *     The currencyCode
     */
    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 
     * @param currencyCode
     *     The currencyCode
     */
    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public CustomsDeclaration withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * 
     * @return
     *     The importExportType
     */
    @JsonProperty("importExportType")
    public String getImportExportType() {
        return importExportType;
    }

    /**
     * 
     * @param importExportType
     *     The importExportType
     */
    @JsonProperty("importExportType")
    public void setImportExportType(String importExportType) {
        this.importExportType = importExportType;
    }

    public CustomsDeclaration withImportExportType(String importExportType) {
        this.importExportType = importExportType;
        return this;
    }

    /**
     * 
     * @return
     *     The invoiceDeclaration1
     */
    @JsonProperty("invoiceDeclaration1")
    public String getInvoiceDeclaration1() {
        return invoiceDeclaration1;
    }

    /**
     * 
     * @param invoiceDeclaration1
     *     The invoiceDeclaration1
     */
    @JsonProperty("invoiceDeclaration1")
    public void setInvoiceDeclaration1(String invoiceDeclaration1) {
        this.invoiceDeclaration1 = invoiceDeclaration1;
    }

    public CustomsDeclaration withInvoiceDeclaration1(String invoiceDeclaration1) {
        this.invoiceDeclaration1 = invoiceDeclaration1;
        return this;
    }

    /**
     * 
     * @return
     *     The invoiceDeclaration2
     */
    @JsonProperty("invoiceDeclaration2")
    public String getInvoiceDeclaration2() {
        return invoiceDeclaration2;
    }

    /**
     * 
     * @param invoiceDeclaration2
     *     The invoiceDeclaration2
     */
    @JsonProperty("invoiceDeclaration2")
    public void setInvoiceDeclaration2(String invoiceDeclaration2) {
        this.invoiceDeclaration2 = invoiceDeclaration2;
    }

    public CustomsDeclaration withInvoiceDeclaration2(String invoiceDeclaration2) {
        this.invoiceDeclaration2 = invoiceDeclaration2;
        return this;
    }

    /**
     * 
     * @return
     *     The importLicenseNo
     */
    @JsonProperty("importLicenseNo")
    public String getImportLicenseNo() {
        return importLicenseNo;
    }

    /**
     * 
     * @param importLicenseNo
     *     The importLicenseNo
     */
    @JsonProperty("importLicenseNo")
    public void setImportLicenseNo(String importLicenseNo) {
        this.importLicenseNo = importLicenseNo;
    }

    public CustomsDeclaration withImportLicenseNo(String importLicenseNo) {
        this.importLicenseNo = importLicenseNo;
        return this;
    }

    /**
     * 
     * @return
     *     The certificate
     */
    @JsonProperty("certificate")
    public String getCertificate() {
        return certificate;
    }

    /**
     * 
     * @param certificate
     *     The certificate
     */
    @JsonProperty("certificate")
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public CustomsDeclaration withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 
     * @return
     *     The explanation
     */
    @JsonProperty("explanation")
    public String getExplanation() {
        return explanation;
    }

    /**
     * 
     * @param explanation
     *     The explanation
     */
    @JsonProperty("explanation")
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public CustomsDeclaration withExplanation(String explanation) {
        this.explanation = explanation;
        return this;
    }

    /**
     * 
     * @return
     *     The termCode
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * 
     * @param termCode
     *     The termCode
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public CustomsDeclaration withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    /**
     * 
     * @return
     *     The termLocation
     */
    @JsonProperty("termLocation")
    public String getTermLocation() {
        return termLocation;
    }

    /**
     * 
     * @param termLocation
     *     The termLocation
     */
    @JsonProperty("termLocation")
    public void setTermLocation(String termLocation) {
        this.termLocation = termLocation;
    }

    public CustomsDeclaration withTermLocation(String termLocation) {
        this.termLocation = termLocation;
        return this;
    }

    /**
     * 
     * @return
     *     The movementReferenceNo
     */
    @JsonProperty("movementReferenceNo")
    public String getMovementReferenceNo() {
        return movementReferenceNo;
    }

    /**
     * 
     * @param movementReferenceNo
     *     The movementReferenceNo
     */
    @JsonProperty("movementReferenceNo")
    public void setMovementReferenceNo(String movementReferenceNo) {
        this.movementReferenceNo = movementReferenceNo;
    }

    public CustomsDeclaration withMovementReferenceNo(String movementReferenceNo) {
        this.movementReferenceNo = movementReferenceNo;
        return this;
    }

    /**
     * 
     * @return
     *     The lines
     */
    @JsonProperty("lines")
    public List<Line> getLines() {
        return lines;
    }

    /**
     * 
     * @param lines
     *     The lines
     */
    @JsonProperty("lines")
    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    public CustomsDeclaration withLines(List<Line> lines) {
        this.lines = lines;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CustomsDeclaration withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
