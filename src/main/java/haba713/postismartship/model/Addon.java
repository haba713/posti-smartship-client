
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
    "amount",
    "account",
    "accountType",
    "bank",
    "currencyCode",
    "custNo",
    "custNoIssuerCode",
    "misc",
    "miscType",
    "contact",
    "reference",
    "referenceType",
    "tempMin",
    "tempMax",
    "email",
    "text1",
    "text2",
    "text3",
    "text4",
    "text5",
    "text6",
    "text7",
    "text8",
    "text9",
    "text10",
    "length",
    "width",
    "declarant",
    "passengerFlight",
    "cargoFlight",
    "documentType",
    "date",
    "timeFrom",
    "timeTo",
    "confirmation",
    "confirmationMisc"
})
public class Addon {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("account")
    private String account;
    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("bank")
    private String bank;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("custNo")
    private String custNo;
    @JsonProperty("custNoIssuerCode")
    private String custNoIssuerCode;
    @JsonProperty("misc")
    private String misc;
    @JsonProperty("miscType")
    private String miscType;
    @JsonProperty("contact")
    private String contact;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("referenceType")
    private String referenceType;
    @JsonProperty("tempMin")
    private Double tempMin;
    @JsonProperty("tempMax")
    private Double tempMax;
    @JsonProperty("email")
    private String email;
    @JsonProperty("text1")
    private String text1;
    @JsonProperty("text2")
    private String text2;
    @JsonProperty("text3")
    private String text3;
    @JsonProperty("text4")
    private String text4;
    @JsonProperty("text5")
    private String text5;
    @JsonProperty("text6")
    private String text6;
    @JsonProperty("text7")
    private String text7;
    @JsonProperty("text8")
    private String text8;
    @JsonProperty("text9")
    private String text9;
    @JsonProperty("text10")
    private String text10;
    @JsonProperty("length")
    private Double length;
    @JsonProperty("width")
    private Double width;
    @JsonProperty("declarant")
    private String declarant;
    @JsonProperty("passengerFlight")
    private Boolean passengerFlight;
    @JsonProperty("cargoFlight")
    private Boolean cargoFlight;
    @JsonProperty("documentType")
    private String documentType;
    @JsonProperty("date")
    private String date;
    @JsonProperty("timeFrom")
    private String timeFrom;
    @JsonProperty("timeTo")
    private String timeTo;
    @JsonProperty("confirmation")
    private Boolean confirmation;
    @JsonProperty("confirmationMisc")
    private String confirmationMisc;
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

    public Addon withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The amount
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Addon withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 
     * @return
     *     The account
     */
    @JsonProperty("account")
    public String getAccount() {
        return account;
    }

    /**
     * 
     * @param account
     *     The account
     */
    @JsonProperty("account")
    public void setAccount(String account) {
        this.account = account;
    }

    public Addon withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 
     * @return
     *     The accountType
     */
    @JsonProperty("accountType")
    public String getAccountType() {
        return accountType;
    }

    /**
     * 
     * @param accountType
     *     The accountType
     */
    @JsonProperty("accountType")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Addon withAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * 
     * @return
     *     The bank
     */
    @JsonProperty("bank")
    public String getBank() {
        return bank;
    }

    /**
     * 
     * @param bank
     *     The bank
     */
    @JsonProperty("bank")
    public void setBank(String bank) {
        this.bank = bank;
    }

