
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
    "city",
    "pattern",
    "valid",
    "box",
    "rural",
    "customer"
})
public class AddressesZipcodesGet200ApplicationJson {

    @JsonProperty("city")
    private String city;
    @JsonProperty("pattern")
    private String pattern;
    @JsonProperty("valid")
    private Boolean valid;
    @JsonProperty("box")
    private Boolean box;
    @JsonProperty("rural")
    private Boolean rural;
    @JsonProperty("customer")
    private Boolean customer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
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
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public AddressesZipcodesGet200ApplicationJson withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 
     * @return
     *     The pattern
     */
    @JsonProperty("pattern")
    public String getPattern() {
        return pattern;
    }

    /**
     * 
     * @param pattern
     *     The pattern
     */
    @JsonProperty("pattern")
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public AddressesZipcodesGet200ApplicationJson withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * 
     * @return
     *     The valid
     */
    @JsonProperty("valid")
    public Boolean getValid() {
        return valid;
    }

    /**
     * 
     * @param valid
     *     The valid
     */
    @JsonProperty("valid")
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public AddressesZipcodesGet200ApplicationJson withValid(Boolean valid) {
        this.valid = valid;
        return this;
    }

    /**
     * 
     * @return
     *     The box
     */
    @JsonProperty("box")
    public Boolean getBox() {
        return box;
    }

    /**
     * 
     * @param box
     *     The box
     */
    @JsonProperty("box")
    public void setBox(Boolean box) {
        this.box = box;
    }

    public AddressesZipcodesGet200ApplicationJson withBox(Boolean box) {
        this.box = box;
        return this;
    }

    /**
     * 
     * @return
     *     The rural
     */
    @JsonProperty("rural")
    public Boolean getRural() {
        return rural;
    }

    /**
     * 
     * @param rural
     *     The rural
     */
    @JsonProperty("rural")
    public void setRural(Boolean rural) {
        this.rural = rural;
    }

    public AddressesZipcodesGet200ApplicationJson withRural(Boolean rural) {
        this.rural = rural;
        return this;
    }

    /**
     * 
     * @return
     *     The customer
     */
    @JsonProperty("customer")
    public Boolean getCustomer() {
        return customer;
    }

    /**
     * 
     * @param customer
     *     The customer
     */
    @JsonProperty("customer")
    public void setCustomer(Boolean customer) {
        this.customer = customer;
    }

    public AddressesZipcodesGet200ApplicationJson withCustomer(Boolean customer) {
        this.customer = customer;
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

    public AddressesZipcodesGet200ApplicationJson withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
