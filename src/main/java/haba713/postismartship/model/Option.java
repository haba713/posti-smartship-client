
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
    "from",
    "to",
    "cc",
    "bcc",
    "errorTo",
    "message",
    "languageCode",
    "mailTemplate",
    "sendEmail"
})
public class Option {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("from")
    private String from;
    @JsonProperty("to")
    private String to;
    @JsonProperty("cc")
    private String cc;
    @JsonProperty("bcc")
    private String bcc;
    @JsonProperty("errorTo")
    private String errorTo;
    @JsonProperty("message")
    private String message;
    @JsonProperty("languageCode")
    private String languageCode;
    @JsonProperty("mailTemplate")
    private String mailTemplate;
    @JsonProperty("sendEmail")
    private Boolean sendEmail;
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

    public Option withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * 
     * @param from
     *     The from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    public Option withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * 
     * @return
     *     The to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * 
     * @param to
     *     The to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    public Option withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * 
     * @return
     *     The cc
     */
    @JsonProperty("cc")
    public String getCc() {
        return cc;
    }

    /**
     * 
     * @param cc
     *     The cc
     */
    @JsonProperty("cc")
    public void setCc(String cc) {
        this.cc = cc;
    }

    public Option withCc(String cc) {
        this.cc = cc;
        return this;
    }

    /**
     * 
     * @return
     *     The bcc
     */
    @JsonProperty("bcc")
    public String getBcc() {
        return bcc;
    }

    /**
     * 
     * @param bcc
     *     The bcc
     */
    @JsonProperty("bcc")
    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public Option withBcc(String bcc) {
        this.bcc = bcc;
        return this;
    }

    /**
     * 
     * @return
     *     The errorTo
     */
    @JsonProperty("errorTo")
    public String getErrorTo() {
        return errorTo;
    }

    /**
     * 
     * @param errorTo
     *     The errorTo
     */
    @JsonProperty("errorTo")
    public void setErrorTo(String errorTo) {
        this.errorTo = errorTo;
    }

    public Option withErrorTo(String errorTo) {
        this.errorTo = errorTo;
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

    public Option withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 
     * @return
     *     The languageCode
     */
    @JsonProperty("languageCode")
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * 
     * @param languageCode
     *     The languageCode
     */
    @JsonProperty("languageCode")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Option withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * 
     * @return
     *     The mailTemplate
     */
    @JsonProperty("mailTemplate")
    public String getMailTemplate() {
        return mailTemplate;
    }

    /**
     * 
     * @param mailTemplate
     *     The mailTemplate
     */
    @JsonProperty("mailTemplate")
    public void setMailTemplate(String mailTemplate) {
        this.mailTemplate = mailTemplate;
    }

    public Option withMailTemplate(String mailTemplate) {
        this.mailTemplate = mailTemplate;
        return this;
    }

    /**
     * 
     * @return
     *     The sendEmail
     */
    @JsonProperty("sendEmail")
    public Boolean getSendEmail() {
        return sendEmail;
    }

    /**
     * 
     * @param sendEmail
     *     The sendEmail
     */
    @JsonProperty("sendEmail")
    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public Option withSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
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

    public Option withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
