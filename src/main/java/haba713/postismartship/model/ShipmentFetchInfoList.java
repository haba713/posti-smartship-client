
package haba713.postismartship.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fetchId",
    "minDelay",
    "done",
    "shipments"
})
public class ShipmentFetchInfoList {

    @JsonProperty("fetchId")
    private String fetchId;
    @JsonProperty("minDelay")
    private Double minDelay;
    @JsonProperty("done")
    private Boolean done;
    @JsonProperty("shipments")
    private List<Shipment> shipments = new ArrayList<Shipment>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The fetchId
     */
    @JsonProperty("fetchId")
    public String getFetchId() {
        return fetchId;
    }

    /**
     * 
     * @param fetchId
     *     The fetchId
     */
    @JsonProperty("fetchId")
    public void setFetchId(String fetchId) {
        this.fetchId = fetchId;
    }

    public ShipmentFetchInfoList withFetchId(String fetchId) {
        this.fetchId = fetchId;
        return this;
    }

    /**
     * 
     * @return
     *     The minDelay
     */
    @JsonProperty("minDelay")
    public Double getMinDelay() {
        return minDelay;
    }

    /**
     * 
     * @param minDelay
     *     The minDelay
     */
    @JsonProperty("minDelay")
    public void setMinDelay(Double minDelay) {
        this.minDelay = minDelay;
    }

    public ShipmentFetchInfoList withMinDelay(Double minDelay) {
        this.minDelay = minDelay;
        return this;
    }

    /**
     * 
     * @return
     *     The done
     */
    @JsonProperty("done")
    public Boolean getDone() {
        return done;
    }

    /**
     * 
     * @param done
     *     The done
     */
    @JsonProperty("done")
    public void setDone(Boolean done) {
        this.done = done;
    }

    public ShipmentFetchInfoList withDone(Boolean done) {
        this.done = done;
        return this;
    }

    /**
     * 
     * @return
     *     The shipments
     */
    @JsonProperty("shipments")
    public List<Shipment> getShipments() {
        return shipments;
    }

    /**
     * 
     * @param shipments
     *     The shipments
     */
    @JsonProperty("shipments")
    public void setShipments(List<Shipment> shipments) {
        this.shipments = shipments;
    }

    public ShipmentFetchInfoList withShipments(List<Shipment> shipments) {
        this.shipments = shipments;
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

    public ShipmentFetchInfoList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
