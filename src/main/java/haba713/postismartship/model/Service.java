
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
    "id",
    "subId",
    "normalShipment",
    "returnShipment",
    "referenceAsBarcode",
    "nonDeliveryType",
    "valueAmount",
    "valueCurrencyCode",
    "paymentMethodType",
    "sortPos",
    "destinationLocation",
    "notifyCode1",
    "notifyCode2",
    "notifyCode3",
    "bookingId",
    "bookingOffice",
    "infoCode",
    "contractVersion",
    "terminal",
    "handOverCode",
    "externalIdentifier",
    "waybillInvoice",
    "waybillEurCertificate",
    "waybillExportNotification",
    "waybillUnits332",
    "waybillWeight332",
    "waybillUnits334",
    "waybillWeight334",
    "waybillUnits336",
    "waybillWeight336",
    "waybillUnits342",
    "waybillWeight342",
    "waybillCod",
    "waybillCod342",
    "waybillHomeDelivery342",
    "shipperLoadAndCount",
    "pickupBooking",
    "pickupDate",
    "pickupTimeFrom",
    "pickupTimeTo",
    "pickupText1",
    "pickupMisc",
    "addons"
})
public class Service {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("subId")
    private String subId;
    @JsonProperty("normalShipment")
    private Boolean normalShipment;
    @JsonProperty("returnShipment")
    private Boolean returnShipment;
    @JsonProperty("referenceAsBarcode")
    private Boolean referenceAsBarcode;
    @JsonProperty("nonDeliveryType")
    private String nonDeliveryType;
    @JsonProperty("valueAmount")
    private String valueAmount;
    @JsonProperty("valueCurrencyCode")
    private String valueCurrencyCode;
    @JsonProperty("paymentMethodType")
    private String paymentMethodType;
    @JsonProperty("sortPos")
    private String sortPos;
    @JsonProperty("destinationLocation")
    private String destinationLocation;
    @JsonProperty("notifyCode1")
    private String notifyCode1;
    @JsonProperty("notifyCode2")
    private String notifyCode2;
    @JsonProperty("notifyCode3")
    private String notifyCode3;
    @JsonProperty("bookingId")
    private String bookingId;
    @JsonProperty("bookingOffice")
    private String bookingOffice;
    @JsonProperty("infoCode")
    private String infoCode;
    @JsonProperty("contractVersion")
    private String contractVersion;
    @JsonProperty("terminal")
    private String terminal;
    @JsonProperty("handOverCode")
    private String handOverCode;
    @JsonProperty("externalIdentifier")
    private String externalIdentifier;
    @JsonProperty("waybillInvoice")
    private Integer waybillInvoice;
    @JsonProperty("waybillEurCertificate")
    private Integer waybillEurCertificate;
    @JsonProperty("waybillExportNotification")
    private Integer waybillExportNotification;
    @JsonProperty("waybillUnits332")
    private Integer waybillUnits332;
    @JsonProperty("waybillWeight332")
    private Double waybillWeight332;
    @JsonProperty("waybillUnits334")
    private Integer waybillUnits334;
    @JsonProperty("waybillWeight334")
    private Double waybillWeight334;
    @JsonProperty("waybillUnits336")
    private Integer waybillUnits336;
    @JsonProperty("waybillWeight336")
    private Double waybillWeight336;
    @JsonProperty("waybillUnits342")
    private Integer waybillUnits342;
    @JsonProperty("waybillWeight342")
    private Double waybillWeight342;
    @JsonProperty("waybillCod")
    private Integer waybillCod;
    @JsonProperty("waybillCod342")
    private Integer waybillCod342;
    @JsonProperty("waybillHomeDelivery342")
    private Integer waybillHomeDelivery342;
    @JsonProperty("shipperLoadAndCount")
    private Integer shipperLoadAndCount;
    @JsonProperty("pickupBooking")
    private Boolean pickupBooking;
    @JsonProperty("pickupDate")
    private String pickupDate;
    @JsonProperty("pickupTimeFrom")
    private String pickupTimeFrom;
    @JsonProperty("pickupTimeTo")
    private String pickupTimeTo;
    @JsonProperty("pickupText1")
    private String pickupText1;
    @JsonProperty("pickupMisc")
    private String pickupMisc;
    @JsonProperty("addons")
    private List<Addon> addons = new ArrayList<Addon>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Service withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The subId
     */
    @JsonProperty("subId")
    public String getSubId() {
        return subId;
    }

