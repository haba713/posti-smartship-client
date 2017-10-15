
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
    "message",
    "messageCode",
    "field",
    "location",
    "type"
})
public class StatusList {

    @JsonProperty("message")
    private String message;
    @JsonProperty("messageCode")
    private String messageCode;
    @JsonProperty("field")
    private String field;
    @JsonProperty("location")
    private String location;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public StatusList withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 
     * @return
     *     The messageCode
     */
    @JsonProperty("messageCode")
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * 
     * @param messageCode
     *     The messageCode
     */
    @JsonProperty("messageCode")
    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public StatusList withMessageCode(String messageCode) {
        this.messageCode = messageCode;
        return this;
    }

    /**
     * 
     * @return
     *     The field
     */
    @JsonProperty("field")
    public String getField() {
        return field;
    }

    /**
     * 
     * @param field
     *     The field
     */
    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    public StatusList withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public StatusList withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public StatusList withType(String type) {
        this.type = type;
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

    public StatusList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
