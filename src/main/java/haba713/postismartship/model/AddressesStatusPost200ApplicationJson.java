
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
    "location",
    "messageId",
    "message",
    "arguments",
    "error"
})
public class AddressesStatusPost200ApplicationJson {

    @JsonProperty("location")
    private String location;
    @JsonProperty("messageId")
    private String messageId;
    @JsonProperty("message")
    private String message;
    @JsonProperty("arguments")
    private String arguments;
    @JsonProperty("error")
    private Boolean error;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public AddressesStatusPost200ApplicationJson withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 
     * @return
     *     The messageId
     */
    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * 
     * @param messageId
     *     The messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public AddressesStatusPost200ApplicationJson withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

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

    public AddressesStatusPost200ApplicationJson withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 
     * @return
     *     The arguments
     */
    @JsonProperty("arguments")
    public String getArguments() {
        return arguments;
    }

    /**
     * 
     * @param arguments
     *     The arguments
     */
    @JsonProperty("arguments")
    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public AddressesStatusPost200ApplicationJson withArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * 
     * @return
     *     The error
     */
    @JsonProperty("error")
    public Boolean getError() {
        return error;
    }

    /**
     * 
     * @param error
     *     The error
     */
    @JsonProperty("error")
    public void setError(Boolean error) {
        this.error = error;
    }

    public AddressesStatusPost200ApplicationJson withError(Boolean error) {
        this.error = error;
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

    public AddressesStatusPost200ApplicationJson withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