    public Addon withBank(String bank) {
        this.bank = bank;
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

    public Addon withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
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

    public Addon withCustNo(String custNo) {
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

    public Addon withCustNoIssuerCode(String custNoIssuerCode) {
        this.custNoIssuerCode = custNoIssuerCode;
        return this;
    }

    /**
     * 
     * @return
     *     The misc
     */
    @JsonProperty("misc")
    public String getMisc() {
        return misc;
    }

    /**
     * 
     * @param misc
     *     The misc
     */
    @JsonProperty("misc")
    public void setMisc(String misc) {
        this.misc = misc;
    }

    public Addon withMisc(String misc) {
        this.misc = misc;
        return this;
    }

    /**
     * 
     * @return
     *     The miscType
     */
    @JsonProperty("miscType")
    public String getMiscType() {
        return miscType;
    }

    /**
     * 
     * @param miscType
     *     The miscType
     */
    @JsonProperty("miscType")
    public void setMiscType(String miscType) {
        this.miscType = miscType;
    }

    public Addon withMiscType(String miscType) {
        this.miscType = miscType;
        return this;
    }

    /**
     * 
     * @return
     *     The contact
     */
    @JsonProperty("contact")
    public String getContact() {
        return contact;
    }

    /**
     * 
     * @param contact
     *     The contact
     */
    @JsonProperty("contact")
    public void setContact(String contact) {
        this.contact = contact;
    }

    public Addon withContact(String contact) {
        this.contact = contact;
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

    public Addon withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * 
     * @return
     *     The referenceType
     */
    @JsonProperty("referenceType")
    public String getReferenceType() {
        return referenceType;
    }

    /**
     * 
     * @param referenceType
     *     The referenceType
     */
    @JsonProperty("referenceType")
    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public Addon withReferenceType(String referenceType) {
        this.referenceType = referenceType;
        return this;
    }

    /**
     * 
     * @return
     *     The tempMin
     */
    @JsonProperty("tempMin")
    public Double getTempMin() {
        return tempMin;
    }

    /**
     * 
     * @param tempMin
     *     The tempMin
     */
    @JsonProperty("tempMin")
    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Addon withTempMin(Double tempMin) {
        this.tempMin = tempMin;
        return this;
    }

    /**
     * 
     * @return
     *     The tempMax
     */
    @JsonProperty("tempMax")
    public Double getTempMax() {
        return tempMax;
    }

    /**
     * 
     * @param tempMax
     *     The tempMax
     */
    @JsonProperty("tempMax")
    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Addon withTempMax(Double tempMax) {
        this.tempMax = tempMax;
        return this;
    }

    /**
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Addon withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 
     * @return
     *     The text1
     */
    @JsonProperty("text1")
    public String getText1() {
        return text1;
    }

    /**
     * 
     * @param text1
     *     The text1
     */
    @JsonProperty("text1")
    public void setText1(String text1) {
        this.text1 = text1;
    }

    public Addon withText1(String text1) {
        this.text1 = text1;
        return this;
    }

    /**
     * 
     * @return
     *     The text2
     */
    @JsonProperty("text2")
    public String getText2() {
        return text2;
    }

    /**
     * 
     * @param text2
     *     The text2
     */
    @JsonProperty("text2")
    public void setText2(String text2) {
        this.text2 = text2;
    }

    public Addon withText2(String text2) {
        this.text2 = text2;
        return this;
    }

    /**
     * 
     * @return
     *     The text3
     */
    @JsonProperty("text3")
    public String getText3() {
        return text3;
    }

    /**
     * 
     * @param text3
     *     The text3
     */
    @JsonProperty("text3")
    public void setText3(String text3) {
        this.text3 = text3;
    }

    public Addon withText3(String text3) {
        this.text3 = text3;
        return this;
    }

    /**
     * 
     * @return
     *     The text4
     */
    @JsonProperty("text4")
    public String getText4() {
        return text4;
    }

    /**
     * 
     * @param text4
     *     The text4
     */
    @JsonProperty("text4")
    public void setText4(String text4) {
        this.text4 = text4;
    }

    public Addon withText4(String text4) {
        this.text4 = text4;
        return this;
    }

    /**
     * 
     * @return
     *     The text5
     */
    @JsonProperty("text5")
    public String getText5() {
        return text5;
    }

    /**
     * 
     * @param text5
     *     The text5
     */
    @JsonProperty("text5")
    public void setText5(String text5) {
        this.text5 = text5;
    }

    public Addon withText5(String text5) {
        this.text5 = text5;
        return this;
    }

    /**
     * 
     * @return
     *     The text6
     */
    @JsonProperty("text6")
    public String getText6() {
        return text6;
    }

    /**
     * 
     * @param text6
     *     The text6
     */
    @JsonProperty("text6")
    public void setText6(String text6) {
        this.text6 = text6;
    }

    public Addon withText6(String text6) {
        this.text6 = text6;
        return this;
    }

    /**
     * 
     * @return
     *     The text7
     */
    @JsonProperty("text7")
    public String getText7() {
        return text7;
    }

    /**
     * 
     * @param text7
     *     The text7
     */
    @JsonProperty("text7")
    public void setText7(String text7) {
        this.text7 = text7;
    }

    public Addon withText7(String text7) {
        this.text7 = text7;
        return this;
    }

    /**
     * 
     * @return
     *     The text8
     */
    @JsonProperty("text8")
    public String getText8() {
        return text8;
    }

    /**
     * 
     * @param text8
     *     The text8
     */
    @JsonProperty("text8")
    public void setText8(String text8) {
        this.text8 = text8;
    }

    public Addon withText8(String text8) {
        this.text8 = text8;
        return this;
    }

    /**
     * 
     * @return
     *     The text9
     */
    @JsonProperty("text9")
    public String getText9() {
        return text9;
    }

    /**
     * 
     * @param text9
     *     The text9
     */
    @JsonProperty("text9")
    public void setText9(String text9) {
        this.text9 = text9;
    }

    public Addon withText9(String text9) {
        this.text9 = text9;
        return this;
    }

    /**
     * 
     * @return
     *     The text10
     */
    @JsonProperty("text10")
    public String getText10() {
        return text10;
    }

    /**
     * 
     * @param text10
     *     The text10
     */
    @JsonProperty("text10")
    public void setText10(String text10) {
        this.text10 = text10;
    }

    public Addon withText10(String text10) {
        this.text10 = text10;
        return this;
    }

    /**
     * 
     * @return
     *     The length
     */
    @JsonProperty("length")
    public Double getLength() {
        return length;
    }

    /**
     * 
     * @param length
     *     The length
     */
    @JsonProperty("length")
    public void setLength(Double length) {
        this.length = length;
    }

    public Addon withLength(Double length) {
        this.length = length;
        return this;
    }

    /**
     * 
     * @return
     *     The width
     */
    @JsonProperty("width")
    public Double getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    @JsonProperty("width")
    public void setWidth(Double width) {
        this.width = width;
    }

    public Addon withWidth(Double width) {
        this.width = width;
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

    public Addon withDeclarant(String declarant) {
        this.declarant = declarant;
        return this;
    }

    /**
     * 
     * @return
     *     The passengerFlight
     */
    @JsonProperty("passengerFlight")
    public Boolean getPassengerFlight() {
        return passengerFlight;
    }

    /**
     * 
     * @param passengerFlight
     *     The passengerFlight
     */
    @JsonProperty("passengerFlight")
    public void setPassengerFlight(Boolean passengerFlight) {
        this.passengerFlight = passengerFlight;
    }

    public Addon withPassengerFlight(Boolean passengerFlight) {
        this.passengerFlight = passengerFlight;
        return this;
    }

    /**
     * 
     * @return
     *     The cargoFlight
     */
    @JsonProperty("cargoFlight")
    public Boolean getCargoFlight() {
        return cargoFlight;
    }

    /**
     * 
     * @param cargoFlight
     *     The cargoFlight
     */
    @JsonProperty("cargoFlight")
    public void setCargoFlight(Boolean cargoFlight) {
        this.cargoFlight = cargoFlight;
    }

    public Addon withCargoFlight(Boolean cargoFlight) {
        this.cargoFlight = cargoFlight;
        return this;
    }

    /**
     * 
     * @return
     *     The documentType
     */
    @JsonProperty("documentType")
    public String getDocumentType() {
        return documentType;
    }

    /**
     * 
     * @param documentType
     *     The documentType
     */
    @JsonProperty("documentType")
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public Addon withDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Addon withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 
     * @return
     *     The timeFrom
     */
    @JsonProperty("timeFrom")
    public String getTimeFrom() {
        return timeFrom;
    }

    /**
     * 
     * @param timeFrom
     *     The timeFrom
     */
    @JsonProperty("timeFrom")
    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public Addon withTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
        return this;
    }

    /**
     * 
     * @return
     *     The timeTo
     */
    @JsonProperty("timeTo")
    public String getTimeTo() {
        return timeTo;
    }

    /**
     * 
     * @param timeTo
     *     The timeTo
     */
    @JsonProperty("timeTo")
    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }

    public Addon withTimeTo(String timeTo) {
        this.timeTo = timeTo;
        return this;
    }

    /**
     * 
     * @return
     *     The confirmation
     */
    @JsonProperty("confirmation")
    public Boolean getConfirmation() {
        return confirmation;
    }

    /**
     * 
     * @param confirmation
     *     The confirmation
     */
    @JsonProperty("confirmation")
    public void setConfirmation(Boolean confirmation) {
        this.confirmation = confirmation;
    }

    public Addon withConfirmation(Boolean confirmation) {
        this.confirmation = confirmation;
        return this;
    }

    /**
     * 
     * @return
     *     The confirmationMisc
     */
    @JsonProperty("confirmationMisc")
    public String getConfirmationMisc() {
        return confirmationMisc;
    }

    /**
     * 
     * @param confirmationMisc
     *     The confirmationMisc
     */
    @JsonProperty("confirmationMisc")
    public void setConfirmationMisc(String confirmationMisc) {
        this.confirmationMisc = confirmationMisc;
    }

    public Addon withConfirmationMisc(String confirmationMisc) {
        this.confirmationMisc = confirmationMisc;
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

    public Addon withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
