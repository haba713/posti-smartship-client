
package haba713.postismartship.model;

import java.util.HashMap;
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
    "agentNo",
    "custNo",
    "custNoIssuerCode",
    "palletRegNo",
    "ediAddress",
    "senderId",
    "bookingId",
    "bookingOffice",
    "bookingEmail",
    "sourceCode",
    "ediUserId",
    "ediPassword",
    "ediKey",
    "externalIdentifier",
    "priceEnquiry",
    "additionalCarrierLabel"
})
public class ReceiverPartner {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("agentNo")
    private String agentNo;
    @JsonProperty("custNo")
    private String custNo;
    @JsonProperty("custNoIssuerCode")
    private String custNoIssuerCode;
    @JsonProperty("palletRegNo")
    private String palletRegNo;
    @JsonProperty("ediAddress")
    private String ediAddress;
    @JsonProperty("senderId")
    private String senderId;
    @JsonProperty("bookingId")
    private String bookingId;
    @JsonProperty("bookingOffice")
    private String bookingOffice;
    @JsonProperty("bookingEmail")
    private String bookingEmail;
    @JsonProperty("sourceCode")
    private String sourceCode;
    @JsonProperty("ediUserId")
    private String ediUserId;
    @JsonProperty("ediPassword")
    private String ediPassword;
    @JsonProperty("ediKey")
    private String ediKey;
    @JsonProperty("externalIdentifier")
    private String externalIdentifier;
    @JsonProperty("priceEnquiry")
    private String priceEnquiry;
    @JsonProperty("additionalCarrierLabel")
    private Boolean additionalCarrierLabel;
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

    public ReceiverPartner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The agentNo
     */
    @JsonProperty("agentNo")
    public String getAgentNo() {
        return agentNo;
    }

