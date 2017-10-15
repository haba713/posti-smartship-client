
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
    "target1Media",
    "target1XOffset",
    "target1YOffset",
    "target2Media",
    "target2XOffset",
    "target2YOffset",
    "target3Media",
    "target3XOffset",
    "target3YOffset",
    "target4Media",
    "target4XOffset",
    "target4YOffset"
})
public class PdfConfig {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("target1Media")
    private String target1Media;
    @JsonProperty("target1XOffset")
    private Double target1XOffset;
    @JsonProperty("target1YOffset")
    private Double target1YOffset;
    @JsonProperty("target2Media")
    private String target2Media;
    @JsonProperty("target2XOffset")
    private Double target2XOffset;
    @JsonProperty("target2YOffset")
    private Double target2YOffset;
    @JsonProperty("target3Media")
    private String target3Media;
    @JsonProperty("target3XOffset")
    private Double target3XOffset;
    @JsonProperty("target3YOffset")
    private Double target3YOffset;
    @JsonProperty("target4Media")
    private String target4Media;
    @JsonProperty("target4XOffset")
    private Double target4XOffset;
    @JsonProperty("target4YOffset")
    private Double target4YOffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The target1Media
     */
    @JsonProperty("target1Media")
    public String getTarget1Media() {
        return target1Media;
    }

    /**
     * 
     * (Required)
     * 
     * @param target1Media
     *     The target1Media
     */
    @JsonProperty("target1Media")
    public void setTarget1Media(String target1Media) {
        this.target1Media = target1Media;
    }

    public PdfConfig withTarget1Media(String target1Media) {
        this.target1Media = target1Media;
        return this;
    }

    /**
     * 
     * @return
     *     The target1XOffset
     */
    @JsonProperty("target1XOffset")
    public Double getTarget1XOffset() {
        return target1XOffset;
    }

    /**
     * 
     * @param target1XOffset
     *     The target1XOffset
     */
    @JsonProperty("target1XOffset")
    public void setTarget1XOffset(Double target1XOffset) {
        this.target1XOffset = target1XOffset;
    }

    public PdfConfig withTarget1XOffset(Double target1XOffset) {
        this.target1XOffset = target1XOffset;
        return this;
    }

    /**
     * 
     * @return
     *     The target1YOffset
     */
    @JsonProperty("target1YOffset")
    public Double getTarget1YOffset() {
        return target1YOffset;
    }

    /**
     * 
     * @param target1YOffset
     *     The target1YOffset
     */
    @JsonProperty("target1YOffset")
    public void setTarget1YOffset(Double target1YOffset) {
        this.target1YOffset = target1YOffset;
    }

    public PdfConfig withTarget1YOffset(Double target1YOffset) {
        this.target1YOffset = target1YOffset;
        return this;
    }

    /**
     * 
     * @return
     *     The target2Media
     */
    @JsonProperty("target2Media")
    public String getTarget2Media() {
        return target2Media;
    }

    /**
     * 
     * @param target2Media
     *     The target2Media
     */
    @JsonProperty("target2Media")
    public void setTarget2Media(String target2Media) {
        this.target2Media = target2Media;
    }

    public PdfConfig withTarget2Media(String target2Media) {
        this.target2Media = target2Media;
        return this;
    }

    /**
     * 
     * @return
     *     The target2XOffset
     */
    @JsonProperty("target2XOffset")
    public Double getTarget2XOffset() {
        return target2XOffset;
    }

    /**
     * 
     * @param target2XOffset
     *     The target2XOffset
     */
    @JsonProperty("target2XOffset")
    public void setTarget2XOffset(Double target2XOffset) {
        this.target2XOffset = target2XOffset;
    }

    public PdfConfig withTarget2XOffset(Double target2XOffset) {
        this.target2XOffset = target2XOffset;
        return this;
    }

    /**
     * 
     * @return
     *     The target2YOffset
     */
    @JsonProperty("target2YOffset")
    public Double getTarget2YOffset() {
        return target2YOffset;
    }

    /**
     * 
     * @param target2YOffset
     *     The target2YOffset
     */
    @JsonProperty("target2YOffset")
    public void setTarget2YOffset(Double target2YOffset) {
        this.target2YOffset = target2YOffset;
    }

    public PdfConfig withTarget2YOffset(Double target2YOffset) {
        this.target2YOffset = target2YOffset;
        return this;
    }

    /**
     * 
     * @return
     *     The target3Media
     */
    @JsonProperty("target3Media")
    public String getTarget3Media() {
        return target3Media;
    }

    /**
     * 
     * @param target3Media
     *     The target3Media
     */
    @JsonProperty("target3Media")
    public void setTarget3Media(String target3Media) {
        this.target3Media = target3Media;
    }

    public PdfConfig withTarget3Media(String target3Media) {
        this.target3Media = target3Media;
        return this;
    }

    /**
     * 
     * @return
     *     The target3XOffset
     */
    @JsonProperty("target3XOffset")
    public Double getTarget3XOffset() {
        return target3XOffset;
    }

    /**
     * 
     * @param target3XOffset
     *     The target3XOffset
     */
    @JsonProperty("target3XOffset")
    public void setTarget3XOffset(Double target3XOffset) {
        this.target3XOffset = target3XOffset;
    }

    public PdfConfig withTarget3XOffset(Double target3XOffset) {
        this.target3XOffset = target3XOffset;
        return this;
    }

    /**
     * 
     * @return
     *     The target3YOffset
     */
    @JsonProperty("target3YOffset")
    public Double getTarget3YOffset() {
        return target3YOffset;
    }

    /**
     * 
     * @param target3YOffset
     *     The target3YOffset
     */
    @JsonProperty("target3YOffset")
    public void setTarget3YOffset(Double target3YOffset) {
        this.target3YOffset = target3YOffset;
    }

    public PdfConfig withTarget3YOffset(Double target3YOffset) {
        this.target3YOffset = target3YOffset;
        return this;
    }

    /**
     * 
     * @return
     *     The target4Media
     */
    @JsonProperty("target4Media")
    public String getTarget4Media() {
        return target4Media;
    }

    /**
     * 
     * @param target4Media
     *     The target4Media
     */
    @JsonProperty("target4Media")
    public void setTarget4Media(String target4Media) {
        this.target4Media = target4Media;
    }

    public PdfConfig withTarget4Media(String target4Media) {
        this.target4Media = target4Media;
        return this;
    }

    /**
     * 
     * @return
     *     The target4XOffset
     */
    @JsonProperty("target4XOffset")
    public Double getTarget4XOffset() {
        return target4XOffset;
    }

    /**
     * 
     * @param target4XOffset
     *     The target4XOffset
     */
    @JsonProperty("target4XOffset")
    public void setTarget4XOffset(Double target4XOffset) {
        this.target4XOffset = target4XOffset;
    }

    public PdfConfig withTarget4XOffset(Double target4XOffset) {
        this.target4XOffset = target4XOffset;
        return this;
    }

    /**
     * 
     * @return
     *     The target4YOffset
     */
    @JsonProperty("target4YOffset")
    public Double getTarget4YOffset() {
        return target4YOffset;
    }

    /**
     * 
     * @param target4YOffset
     *     The target4YOffset
     */
    @JsonProperty("target4YOffset")
    public void setTarget4YOffset(Double target4YOffset) {
        this.target4YOffset = target4YOffset;
    }

    public PdfConfig withTarget4YOffset(Double target4YOffset) {
        this.target4YOffset = target4YOffset;
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

    public PdfConfig withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
