
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
    "quickId",
    "orgNo",
    "vatNo",
    "name",
    "address1",
    "address2",
    "zipcode",
    "city",
    "state",
    "country",
    "contact",
    "phone",
    "fax",
    "email",
    "mobile",
    "doorCode",
    "serviceType",
    "serviceCode",
    "openingHours"
})
public class FreightPayer {

    @JsonProperty("quickId")
    private String quickId;
    @JsonProperty("orgNo")
    private String orgNo;
    @JsonProperty("vatNo")
    private String vatNo;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("address2")
    private String address2;
    @JsonProperty("zipcode")
    private String zipcode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("country")
    private String country;
    @JsonProperty("contact")
    private String contact;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("email")
    private String email;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("doorCode")
    private String doorCode;
    @JsonProperty("serviceType")
    private String serviceType;
    @JsonProperty("serviceCode")
    private String serviceCode;
    @JsonProperty("openingHours")
    private String openingHours;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The quickId
     */
    @JsonProperty("quickId")
    public String getQuickId() {
        return quickId;
    }

    /**
     * 
     * @param quickId
     *     The quickId
     */
    @JsonProperty("quickId")
    public void setQuickId(String quickId) {
        this.quickId = quickId;
    }

    public FreightPayer withQuickId(String quickId) {
        this.quickId = quickId;
        return this;
    }

    /**
     * 
     * @return
     *     The orgNo
     */
    @JsonProperty("orgNo")
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 
     * @param orgNo
     *     The orgNo
     */
    @JsonProperty("orgNo")
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public FreightPayer withOrgNo(String orgNo) {
        this.orgNo = orgNo;
        return this;
    }

    /**
     * 
     * @return
     *     The vatNo
     */
    @JsonProperty("vatNo")
    public String getVatNo() {
        return vatNo;
    }

    /**
     * 
     * @param vatNo
     *     The vatNo
     */
    @JsonProperty("vatNo")
    public void setVatNo(String vatNo) {
        this.vatNo = vatNo;
    }

    public FreightPayer withVatNo(String vatNo) {
        this.vatNo = vatNo;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public FreightPayer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The address1
     */
    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    /**
     * 
     * @param address1
     *     The address1
     */
    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public FreightPayer withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * 
     * @return
     *     The address2
     */
    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    /**
     * 
     * @param address2
     *     The address2
     */
    @JsonProperty("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public FreightPayer withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * 
     * @return
     *     The zipcode
     */
    @JsonProperty("zipcode")
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 
     * @param zipcode
     *     The zipcode
     */
    @JsonProperty("zipcode")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public FreightPayer withZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * (Required)
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public FreightPayer withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public FreightPayer withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * 
     * (Required)
     * 
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public FreightPayer withCountry(String country) {
        this.country = country;
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

    public FreightPayer withContact(String contact) {
        this.contact = contact;
        return this;
    }

    /**
     * 
     * @return
     *     The phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public FreightPayer withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 
     * @return
     *     The fax
     */
    @JsonProperty("fax")
    public String getFax() {
        return fax;
    }

    /**
     * 
     * @param fax
     *     The fax
     */
    @JsonProperty("fax")
    public void setFax(String fax) {
        this.fax = fax;
    }

    public FreightPayer withFax(String fax) {
        this.fax = fax;
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

    public FreightPayer withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 
     * @return
     *     The mobile
     */
    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    /**
     * 
     * @param mobile
     *     The mobile
     */
    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public FreightPayer withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * 
     * @return
     *     The doorCode
     */
    @JsonProperty("doorCode")
    public String getDoorCode() {
        return doorCode;
    }

    /**
     * 
     * @param doorCode
     *     The doorCode
     */
    @JsonProperty("doorCode")
    public void setDoorCode(String doorCode) {
        this.doorCode = doorCode;
    }

    public FreightPayer withDoorCode(String doorCode) {
        this.doorCode = doorCode;
        return this;
    }

    /**
     * 
     * @return
     *     The serviceType
     */
    @JsonProperty("serviceType")
    public String getServiceType() {
        return serviceType;
    }

    /**
     * 
     * @param serviceType
     *     The serviceType
     */
    @JsonProperty("serviceType")
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public FreightPayer withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 
     * @return
     *     The serviceCode
     */
    @JsonProperty("serviceCode")
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * 
     * @param serviceCode
     *     The serviceCode
     */
    @JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public FreightPayer withServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * 
     * @return
     *     The openingHours
     */
    @JsonProperty("openingHours")
    public String getOpeningHours() {
        return openingHours;
    }

    /**
     * 
     * @param openingHours
     *     The openingHours
     */
    @JsonProperty("openingHours")
    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public FreightPayer withOpeningHours(String openingHours) {
        this.openingHours = openingHours;
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

    public FreightPayer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
