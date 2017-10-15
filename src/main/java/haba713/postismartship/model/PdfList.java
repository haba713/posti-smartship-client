
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
    "href",
    "id",
    "description",
    "pdf"
})
public class PdfList {

    @JsonProperty("href")
    private String href;
    @JsonProperty("id")
    private String id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("pdf")
    private String pdf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The href
     */
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    /**
     * 
     * @param href
     *     The href
     */
    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    public PdfList withHref(String href) {
        this.href = href;
        return this;
    }

    /**
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
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PdfList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public PdfList withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The pdf
     */
    @JsonProperty("pdf")
    public String getPdf() {
        return pdf;
    }

    /**
     * 
     * @param pdf
     *     The pdf
     */
    @JsonProperty("pdf")
    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public PdfList withPdf(String pdf) {
        this.pdf = pdf;
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

    public PdfList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
