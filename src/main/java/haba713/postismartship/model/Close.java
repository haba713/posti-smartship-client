
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
    "mergeId"
})
public class Close {

    @JsonProperty("mergeId")
    private String mergeId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The mergeId
     */
    @JsonProperty("mergeId")
    public String getMergeId() {
        return mergeId;
    }

    /**
     * 
     * @param mergeId
     *     The mergeId
     */
    @JsonProperty("mergeId")
    public void setMergeId(String mergeId) {
        this.mergeId = mergeId;
    }

    public Close withMergeId(String mergeId) {
        this.mergeId = mergeId;
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

    public Close withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