    /**
     * 
     * @param agentNo
     *     The agentNo
     */
    @JsonProperty("agentNo")
    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo;
    }

    public ReceiverPartner withAgentNo(String agentNo) {
        this.agentNo = agentNo;
        return this;
    }

    /**
     * 
     * @return
     *     The custNo
     */
    @JsonProperty("custNo")
    public String getCustNo() {
        return custNo;
    }

    /**
     * 
     * @param custNo
     *     The custNo
     */
    @JsonProperty("custNo")
    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public ReceiverPartner withCustNo(String custNo) {
        this.custNo = custNo;
        return this;
    }

    /**
     * 
     * @return
     *     The custNoIssuerCode
     */
    @JsonProperty("custNoIssuerCode")
    public String getCustNoIssuerCode() {
        return custNoIssuerCode;
    }

    /**
     * 
     * @param custNoIssuerCode
     *     The custNoIssuerCode
     */
    @JsonProperty("custNoIssuerCode")
    public void setCustNoIssuerCode(String custNoIssuerCode) {
        this.custNoIssuerCode = custNoIssuerCode;
    }

    public ReceiverPartner withCustNoIssuerCode(String custNoIssuerCode) {
        this.custNoIssuerCode = custNoIssuerCode;
        return this;
    }

    /**
     * 
     * @return
     *     The palletRegNo
     */
    @JsonProperty("palletRegNo")
    public String getPalletRegNo() {
        return palletRegNo;
    }

    /**
     * 
     * @param palletRegNo
     *     The palletRegNo
     */
    @JsonProperty("palletRegNo")
    public void setPalletRegNo(String palletRegNo) {
        this.palletRegNo = palletRegNo;
    }

    public ReceiverPartner withPalletRegNo(String palletRegNo) {
        this.palletRegNo = palletRegNo;
        return this;
    }

    /**
     * 
     * @return
     *     The ediAddress
     */
    @JsonProperty("ediAddress")
    public String getEdiAddress() {
        return ediAddress;
    }

    /**
     * 
     * @param ediAddress
     *     The ediAddress
     */
    @JsonProperty("ediAddress")
    public void setEdiAddress(String ediAddress) {
        this.ediAddress = ediAddress;
    }

    public ReceiverPartner withEdiAddress(String ediAddress) {
        this.ediAddress = ediAddress;
        return this;
    }

    /**
     * 
     * @return
     *     The senderId
     */
    @JsonProperty("senderId")
    public String getSenderId() {
        return senderId;
    }

    /**
     * 
     * @param senderId
     *     The senderId
     */
    @JsonProperty("senderId")
    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public ReceiverPartner withSenderId(String senderId) {
        this.senderId = senderId;
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

    public ReceiverPartner withBookingId(String bookingId) {
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

    public ReceiverPartner withBookingOffice(String bookingOffice) {
        this.bookingOffice = bookingOffice;
        return this;
    }

    /**
     * 
     * @return
     *     The bookingEmail
     */
    @JsonProperty("bookingEmail")
    public String getBookingEmail() {
        return bookingEmail;
    }

    /**
     * 
     * @param bookingEmail
     *     The bookingEmail
     */
    @JsonProperty("bookingEmail")
    public void setBookingEmail(String bookingEmail) {
        this.bookingEmail = bookingEmail;
    }

    public ReceiverPartner withBookingEmail(String bookingEmail) {
        this.bookingEmail = bookingEmail;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceCode
     */
    @JsonProperty("sourceCode")
    public String getSourceCode() {
        return sourceCode;
    }

    /**
     * 
     * @param sourceCode
     *     The sourceCode
     */
    @JsonProperty("sourceCode")
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public ReceiverPartner withSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }

    /**
     * 
     * @return
     *     The ediUserId
     */
    @JsonProperty("ediUserId")
    public String getEdiUserId() {
        return ediUserId;
    }

    /**
     * 
     * @param ediUserId
     *     The ediUserId
     */
    @JsonProperty("ediUserId")
    public void setEdiUserId(String ediUserId) {
        this.ediUserId = ediUserId;
    }

    public ReceiverPartner withEdiUserId(String ediUserId) {
        this.ediUserId = ediUserId;
        return this;
    }

    /**
     * 
     * @return
     *     The ediPassword
     */
    @JsonProperty("ediPassword")
    public String getEdiPassword() {
        return ediPassword;
    }

    /**
     * 
     * @param ediPassword
     *     The ediPassword
     */
    @JsonProperty("ediPassword")
    public void setEdiPassword(String ediPassword) {
        this.ediPassword = ediPassword;
    }

    public ReceiverPartner withEdiPassword(String ediPassword) {
        this.ediPassword = ediPassword;
        return this;
    }

    /**
     * 
     * @return
     *     The ediKey
     */
    @JsonProperty("ediKey")
    public String getEdiKey() {
        return ediKey;
    }

    /**
     * 
     * @param ediKey
     *     The ediKey
     */
    @JsonProperty("ediKey")
    public void setEdiKey(String ediKey) {
        this.ediKey = ediKey;
    }

    public ReceiverPartner withEdiKey(String ediKey) {
        this.ediKey = ediKey;
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

    public ReceiverPartner withExternalIdentifier(String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
        return this;
    }

    /**
     * 
     * @return
     *     The priceEnquiry
     */
    @JsonProperty("priceEnquiry")
    public String getPriceEnquiry() {
        return priceEnquiry;
    }

    /**
     * 
     * @param priceEnquiry
     *     The priceEnquiry
     */
    @JsonProperty("priceEnquiry")
    public void setPriceEnquiry(String priceEnquiry) {
        this.priceEnquiry = priceEnquiry;
    }

    public ReceiverPartner withPriceEnquiry(String priceEnquiry) {
        this.priceEnquiry = priceEnquiry;
        return this;
    }

    /**
     * 
     * @return
     *     The additionalCarrierLabel
     */
    @JsonProperty("additionalCarrierLabel")
    public Boolean getAdditionalCarrierLabel() {
        return additionalCarrierLabel;
    }

    /**
     * 
     * @param additionalCarrierLabel
     *     The additionalCarrierLabel
     */
    @JsonProperty("additionalCarrierLabel")
    public void setAdditionalCarrierLabel(Boolean additionalCarrierLabel) {
        this.additionalCarrierLabel = additionalCarrierLabel;
    }

    public ReceiverPartner withAdditionalCarrierLabel(Boolean additionalCarrierLabel) {
        this.additionalCarrierLabel = additionalCarrierLabel;
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

    public ReceiverPartner withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
