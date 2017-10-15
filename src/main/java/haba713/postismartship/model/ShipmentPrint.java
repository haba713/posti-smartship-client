
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
    "shipment",
    "pdfConfig"
})
public class ShipmentPrint {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("shipment")
    private Shipment shipment;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("pdfConfig")
    private PdfConfig pdfConfig;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The shipment
     */
    @JsonProperty("shipment")
    public Shipment getShipment() {
        return shipment;
    }

    /**
     * 
     * (Required)
     * 
     * @param shipment
     *     The shipment
     */
    @JsonProperty("shipment")
    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public ShipmentPrint withShipment(Shipment shipment) {
        this.shipment = shipment;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The pdfConfig
     */
    @JsonProperty("pdfConfig")
    public PdfConfig getPdfConfig() {
        return pdfConfig;
    }

    /**
     * 
     * (Required)
     * 
     * @param pdfConfig
     *     The pdfConfig
     */
    @JsonProperty("pdfConfig")
    public void setPdfConfig(PdfConfig pdfConfig) {
        this.pdfConfig = pdfConfig;
    }

    public ShipmentPrint withPdfConfig(PdfConfig pdfConfig) {
        this.pdfConfig = pdfConfig;
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

    public ShipmentPrint withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
