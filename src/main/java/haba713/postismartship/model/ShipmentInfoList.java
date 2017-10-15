
package haba713.postismartship.model;

import java.util.ArrayList;
import java.util.Date;
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
    "href",
    "id",
    "status",
    "shipmentNo",
    "orderNo",
    "reference",
    "serviceId",
    "parcelCount",
    "sndName",
    "sndZipcode",
    "sndCity",
    "sndCountry",
    "rcvName",
    "rcvZipcode",
    "rcvCity",
    "rcvCountry",
    "created",
    "changed",
    "shipDate",
    "returnShipment",
    "normalShipment",
    "consolidated",
    "parcels",
    "pdfs",
    "previousPdfs"
})
public class ShipmentInfoList {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("href")
    private String href;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("shipmentNo")
    private String shipmentNo;
    @JsonProperty("orderNo")
    private String orderNo;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("serviceId")
    private String serviceId;
    @JsonProperty("parcelCount")
    private Double parcelCount;
    @JsonProperty("sndName")
    private String sndName;
    @JsonProperty("sndZipcode")
    private String sndZipcode;
    @JsonProperty("sndCity")
    private String sndCity;
    @JsonProperty("sndCountry")
    private String sndCountry;
    @JsonProperty("rcvName")
    private String rcvName;
    @JsonProperty("rcvZipcode")
    private String rcvZipcode;
    @JsonProperty("rcvCity")
    private String rcvCity;
    @JsonProperty("rcvCountry")
    private String rcvCountry;
    @JsonProperty("created")
    private Date created;
    @JsonProperty("changed")
    private Date changed;
    @JsonProperty("shipDate")
    private Date shipDate;
    @JsonProperty("returnShipment")
    private Boolean returnShipment;
    @JsonProperty("normalShipment")
    private Boolean normalShipment;
    @JsonProperty("consolidated")
    private Boolean consolidated;
    @JsonProperty("parcels")
    private List<Parcel> parcels = new ArrayList<Parcel>();
    @JsonProperty("pdfs")
    private List<Pdf> pdfs = new ArrayList<Pdf>();
    @JsonProperty("previousPdfs")
    private List<PreviousPdf> previousPdfs = new ArrayList<PreviousPdf>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
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
     * (Required)
     * 
     * @param href
     *     The href
     */
    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    public ShipmentInfoList withHref(String href) {
        this.href = href;
        return this;
    }

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

    public ShipmentInfoList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public ShipmentInfoList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * @return
     *     The shipmentNo
     */
    @JsonProperty("shipmentNo")
    public String getShipmentNo() {
        return shipmentNo;
    }

    /**
     * 
     * @param shipmentNo
     *     The shipmentNo
     */
    @JsonProperty("shipmentNo")
    public void setShipmentNo(String shipmentNo) {
        this.shipmentNo = shipmentNo;
    }

    public ShipmentInfoList withShipmentNo(String shipmentNo) {
        this.shipmentNo = shipmentNo;
        return this;
    }

