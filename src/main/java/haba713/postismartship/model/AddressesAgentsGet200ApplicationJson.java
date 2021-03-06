
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
    "name",
    "address1",
    "address2",
    "zipcode",
    "city",
    "state",
    "countryCode",
    "contact",
    "phone",
    "fax",
    "email",
    "sms",
    "serviceType",
    "serviceCode",
    "openingHours"
})
public class AddressesAgentsGet200ApplicationJson {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
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
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("contact")
    private String contact;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("email")
    private String email;
    @JsonProperty("sms")
    private String sms;
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

    public AddressesAgentsGet200ApplicationJson withId(String id) {
        this.id = id;
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

    public AddressesAgentsGet200ApplicationJson withName(String name) {
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

    public AddressesAgentsGet200ApplicationJson withAddress1(String address1) {
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

    public AddressesAgentsGet200ApplicationJson withAddress2(String address2) {
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

    public AddressesAgentsGet200ApplicationJson withZipcode(String zipcode) {
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

    public AddressesAgentsGet200ApplicationJson withCity(String city) {
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

    public AddressesAgentsGet200ApplicationJson withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The countryCode
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * (Required)
     * 
     * @param countryCode
     *     The countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public AddressesAgentsGet200ApplicationJson withCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

    public AddressesAgentsGet200ApplicationJson withContact(String contact) {
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

    public AddressesAgentsGet200ApplicationJson withPhone(String phone) {
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

    public AddressesAgentsGet200ApplicationJson withFax(String fax) {
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

    public AddressesAgentsGet200ApplicationJson withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 
     * @return
     *     The sms
     */
    @JsonProperty("sms")
    public String getSms() {
        return sms;
    }

    /**
     * 
     * @param sms
     *     The sms
     */
    @JsonProperty("sms")
    public void setSms(String sms) {
        this.sms = sms;
    }

    public AddressesAgentsGet200ApplicationJson withSms(String sms) {
        this.sms = sms;
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

    public AddressesAgentsGet200ApplicationJson withServiceType(String serviceType) {
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

    public AddressesAgentsGet200ApplicationJson withServiceCode(String serviceCode) {
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

    public AddressesAgentsGet200ApplicationJson withOpeningHours(String openingHours) {
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

    public AddressesAgentsGet200ApplicationJson withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