    /**
     * 
     * @param subId
     *     The subId
     */
    @JsonProperty("subId")
    public void setSubId(String subId) {
        this.subId = subId;
    }

    public Service withSubId(String subId) {
        this.subId = subId;
        return this;
    }

    /**
     * 
     * @return
     *     The normalShipment
     */
    @JsonProperty("normalShipment")
    public Boolean getNormalShipment() {
        return normalShipment;
    }

    /**
     * 
     * @param normalShipment
     *     The normalShipment
     */
    @JsonProperty("normalShipment")
    public void setNormalShipment(Boolean normalShipment) {
        this.normalShipment = normalShipment;
    }

    public Service withNormalShipment(Boolean normalShipment) {
        this.normalShipment = normalShipment;
        return this;
    }

    /**
     * 
     * @return
     *     The returnShipment
     */
    @JsonProperty("returnShipment")
    public Boolean getReturnShipment() {
        return returnShipment;
    }

    /**
     * 
     * @param returnShipment
     *     The returnShipment
     */
    @JsonProperty("returnShipment")
    public void setReturnShipment(Boolean returnShipment) {
        this.returnShipment = returnShipment;
    }

    public Service withReturnShipment(Boolean returnShipment) {
        this.returnShipment = returnShipment;
        return this;
    }

    /**
     * 
     * @return
     *     The referenceAsBarcode
     */
    @JsonProperty("referenceAsBarcode")
    public Boolean getReferenceAsBarcode() {
        return referenceAsBarcode;
    }

    /**
     * 
     * @param referenceAsBarcode
     *     The referenceAsBarcode
     */
    @JsonProperty("referenceAsBarcode")
    public void setReferenceAsBarcode(Boolean referenceAsBarcode) {
        this.referenceAsBarcode = referenceAsBarcode;
    }

    public Service withReferenceAsBarcode(Boolean referenceAsBarcode) {
        this.referenceAsBarcode = referenceAsBarcode;
        return this;
    }

    /**
     * 
     * @return
     *     The nonDeliveryType
     */
    @JsonProperty("nonDeliveryType")
    public String getNonDeliveryType() {
        return nonDeliveryType;
    }

    /**
     * 
     * @param nonDeliveryType
     *     The nonDeliveryType
     */
    @JsonProperty("nonDeliveryType")
    public void setNonDeliveryType(String nonDeliveryType) {
        this.nonDeliveryType = nonDeliveryType;
    }

    public Service withNonDeliveryType(String nonDeliveryType) {
        this.nonDeliveryType = nonDeliveryType;
        return this;
    }

    /**
     * 
     * @return
     *     The valueAmount
     */
    @JsonProperty("valueAmount")
    public String getValueAmount() {
        return valueAmount;
    }

    /**
     * 
     * @param valueAmount
     *     The valueAmount
     */
    @JsonProperty("valueAmount")
    public void setValueAmount(String valueAmount) {
        this.valueAmount = valueAmount;
    }

    public Service withValueAmount(String valueAmount) {
        this.valueAmount = valueAmount;
        return this;
    }

    /**
     * 
     * @return
     *     The valueCurrencyCode
     */
    @JsonProperty("valueCurrencyCode")
    public String getValueCurrencyCode() {
        return valueCurrencyCode;
    }

    /**
     * 
     * @param valueCurrencyCode
     *     The valueCurrencyCode
     */
    @JsonProperty("valueCurrencyCode")
    public void setValueCurrencyCode(String valueCurrencyCode) {
        this.valueCurrencyCode = valueCurrencyCode;
    }

    public Service withValueCurrencyCode(String valueCurrencyCode) {
        this.valueCurrencyCode = valueCurrencyCode;
        return this;
    }

