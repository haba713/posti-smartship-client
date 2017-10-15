
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
    "unCode",
    "hazardCode",
    "packageCode",
    "packageType",
    "description",
    "technicalDescr",
    "adrClass",
    "mpCode",
    "ems",
    "note",
    "netWeight",
    "netVolume",
    "trCode",
    "flashPoint",
    "limitedQuantities",
    "separation",
    "quantity"
})
public class DangerousGoods {

    @JsonProperty("unCode")
    private String unCode;
    @JsonProperty("hazardCode")
    private String hazardCode;
    @JsonProperty("packageCode")
    private String packageCode;
    @JsonProperty("packageType")
    private String packageType;
    @JsonProperty("description")
    private String description;
    @JsonProperty("technicalDescr")
    private String technicalDescr;
    @JsonProperty("adrClass")
    private String adrClass;
    @JsonProperty("mpCode")
    private String mpCode;
    @JsonProperty("ems")
    private String ems;
    @JsonProperty("note")
    private String note;
    @JsonProperty("netWeight")
    private Double netWeight;
    @JsonProperty("netVolume")
    private Double netVolume;
    @JsonProperty("trCode")
    private String trCode;
    @JsonProperty("flashPoint")
    private String flashPoint;
    @JsonProperty("limitedQuantities")
    private Boolean limitedQuantities;
    @JsonProperty("separation")
    private String separation;
    @JsonProperty("quantity")
    private Double quantity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The unCode
     */
    @JsonProperty("unCode")
    public String getUnCode() {
        return unCode;
    }

    /**
     * 
     * @param unCode
     *     The unCode
     */
    @JsonProperty("unCode")
    public void setUnCode(String unCode) {
        this.unCode = unCode;
    }

    public DangerousGoods withUnCode(String unCode) {
        this.unCode = unCode;
        return this;
    }

    /**
     * 
     * @return
     *     The hazardCode
     */
    @JsonProperty("hazardCode")
    public String getHazardCode() {
        return hazardCode;
    }

    /**
     * 
     * @param hazardCode
     *     The hazardCode
     */
    @JsonProperty("hazardCode")
    public void setHazardCode(String hazardCode) {
        this.hazardCode = hazardCode;
    }

    public DangerousGoods withHazardCode(String hazardCode) {
        this.hazardCode = hazardCode;
        return this;
    }

    /**
     * 
     * @return
     *     The packageCode
     */
    @JsonProperty("packageCode")
    public String getPackageCode() {
        return packageCode;
    }

    /**
     * 
     * @param packageCode
     *     The packageCode
     */
    @JsonProperty("packageCode")
    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public DangerousGoods withPackageCode(String packageCode) {
        this.packageCode = packageCode;
        return this;
    }

    /**
     * 
     * @return
     *     The packageType
     */
    @JsonProperty("packageType")
    public String getPackageType() {
        return packageType;
    }

