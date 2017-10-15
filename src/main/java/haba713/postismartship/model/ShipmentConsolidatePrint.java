
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
    "close",
    "pdfConfig"
})
public class ShipmentConsolidatePrint {

    /**
     * 
     */
    @JsonProperty("shipment")
    private Shipment shipment;
    @JsonProperty("close")
    private Close close;
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
     * @return
     *     The shipment
     */
    @JsonProperty("shipment")
    public Shipment getShipment() {
        return shipment;
    }

    /**
     * 
     * @param shipment
     *     The shipment
     */
    @JsonProperty("shipment")
    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public ShipmentConsolidatePrint withShipment(Shipment shipment) {
        this.shipment = shipment;
        return this;
    }

    /**
     * 
     * @return
     *     The close
     */
    @JsonProperty("close")
    public Close getClose() {
        return close;
    }

    /**
     * 
     * @param close
     *     The close
     */
    @JsonProperty("close")
    public void setClose(Close close) {
        this.close = close;
    }

    public ShipmentConsolidatePrint withClose(Close close) {
        this.close = close;
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

    public ShipmentConsolidatePrint withPdfConfig(PdfConfig pdfConfig) {
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

    public ShipmentConsolidatePrint withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