    /**
     * 
     * @return
     *     The orderNo
     */
    @JsonProperty("orderNo")
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 
     * @param orderNo
     *     The orderNo
     */
    @JsonProperty("orderNo")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public ShipmentInfoList withOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }

    /**
     * 
     * @return
     *     The reference
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    /**
     * 
     * @param reference
     *     The reference
     */
    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    public ShipmentInfoList withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * 
     * @return
     *     The serviceId
     */
    @JsonProperty("serviceId")
    public String getServiceId() {
        return serviceId;
    }

    /**
     * 
     * @param serviceId
     *     The serviceId
     */
    @JsonProperty("serviceId")
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ShipmentInfoList withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 
     * @return
     *     The parcelCount
     */
    @JsonProperty("parcelCount")
    public Double getParcelCount() {
        return parcelCount;
    }

    /**
     * 
     * @param parcelCount
     *     The parcelCount
     */
    @JsonProperty("parcelCount")
    public void setParcelCount(Double parcelCount) {
        this.parcelCount = parcelCount;
    }

    public ShipmentInfoList withParcelCount(Double parcelCount) {
        this.parcelCount = parcelCount;
        return this;
    }

    /**
     * 
     * @return
     *     The sndName
     */
    @JsonProperty("sndName")
    public String getSndName() {
        return sndName;
    }

    /**
     * 
     * @param sndName
     *     The sndName
     */
    @JsonProperty("sndName")
    public void setSndName(String sndName) {
        this.sndName = sndName;
    }

    public ShipmentInfoList withSndName(String sndName) {
        this.sndName = sndName;
        return this;
    }

    /**
     * 
     * @return
     *     The sndZipcode
     */
    @JsonProperty("sndZipcode")
    public String getSndZipcode() {
        return sndZipcode;
    }

    /**
     * 
     * @param sndZipcode
     *     The sndZipcode
     */
    @JsonProperty("sndZipcode")
    public void setSndZipcode(String sndZipcode) {
        this.sndZipcode = sndZipcode;
    }

    public ShipmentInfoList withSndZipcode(String sndZipcode) {
        this.sndZipcode = sndZipcode;
        return this;
    }

    /**
     * 
     * @return
     *     The sndCity
     */
    @JsonProperty("sndCity")
    public String getSndCity() {
        return sndCity;
    }

    /**
     * 
     * @param sndCity
     *     The sndCity
     */
    @JsonProperty("sndCity")
    public void setSndCity(String sndCity) {
        this.sndCity = sndCity;
    }

    public ShipmentInfoList withSndCity(String sndCity) {
        this.sndCity = sndCity;
        return this;
    }

    /**
     * 
     * @return
     *     The sndCountry
     */
    @JsonProperty("sndCountry")
    public String getSndCountry() {
        return sndCountry;
    }

    /**
     * 
     * @param sndCountry
     *     The sndCountry
     */
    @JsonProperty("sndCountry")
    public void setSndCountry(String sndCountry) {
        this.sndCountry = sndCountry;
    }

    public ShipmentInfoList withSndCountry(String sndCountry) {
        this.sndCountry = sndCountry;
        return this;
    }

    /**
     * 
     * @return
     *     The rcvName
     */
    @JsonProperty("rcvName")
    public String getRcvName() {
        return rcvName;
    }

    /**
     * 
     * @param rcvName
     *     The rcvName
     */
    @JsonProperty("rcvName")
    public void setRcvName(String rcvName) {
        this.rcvName = rcvName;
    }

    public ShipmentInfoList withRcvName(String rcvName) {
        this.rcvName = rcvName;
        return this;
    }

    /**
     * 
     * @return
     *     The rcvZipcode
     */
    @JsonProperty("rcvZipcode")
    public String getRcvZipcode() {
        return rcvZipcode;
    }

    /**
     * 
     * @param rcvZipcode
     *     The rcvZipcode
     */
    @JsonProperty("rcvZipcode")
    public void setRcvZipcode(String rcvZipcode) {
        this.rcvZipcode = rcvZipcode;
    }

    public ShipmentInfoList withRcvZipcode(String rcvZipcode) {
        this.rcvZipcode = rcvZipcode;
        return this;
    }

    /**
     * 
     * @return
     *     The rcvCity
     */
    @JsonProperty("rcvCity")
    public String getRcvCity() {
        return rcvCity;
    }

    /**
     * 
     * @param rcvCity
     *     The rcvCity
     */
    @JsonProperty("rcvCity")
    public void setRcvCity(String rcvCity) {
        this.rcvCity = rcvCity;
    }

    public ShipmentInfoList withRcvCity(String rcvCity) {
        this.rcvCity = rcvCity;
        return this;
    }

    /**
     * 
     * @return
     *     The rcvCountry
     */
    @JsonProperty("rcvCountry")
    public String getRcvCountry() {
        return rcvCountry;
    }

    /**
     * 
     * @param rcvCountry
     *     The rcvCountry
     */
    @JsonProperty("rcvCountry")
    public void setRcvCountry(String rcvCountry) {
        this.rcvCountry = rcvCountry;
    }

    public ShipmentInfoList withRcvCountry(String rcvCountry) {
        this.rcvCountry = rcvCountry;
        return this;
    }

    /**
     * 
     * @return
     *     The created
     */
    @JsonProperty("created")
    public Date getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    @JsonProperty("created")
    public void setCreated(Date created) {
        this.created = created;
    }

    public ShipmentInfoList withCreated(Date created) {
        this.created = created;
        return this;
    }

    /**
     * 
     * @return
     *     The changed
     */
    @JsonProperty("changed")
    public Date getChanged() {
        return changed;
    }

    /**
     * 
     * @param changed
     *     The changed
     */
    @JsonProperty("changed")
    public void setChanged(Date changed) {
        this.changed = changed;
    }

    public ShipmentInfoList withChanged(Date changed) {
        this.changed = changed;
        return this;
    }

    /**
     * 
     * @return
     *     The shipDate
     */
    @JsonProperty("shipDate")
    public Date getShipDate() {
        return shipDate;
    }

    /**
     * 
     * @param shipDate
     *     The shipDate
     */
    @JsonProperty("shipDate")
    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public ShipmentInfoList withShipDate(Date shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    /**
     * 
     * @return
     *     The returnShipment
     */
    @JsonProperty("returnShipment")
    public Boolean getReturnShipment() {
        return returnShipment;
    }

    /**
     * 
     * @param returnShipment
     *     The returnShipment
     */
    @JsonProperty("returnShipment")
    public void setReturnShipment(Boolean returnShipment) {
        this.returnShipment = returnShipment;
    }

    public ShipmentInfoList withReturnShipment(Boolean returnShipment) {
        this.returnShipment = returnShipment;
        return this;
    }

    /**
     * 
     * @return
     *     The normalShipment
     */
    @JsonProperty("normalShipment")
    public Boolean getNormalShipment() {
        return normalShipment;
    }

    /**
     * 
     * @param normalShipment
     *     The normalShipment
     */
    @JsonProperty("normalShipment")
    public void setNormalShipment(Boolean normalShipment) {
        this.normalShipment = normalShipment;
    }

    public ShipmentInfoList withNormalShipment(Boolean normalShipment) {
        this.normalShipment = normalShipment;
        return this;
    }

    /**
     * 
     * @return
     *     The consolidated
     */
    @JsonProperty("consolidated")
    public Boolean getConsolidated() {
        return consolidated;
    }

    /**
     * 
     * @param consolidated
     *     The consolidated
     */
    @JsonProperty("consolidated")
    public void setConsolidated(Boolean consolidated) {
        this.consolidated = consolidated;
    }

    public ShipmentInfoList withConsolidated(Boolean consolidated) {
        this.consolidated = consolidated;
        return this;
    }

    /**
     * 
     * @return
     *     The parcels
     */
    @JsonProperty("parcels")
    public List<Parcel> getParcels() {
        return parcels;
    }

    /**
     * 
     * @param parcels
     *     The parcels
     */
    @JsonProperty("parcels")
    public void setParcels(List<Parcel> parcels) {
        this.parcels = parcels;
    }

    public ShipmentInfoList withParcels(List<Parcel> parcels) {
        this.parcels = parcels;
        return this;
    }

    /**
     * 
     * @return
     *     The pdfs
     */
    @JsonProperty("pdfs")
    public List<Pdf> getPdfs() {
        return pdfs;
    }

    /**
     * 
     * @param pdfs
     *     The pdfs
     */
    @JsonProperty("pdfs")
    public void setPdfs(List<Pdf> pdfs) {
        this.pdfs = pdfs;
    }

    public ShipmentInfoList withPdfs(List<Pdf> pdfs) {
        this.pdfs = pdfs;
        return this;
    }

    /**
     * 
     * @return
     *     The previousPdfs
     */
    @JsonProperty("previousPdfs")
    public List<PreviousPdf> getPreviousPdfs() {
        return previousPdfs;
    }

    /**
     * 
     * @param previousPdfs
     *     The previousPdfs
     */
    @JsonProperty("previousPdfs")
    public void setPreviousPdfs(List<PreviousPdf> previousPdfs) {
        this.previousPdfs = previousPdfs;
    }

    public ShipmentInfoList withPreviousPdfs(List<PreviousPdf> previousPdfs) {
        this.previousPdfs = previousPdfs;
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

    public ShipmentInfoList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