    /**
     * 
     * @return
     *     The paymentMethodType
     */
    @JsonProperty("paymentMethodType")
    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    /**
     * 
     * @param paymentMethodType
     *     The paymentMethodType
     */
    @JsonProperty("paymentMethodType")
    public void setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public Service withPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
        return this;
    }

    /**
     * 
     * @return
     *     The sortPos
     */
    @JsonProperty("sortPos")
    public String getSortPos() {
        return sortPos;
    }

    /**
     * 
     * @param sortPos
     *     The sortPos
     */
    @JsonProperty("sortPos")
    public void setSortPos(String sortPos) {
        this.sortPos = sortPos;
    }

    public Service withSortPos(String sortPos) {
        this.sortPos = sortPos;
        return this;
    }

    /**
     * 
     * @return
     *     The destinationLocation
     */
    @JsonProperty("destinationLocation")
    public String getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * 
     * @param destinationLocation
     *     The destinationLocation
     */
    @JsonProperty("destinationLocation")
    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public Service withDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
        return this;
    }

    /**
     * 
     * @return
     *     The notifyCode1
     */
    @JsonProperty("notifyCode1")
    public String getNotifyCode1() {
        return notifyCode1;
    }

    /**
     * 
     * @param notifyCode1
     *     The notifyCode1
     */
    @JsonProperty("notifyCode1")
    public void setNotifyCode1(String notifyCode1) {
        this.notifyCode1 = notifyCode1;
    }

    public Service withNotifyCode1(String notifyCode1) {
        this.notifyCode1 = notifyCode1;
        return this;
    }

    /**
     * 
     * @return
     *     The notifyCode2
     */
    @JsonProperty("notifyCode2")
    public String getNotifyCode2() {
        return notifyCode2;
    }

    /**
     * 
     * @param notifyCode2
     *     The notifyCode2
     */
    @JsonProperty("notifyCode2")
    public void setNotifyCode2(String notifyCode2) {
        this.notifyCode2 = notifyCode2;
    }

    public Service withNotifyCode2(String notifyCode2) {
        this.notifyCode2 = notifyCode2;
        return this;
    }

    /**
     * 
     * @return
     *     The notifyCode3
     */
    @JsonProperty("notifyCode3")
    public String getNotifyCode3() {
        return notifyCode3;
    }

    /**
     * 
     * @param notifyCode3
     *     The notifyCode3
     */
    @JsonProperty("notifyCode3")
    public void setNotifyCode3(String notifyCode3) {
        this.notifyCode3 = notifyCode3;
    }

    public Service withNotifyCode3(String notifyCode3) {
        this.notifyCode3 = notifyCode3;
        return this;
    }

    /**
     * 
     * @return
     *     The bookingId
     */
    @JsonProperty("bookingId")
    public String getBookingId() {
        return bookingId;
    }

    /**
     * 
     * @param bookingId
     *     The bookingId
     */
    @JsonProperty("bookingId")
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Service withBookingId(String bookingId) {
        this.bookingId = bookingId;
        return this;
    }

    /**
     * 
     * @return
     *     The bookingOffice
     */
    @JsonProperty("bookingOffice")
    public String getBookingOffice() {
        return bookingOffice;
    }

    /**
     * 
     * @param bookingOffice
     *     The bookingOffice
     */
    @JsonProperty("bookingOffice")
    public void setBookingOffice(String bookingOffice) {
        this.bookingOffice = bookingOffice;
    }

    public Service withBookingOffice(String bookingOffice) {
        this.bookingOffice = bookingOffice;
        return this;
    }

    /**
     * 
     * @return
     *     The infoCode
     */
    @JsonProperty("infoCode")
    public String getInfoCode() {
        return infoCode;
    }

    /**
     * 
     * @param infoCode
     *     The infoCode
     */
    @JsonProperty("infoCode")
    public void setInfoCode(String infoCode) {
        this.infoCode = infoCode;
    }

    public Service withInfoCode(String infoCode) {
        this.infoCode = infoCode;
        return this;
    }

    /**
     * 
     * @return
     *     The contractVersion
     */
    @JsonProperty("contractVersion")
    public String getContractVersion() {
        return contractVersion;
    }

    /**
     * 
     * @param contractVersion
     *     The contractVersion
     */
    @JsonProperty("contractVersion")
    public void setContractVersion(String contractVersion) {
        this.contractVersion = contractVersion;
    }

    public Service withContractVersion(String contractVersion) {
        this.contractVersion = contractVersion;
        return this;
    }

    /**
     * 
     * @return
     *     The terminal
     */
    @JsonProperty("terminal")
    public String getTerminal() {
        return terminal;
    }

    /**
     * 
     * @param terminal
     *     The terminal
     */
    @JsonProperty("terminal")
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public Service withTerminal(String terminal) {
        this.terminal = terminal;
        return this;
    }

    /**
     * 
     * @return
     *     The handOverCode
     */
    @JsonProperty("handOverCode")
    public String getHandOverCode() {
        return handOverCode;
    }

    /**
     * 
     * @param handOverCode
     *     The handOverCode
     */
    @JsonProperty("handOverCode")
    public void setHandOverCode(String handOverCode) {
        this.handOverCode = handOverCode;
    }

    public Service withHandOverCode(String handOverCode) {
        this.handOverCode = handOverCode;
        return this;
    }

    /**
     * 
     * @return
     *     The externalIdentifier
     */
    @JsonProperty("externalIdentifier")
    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    /**
     * 
     * @param externalIdentifier
     *     The externalIdentifier
     */
    @JsonProperty("externalIdentifier")
    public void setExternalIdentifier(String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }

    public Service withExternalIdentifier(String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillInvoice
     */
    @JsonProperty("waybillInvoice")
    public Integer getWaybillInvoice() {
        return waybillInvoice;
    }

    /**
     * 
     * @param waybillInvoice
     *     The waybillInvoice
     */
    @JsonProperty("waybillInvoice")
    public void setWaybillInvoice(Integer waybillInvoice) {
        this.waybillInvoice = waybillInvoice;
    }

    public Service withWaybillInvoice(Integer waybillInvoice) {
        this.waybillInvoice = waybillInvoice;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillEurCertificate
     */
    @JsonProperty("waybillEurCertificate")
    public Integer getWaybillEurCertificate() {
        return waybillEurCertificate;
    }

    /**
     * 
     * @param waybillEurCertificate
     *     The waybillEurCertificate
     */
    @JsonProperty("waybillEurCertificate")
    public void setWaybillEurCertificate(Integer waybillEurCertificate) {
        this.waybillEurCertificate = waybillEurCertificate;
    }

    public Service withWaybillEurCertificate(Integer waybillEurCertificate) {
        this.waybillEurCertificate = waybillEurCertificate;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillExportNotification
     */
    @JsonProperty("waybillExportNotification")
    public Integer getWaybillExportNotification() {
        return waybillExportNotification;
    }

    /**
     * 
     * @param waybillExportNotification
     *     The waybillExportNotification
     */
    @JsonProperty("waybillExportNotification")
    public void setWaybillExportNotification(Integer waybillExportNotification) {
        this.waybillExportNotification = waybillExportNotification;
    }

    public Service withWaybillExportNotification(Integer waybillExportNotification) {
        this.waybillExportNotification = waybillExportNotification;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillUnits332
     */
    @JsonProperty("waybillUnits332")
    public Integer getWaybillUnits332() {
        return waybillUnits332;
    }

    /**
     * 
     * @param waybillUnits332
     *     The waybillUnits332
     */
    @JsonProperty("waybillUnits332")
    public void setWaybillUnits332(Integer waybillUnits332) {
        this.waybillUnits332 = waybillUnits332;
    }

    public Service withWaybillUnits332(Integer waybillUnits332) {
        this.waybillUnits332 = waybillUnits332;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillWeight332
     */
    @JsonProperty("waybillWeight332")
    public Double getWaybillWeight332() {
        return waybillWeight332;
    }

    /**
     * 
     * @param waybillWeight332
     *     The waybillWeight332
     */
    @JsonProperty("waybillWeight332")
    public void setWaybillWeight332(Double waybillWeight332) {
        this.waybillWeight332 = waybillWeight332;
    }

    public Service withWaybillWeight332(Double waybillWeight332) {
        this.waybillWeight332 = waybillWeight332;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillUnits334
     */
    @JsonProperty("waybillUnits334")
    public Integer getWaybillUnits334() {
        return waybillUnits334;
    }

    /**
     * 
     * @param waybillUnits334
     *     The waybillUnits334
     */
    @JsonProperty("waybillUnits334")
    public void setWaybillUnits334(Integer waybillUnits334) {
        this.waybillUnits334 = waybillUnits334;
    }

    public Service withWaybillUnits334(Integer waybillUnits334) {
        this.waybillUnits334 = waybillUnits334;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillWeight334
     */
    @JsonProperty("waybillWeight334")
    public Double getWaybillWeight334() {
        return waybillWeight334;
    }

    /**
     * 
     * @param waybillWeight334
     *     The waybillWeight334
     */
    @JsonProperty("waybillWeight334")
    public void setWaybillWeight334(Double waybillWeight334) {
        this.waybillWeight334 = waybillWeight334;
    }

    public Service withWaybillWeight334(Double waybillWeight334) {
        this.waybillWeight334 = waybillWeight334;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillUnits336
     */
    @JsonProperty("waybillUnits336")
    public Integer getWaybillUnits336() {
        return waybillUnits336;
    }

    /**
     * 
     * @param waybillUnits336
     *     The waybillUnits336
     */
    @JsonProperty("waybillUnits336")
    public void setWaybillUnits336(Integer waybillUnits336) {
        this.waybillUnits336 = waybillUnits336;
    }

    public Service withWaybillUnits336(Integer waybillUnits336) {
        this.waybillUnits336 = waybillUnits336;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillWeight336
     */
    @JsonProperty("waybillWeight336")
    public Double getWaybillWeight336() {
        return waybillWeight336;
    }

    /**
     * 
     * @param waybillWeight336
     *     The waybillWeight336
     */
    @JsonProperty("waybillWeight336")
    public void setWaybillWeight336(Double waybillWeight336) {
        this.waybillWeight336 = waybillWeight336;
    }

    public Service withWaybillWeight336(Double waybillWeight336) {
        this.waybillWeight336 = waybillWeight336;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillUnits342
     */
    @JsonProperty("waybillUnits342")
    public Integer getWaybillUnits342() {
        return waybillUnits342;
    }

    /**
     * 
     * @param waybillUnits342
     *     The waybillUnits342
     */
    @JsonProperty("waybillUnits342")
    public void setWaybillUnits342(Integer waybillUnits342) {
        this.waybillUnits342 = waybillUnits342;
    }

    public Service withWaybillUnits342(Integer waybillUnits342) {
        this.waybillUnits342 = waybillUnits342;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillWeight342
     */
    @JsonProperty("waybillWeight342")
    public Double getWaybillWeight342() {
        return waybillWeight342;
    }

    /**
     * 
     * @param waybillWeight342
     *     The waybillWeight342
     */
    @JsonProperty("waybillWeight342")
    public void setWaybillWeight342(Double waybillWeight342) {
        this.waybillWeight342 = waybillWeight342;
    }

    public Service withWaybillWeight342(Double waybillWeight342) {
        this.waybillWeight342 = waybillWeight342;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillCod
     */
    @JsonProperty("waybillCod")
    public Integer getWaybillCod() {
        return waybillCod;
    }

    /**
     * 
     * @param waybillCod
     *     The waybillCod
     */
    @JsonProperty("waybillCod")
    public void setWaybillCod(Integer waybillCod) {
        this.waybillCod = waybillCod;
    }

    public Service withWaybillCod(Integer waybillCod) {
        this.waybillCod = waybillCod;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillCod342
     */
    @JsonProperty("waybillCod342")
    public Integer getWaybillCod342() {
        return waybillCod342;
    }

    /**
     * 
     * @param waybillCod342
     *     The waybillCod342
     */
    @JsonProperty("waybillCod342")
    public void setWaybillCod342(Integer waybillCod342) {
        this.waybillCod342 = waybillCod342;
    }

    public Service withWaybillCod342(Integer waybillCod342) {
        this.waybillCod342 = waybillCod342;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillHomeDelivery342
     */
    @JsonProperty("waybillHomeDelivery342")
    public Integer getWaybillHomeDelivery342() {
        return waybillHomeDelivery342;
    }

    /**
     * 
     * @param waybillHomeDelivery342
     *     The waybillHomeDelivery342
     */
    @JsonProperty("waybillHomeDelivery342")
    public void setWaybillHomeDelivery342(Integer waybillHomeDelivery342) {
        this.waybillHomeDelivery342 = waybillHomeDelivery342;
    }

    public Service withWaybillHomeDelivery342(Integer waybillHomeDelivery342) {
        this.waybillHomeDelivery342 = waybillHomeDelivery342;
        return this;
    }

    /**
     * 
     * @return
     *     The shipperLoadAndCount
     */
    @JsonProperty("shipperLoadAndCount")
    public Integer getShipperLoadAndCount() {
        return shipperLoadAndCount;
    }

    /**
     * 
     * @param shipperLoadAndCount
     *     The shipperLoadAndCount
     */
    @JsonProperty("shipperLoadAndCount")
    public void setShipperLoadAndCount(Integer shipperLoadAndCount) {
        this.shipperLoadAndCount = shipperLoadAndCount;
    }

    public Service withShipperLoadAndCount(Integer shipperLoadAndCount) {
        this.shipperLoadAndCount = shipperLoadAndCount;
        return this;
    }

    /**
     * 
     * @return
     *     The pickupBooking
     */
    @JsonProperty("pickupBooking")
    public Boolean getPickupBooking() {
        return pickupBooking;
    }

    /**
     * 
     * @param pickupBooking
     *     The pickupBooking
     */
    @JsonProperty("pickupBooking")
    public void setPickupBooking(Boolean pickupBooking) {
        this.pickupBooking = pickupBooking;
    }

    public Service withPickupBooking(Boolean pickupBooking) {
        this.pickupBooking = pickupBooking;
        return this;
    }

    /**
     * 
     * @return
     *     The pickupDate
     */
    @JsonProperty("pickupDate")
    public String getPickupDate() {
        return pickupDate;
    }

    /**
     * 
     * @param pickupDate
     *     The pickupDate
     */
    @JsonProperty("pickupDate")
    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Service withPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
        return this;
    }

    /**
     * 
     * @return
     *     The pickupTimeFrom
     */
    @JsonProperty("pickupTimeFrom")
    public String getPickupTimeFrom() {
        return pickupTimeFrom;
    }

    /**
     * 
     * @param pickupTimeFrom
     *     The pickupTimeFrom
     */
    @JsonProperty("pickupTimeFrom")
    public void setPickupTimeFrom(String pickupTimeFrom) {
        this.pickupTimeFrom = pickupTimeFrom;
    }

    public Service withPickupTimeFrom(String pickupTimeFrom) {
        this.pickupTimeFrom = pickupTimeFrom;
        return this;
    }

    /**
     * 
     * @return
     *     The pickupTimeTo
     */
    @JsonProperty("pickupTimeTo")
    public String getPickupTimeTo() {
        return pickupTimeTo;
    }

    /**
     * 
     * @param pickupTimeTo
     *     The pickupTimeTo
     */
    @JsonProperty("pickupTimeTo")
    public void setPickupTimeTo(String pickupTimeTo) {
        this.pickupTimeTo = pickupTimeTo;
    }

    public Service withPickupTimeTo(String pickupTimeTo) {
        this.pickupTimeTo = pickupTimeTo;
        return this;
    }

    /**
     * 
     * @return
     *     The pickupText1
     */
    @JsonProperty("pickupText1")
    public String getPickupText1() {
        return pickupText1;
    }

    /**
     * 
     * @param pickupText1
     *     The pickupText1
     */
    @JsonProperty("pickupText1")
    public void setPickupText1(String pickupText1) {
        this.pickupText1 = pickupText1;
    }

    public Service withPickupText1(String pickupText1) {
        this.pickupText1 = pickupText1;
        return this;
    }

    /**
     * 
     * @return
     *     The pickupMisc
     */
    @JsonProperty("pickupMisc")
    public String getPickupMisc() {
        return pickupMisc;
    }

    /**
     * 
     * @param pickupMisc
     *     The pickupMisc
     */
    @JsonProperty("pickupMisc")
    public void setPickupMisc(String pickupMisc) {
        this.pickupMisc = pickupMisc;
    }

    public Service withPickupMisc(String pickupMisc) {
        this.pickupMisc = pickupMisc;
        return this;
    }

    /**
     * 
     * @return
     *     The addons
     */
    @JsonProperty("addons")
    public List<Addon> getAddons() {
        return addons;
    }

    /**
     * 
     * @param addons
     *     The addons
     */
    @JsonProperty("addons")
    public void setAddons(List<Addon> addons) {
        this.addons = addons;
    }

    public Service withAddons(List<Addon> addons) {
        this.addons = addons;
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

    public Service withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