    /**
     * 
     * @param packageType
     *     The packageType
     */
    @JsonProperty("packageType")
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public DangerousGoods withPackageType(String packageType) {
        this.packageType = packageType;
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

    public DangerousGoods withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The technicalDescr
     */
    @JsonProperty("technicalDescr")
    public String getTechnicalDescr() {
        return technicalDescr;
    }

    /**
     * 
     * @param technicalDescr
     *     The technicalDescr
     */
    @JsonProperty("technicalDescr")
    public void setTechnicalDescr(String technicalDescr) {
        this.technicalDescr = technicalDescr;
    }

    public DangerousGoods withTechnicalDescr(String technicalDescr) {
        this.technicalDescr = technicalDescr;
        return this;
    }

    /**
     * 
     * @return
     *     The adrClass
     */
    @JsonProperty("adrClass")
    public String getAdrClass() {
        return adrClass;
    }

    /**
     * 
     * @param adrClass
     *     The adrClass
     */
    @JsonProperty("adrClass")
    public void setAdrClass(String adrClass) {
        this.adrClass = adrClass;
    }

    public DangerousGoods withAdrClass(String adrClass) {
        this.adrClass = adrClass;
        return this;
    }

    /**
     * 
     * @return
     *     The mpCode
     */
    @JsonProperty("mpCode")
    public String getMpCode() {
        return mpCode;
    }

    /**
     * 
     * @param mpCode
     *     The mpCode
     */
    @JsonProperty("mpCode")
    public void setMpCode(String mpCode) {
        this.mpCode = mpCode;
    }

    public DangerousGoods withMpCode(String mpCode) {
        this.mpCode = mpCode;
        return this;
    }

    /**
     * 
     * @return
     *     The ems
     */
    @JsonProperty("ems")
    public String getEms() {
        return ems;
    }

    /**
     * 
     * @param ems
     *     The ems
     */
    @JsonProperty("ems")
    public void setEms(String ems) {
        this.ems = ems;
    }

    public DangerousGoods withEms(String ems) {
        this.ems = ems;
        return this;
    }

    /**
     * 
     * @return
     *     The note
     */
    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    /**
     * 
     * @param note
     *     The note
     */
    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    public DangerousGoods withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * 
     * @return
     *     The netWeight
     */
    @JsonProperty("netWeight")
    public Double getNetWeight() {
        return netWeight;
    }

    /**
     * 
     * @param netWeight
     *     The netWeight
     */
    @JsonProperty("netWeight")
    public void setNetWeight(Double netWeight) {
        this.netWeight = netWeight;
    }

    public DangerousGoods withNetWeight(Double netWeight) {
        this.netWeight = netWeight;
        return this;
    }

    /**
     * 
     * @return
     *     The netVolume
     */
    @JsonProperty("netVolume")
    public Double getNetVolume() {
        return netVolume;
    }

    /**
     * 
     * @param netVolume
     *     The netVolume
     */
    @JsonProperty("netVolume")
    public void setNetVolume(Double netVolume) {
        this.netVolume = netVolume;
    }

    public DangerousGoods withNetVolume(Double netVolume) {
        this.netVolume = netVolume;
        return this;
    }

    /**
     * 
     * @return
     *     The trCode
     */
    @JsonProperty("trCode")
    public String getTrCode() {
        return trCode;
    }

    /**
     * 
     * @param trCode
     *     The trCode
     */
    @JsonProperty("trCode")
    public void setTrCode(String trCode) {
        this.trCode = trCode;
    }

    public DangerousGoods withTrCode(String trCode) {
        this.trCode = trCode;
        return this;
    }

    /**
     * 
     * @return
     *     The flashPoint
     */
    @JsonProperty("flashPoint")
    public String getFlashPoint() {
        return flashPoint;
    }

    /**
     * 
     * @param flashPoint
     *     The flashPoint
     */
    @JsonProperty("flashPoint")
    public void setFlashPoint(String flashPoint) {
        this.flashPoint = flashPoint;
    }

    public DangerousGoods withFlashPoint(String flashPoint) {
        this.flashPoint = flashPoint;
        return this;
    }

    /**
     * 
     * @return
     *     The limitedQuantities
     */
    @JsonProperty("limitedQuantities")
    public Boolean getLimitedQuantities() {
        return limitedQuantities;
    }

    /**
     * 
     * @param limitedQuantities
     *     The limitedQuantities
     */
    @JsonProperty("limitedQuantities")
    public void setLimitedQuantities(Boolean limitedQuantities) {
        this.limitedQuantities = limitedQuantities;
    }

    public DangerousGoods withLimitedQuantities(Boolean limitedQuantities) {
        this.limitedQuantities = limitedQuantities;
        return this;
    }

    /**
     * 
     * @return
     *     The separation
     */
    @JsonProperty("separation")
    public String getSeparation() {
        return separation;
    }

    /**
     * 
     * @param separation
     *     The separation
     */
    @JsonProperty("separation")
    public void setSeparation(String separation) {
        this.separation = separation;
    }

    public DangerousGoods withSeparation(String separation) {
        this.separation = separation;
        return this;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    @JsonProperty("quantity")
    public Double getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    @JsonProperty("quantity")
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public DangerousGoods withQuantity(Double quantity) {
        this.quantity = quantity;
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

    public DangerousGoods withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
