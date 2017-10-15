
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
    "sender",
    "senderPartners",
    "dispatch",
    "receiver",
    "receiverPartners",
    "delivery",
    "agent",
    "returnPart",
    "freightPayer",
    "freightPayerPartners",
    "taxPayer",
    "taxPayerPartners",
    "customsPayer",
    "customsPayerPartners",
    "favorite",
    "profileGroup",
    "note",
    "test",
    "linkPrintKey",
    "orderNo",
    "mergeId",
    "freeText1",
    "freeText2",
    "freeText3",
    "freeText4",
    "senderReference",
    "receiverReference",
    "goodsDescription",
    "bulkId",
    "totalEurPallets",
    "totalHalfPallets",
    "totalQuarterPallets",
    "totalWeight",
    "totalVolume",
    "totalLoadingMeters",
    "totalSortCode",
    "totalQuantity",
    "totalPieces",
    "totalPallets",
    "waybillFreeText1",
    "waybillFreeText2",
    "waybillFreeText3",
    "waybillFreeText4",
    "waybillFreeText5",
    "waybillSpecialAgreement",
    "waybillDocuments1",
    "waybillDocuments2",
    "waybillCondition",
    "termsCode",
    "termsLocation",
    "termsLocationIdentifier",
    "printSet",
    "shipDate",
    "pickupTime",
    "deliveryDate",
    "deliveryTimeEarliest",
    "deliveryTimeLastest",
    "shipmentNo",
    "ediForward",
    "tplFormat",
    "pdfInsert",
    "deliveryInstruction",
    "customLabelText1",
    "customLabelText2",
    "customLabelText3",
    "customLabelText4",
    "customLabelText5",
    "customLabelText6",
    "service",
    "parcels",
    "customsDeclaration",
    "options"
})
public class Shipment {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sender")
    private Sender sender;
    @JsonProperty("senderPartners")
    private List<SenderPartner> senderPartners = new ArrayList<SenderPartner>();
    /**
     * 
     */
    @JsonProperty("dispatch")
    private Dispatch dispatch;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("receiver")
    private Receiver receiver;
    @JsonProperty("receiverPartners")
    private List<ReceiverPartner> receiverPartners = new ArrayList<ReceiverPartner>();
    /**
     * 
     */
    @JsonProperty("delivery")
    private Delivery delivery;
    /**
     * 
     */
    @JsonProperty("agent")
    private Agent agent;
    /**
     * 
     */
    @JsonProperty("returnPart")
    private ReturnPart returnPart;
    /**
     * 
     */
    @JsonProperty("freightPayer")
    private FreightPayer freightPayer;
    @JsonProperty("freightPayerPartners")
    private List<FreightPayerPartner> freightPayerPartners = new ArrayList<FreightPayerPartner>();
    /**
     * 
     */
    @JsonProperty("taxPayer")
    private TaxPayer taxPayer;
    @JsonProperty("taxPayerPartners")
    private List<TaxPayerPartner> taxPayerPartners = new ArrayList<TaxPayerPartner>();
    /**
     * 
     */
    @JsonProperty("customsPayer")
    private CustomsPayer customsPayer;
    @JsonProperty("customsPayerPartners")
    private List<CustomsPayerPartner> customsPayerPartners = new ArrayList<CustomsPayerPartner>();
    @JsonProperty("favorite")
    private String favorite;
    @JsonProperty("profileGroup")
    private String profileGroup;
    @JsonProperty("note")
    private String note;
    @JsonProperty("test")
    private Boolean test;
    @JsonProperty("linkPrintKey")
    private String linkPrintKey;
    @JsonProperty("orderNo")
    private String orderNo;
    @JsonProperty("mergeId")
    private String mergeId;
    @JsonProperty("freeText1")
    private String freeText1;
    @JsonProperty("freeText2")
    private String freeText2;
    @JsonProperty("freeText3")
    private String freeText3;
    @JsonProperty("freeText4")
    private String freeText4;
    @JsonProperty("senderReference")
    private String senderReference;
    @JsonProperty("receiverReference")
    private String receiverReference;
    @JsonProperty("goodsDescription")
    private String goodsDescription;
    @JsonProperty("bulkId")
    private String bulkId;
    @JsonProperty("totalEurPallets")
    private Integer totalEurPallets;
    @JsonProperty("totalHalfPallets")
    private Integer totalHalfPallets;
    @JsonProperty("totalQuarterPallets")
    private Integer totalQuarterPallets;
    @JsonProperty("totalWeight")
    private Double totalWeight;
    @JsonProperty("totalVolume")
    private Double totalVolume;
    @JsonProperty("totalLoadingMeters")
    private Double totalLoadingMeters;
    @JsonProperty("totalSortCode")
    private String totalSortCode;
    @JsonProperty("totalQuantity")
    private Integer totalQuantity;
    @JsonProperty("totalPieces")
    private Integer totalPieces;
    @JsonProperty("totalPallets")
    private Integer totalPallets;
    @JsonProperty("waybillFreeText1")
    private String waybillFreeText1;
    @JsonProperty("waybillFreeText2")
    private String waybillFreeText2;
    @JsonProperty("waybillFreeText3")
    private String waybillFreeText3;
    @JsonProperty("waybillFreeText4")
    private String waybillFreeText4;
    @JsonProperty("waybillFreeText5")
    private String waybillFreeText5;
    @JsonProperty("waybillSpecialAgreement")
    private String waybillSpecialAgreement;
    @JsonProperty("waybillDocuments1")
    private String waybillDocuments1;
    @JsonProperty("waybillDocuments2")
    private String waybillDocuments2;
    @JsonProperty("waybillCondition")
    private String waybillCondition;
    @JsonProperty("termsCode")
    private String termsCode;
    @JsonProperty("termsLocation")
    private String termsLocation;
    @JsonProperty("termsLocationIdentifier")
    private String termsLocationIdentifier;
    @JsonProperty("printSet")
    private List<String> printSet = new ArrayList<String>();
    @JsonProperty("shipDate")
    private Date shipDate;
    @JsonProperty("pickupTime")
    private Date pickupTime;
    @JsonProperty("deliveryDate")
    private String deliveryDate;
    @JsonProperty("deliveryTimeEarliest")
    private String deliveryTimeEarliest;
    @JsonProperty("deliveryTimeLastest")
    private String deliveryTimeLastest;
    @JsonProperty("shipmentNo")
    private String shipmentNo;
    @JsonProperty("ediForward")
    private Boolean ediForward;
    @JsonProperty("tplFormat")
    private Boolean tplFormat;
    @JsonProperty("pdfInsert")
    private String pdfInsert;
    @JsonProperty("deliveryInstruction")
    private String deliveryInstruction;
    @JsonProperty("customLabelText1")
    private String customLabelText1;
    @JsonProperty("customLabelText2")
    private String customLabelText2;
    @JsonProperty("customLabelText3")
    private String customLabelText3;
    @JsonProperty("customLabelText4")
    private String customLabelText4;
    @JsonProperty("customLabelText5")
    private String customLabelText5;
    @JsonProperty("customLabelText6")
    private String customLabelText6;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("service")
    private Service service;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("parcels")
    private List<Parcel> parcels = new ArrayList<Parcel>();
    @JsonProperty("customsDeclaration")
    private CustomsDeclaration customsDeclaration;
    @JsonProperty("options")
    private List<Option> options = new ArrayList<Option>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The sender
     */
    @JsonProperty("sender")
    public Sender getSender() {
        return sender;
    }

    /**
     * 
     * (Required)
     * 
     * @param sender
     *     The sender
     */
    @JsonProperty("sender")
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Shipment withSender(Sender sender) {
        this.sender = sender;
        return this;
    }

    /**
     * 
     * @return
     *     The senderPartners
     */
    @JsonProperty("senderPartners")
    public List<SenderPartner> getSenderPartners() {
        return senderPartners;
    }

    /**
     * 
     * @param senderPartners
     *     The senderPartners
     */
    @JsonProperty("senderPartners")
    public void setSenderPartners(List<SenderPartner> senderPartners) {
        this.senderPartners = senderPartners;
    }

    public Shipment withSenderPartners(List<SenderPartner> senderPartners) {
        this.senderPartners = senderPartners;
        return this;
    }

    /**
     * 
     * @return
     *     The dispatch
     */
    @JsonProperty("dispatch")
    public Dispatch getDispatch() {
        return dispatch;
    }

    /**
     * 
     * @param dispatch
     *     The dispatch
     */
    @JsonProperty("dispatch")
    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }

    public Shipment withDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The receiver
     */
    @JsonProperty("receiver")
    public Receiver getReceiver() {
        return receiver;
    }

    /**
     * 
     * (Required)
     * 
     * @param receiver
     *     The receiver
     */
    @JsonProperty("receiver")
    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Shipment withReceiver(Receiver receiver) {
        this.receiver = receiver;
        return this;
    }

    /**
     * 
     * @return
     *     The receiverPartners
     */
    @JsonProperty("receiverPartners")
    public List<ReceiverPartner> getReceiverPartners() {
        return receiverPartners;
    }

    /**
     * 
     * @param receiverPartners
     *     The receiverPartners
     */
    @JsonProperty("receiverPartners")
    public void setReceiverPartners(List<ReceiverPartner> receiverPartners) {
        this.receiverPartners = receiverPartners;
    }

    public Shipment withReceiverPartners(List<ReceiverPartner> receiverPartners) {
        this.receiverPartners = receiverPartners;
        return this;
    }

    /**
     * 
     * @return
     *     The delivery
     */
    @JsonProperty("delivery")
    public Delivery getDelivery() {
        return delivery;
    }

    /**
     * 
     * @param delivery
     *     The delivery
     */
    @JsonProperty("delivery")
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Shipment withDelivery(Delivery delivery) {
        this.delivery = delivery;
        return this;
    }

    /**
     * 
     * @return
     *     The agent
     */
    @JsonProperty("agent")
    public Agent getAgent() {
        return agent;
    }

    /**
     * 
     * @param agent
     *     The agent
     */
    @JsonProperty("agent")
    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Shipment withAgent(Agent agent) {
        this.agent = agent;
        return this;
    }

    /**
     * 
     * @return
     *     The returnPart
     */
    @JsonProperty("returnPart")
    public ReturnPart getReturnPart() {
        return returnPart;
    }

    /**
     * 
     * @param returnPart
     *     The returnPart
     */
    @JsonProperty("returnPart")
    public void setReturnPart(ReturnPart returnPart) {
        this.returnPart = returnPart;
    }

    public Shipment withReturnPart(ReturnPart returnPart) {
        this.returnPart = returnPart;
        return this;
    }

    /**
     * 
     * @return
     *     The freightPayer
     */
    @JsonProperty("freightPayer")
    public FreightPayer getFreightPayer() {
        return freightPayer;
    }

    /**
     * 
     * @param freightPayer
     *     The freightPayer
     */
    @JsonProperty("freightPayer")
    public void setFreightPayer(FreightPayer freightPayer) {
        this.freightPayer = freightPayer;
    }

    public Shipment withFreightPayer(FreightPayer freightPayer) {
        this.freightPayer = freightPayer;
        return this;
    }

    /**
     * 
     * @return
     *     The freightPayerPartners
     */
    @JsonProperty("freightPayerPartners")
    public List<FreightPayerPartner> getFreightPayerPartners() {
        return freightPayerPartners;
    }

    /**
     * 
     * @param freightPayerPartners
     *     The freightPayerPartners
     */
    @JsonProperty("freightPayerPartners")
    public void setFreightPayerPartners(List<FreightPayerPartner> freightPayerPartners) {
        this.freightPayerPartners = freightPayerPartners;
    }

    public Shipment withFreightPayerPartners(List<FreightPayerPartner> freightPayerPartners) {
        this.freightPayerPartners = freightPayerPartners;
        return this;
    }

    /**
     * 
     * @return
     *     The taxPayer
     */
    @JsonProperty("taxPayer")
    public TaxPayer getTaxPayer() {
        return taxPayer;
    }

    /**
     * 
     * @param taxPayer
     *     The taxPayer
     */
    @JsonProperty("taxPayer")
    public void setTaxPayer(TaxPayer taxPayer) {
        this.taxPayer = taxPayer;
    }

    public Shipment withTaxPayer(TaxPayer taxPayer) {
        this.taxPayer = taxPayer;
        return this;
    }

    /**
     * 
     * @return
     *     The taxPayerPartners
     */
    @JsonProperty("taxPayerPartners")
    public List<TaxPayerPartner> getTaxPayerPartners() {
        return taxPayerPartners;
    }

    /**
     * 
     * @param taxPayerPartners
     *     The taxPayerPartners
     */
    @JsonProperty("taxPayerPartners")
    public void setTaxPayerPartners(List<TaxPayerPartner> taxPayerPartners) {
        this.taxPayerPartners = taxPayerPartners;
    }

    public Shipment withTaxPayerPartners(List<TaxPayerPartner> taxPayerPartners) {
        this.taxPayerPartners = taxPayerPartners;
        return this;
    }

    /**
     * 
     * @return
     *     The customsPayer
     */
    @JsonProperty("customsPayer")
    public CustomsPayer getCustomsPayer() {
        return customsPayer;
    }

    /**
     * 
     * @param customsPayer
     *     The customsPayer
     */
    @JsonProperty("customsPayer")
    public void setCustomsPayer(CustomsPayer customsPayer) {
        this.customsPayer = customsPayer;
    }

    public Shipment withCustomsPayer(CustomsPayer customsPayer) {
        this.customsPayer = customsPayer;
        return this;
    }

    /**
     * 
     * @return
     *     The customsPayerPartners
     */
    @JsonProperty("customsPayerPartners")
    public List<CustomsPayerPartner> getCustomsPayerPartners() {
        return customsPayerPartners;
    }

    /**
     * 
     * @param customsPayerPartners
     *     The customsPayerPartners
     */
    @JsonProperty("customsPayerPartners")
    public void setCustomsPayerPartners(List<CustomsPayerPartner> customsPayerPartners) {
        this.customsPayerPartners = customsPayerPartners;
    }

    public Shipment withCustomsPayerPartners(List<CustomsPayerPartner> customsPayerPartners) {
        this.customsPayerPartners = customsPayerPartners;
        return this;
    }

    /**
     * 
     * @return
     *     The favorite
     */
    @JsonProperty("favorite")
    public String getFavorite() {
        return favorite;
    }

    /**
     * 
     * @param favorite
     *     The favorite
     */
    @JsonProperty("favorite")
    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public Shipment withFavorite(String favorite) {
        this.favorite = favorite;
        return this;
    }

    /**
     * 
     * @return
     *     The profileGroup
     */
    @JsonProperty("profileGroup")
    public String getProfileGroup() {
        return profileGroup;
    }

    /**
     * 
     * @param profileGroup
     *     The profileGroup
     */
    @JsonProperty("profileGroup")
    public void setProfileGroup(String profileGroup) {
        this.profileGroup = profileGroup;
    }

    public Shipment withProfileGroup(String profileGroup) {
        this.profileGroup = profileGroup;
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

    public Shipment withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * 
     * @return
     *     The test
     */
    @JsonProperty("test")
    public Boolean getTest() {
        return test;
    }

    /**
     * 
     * @param test
     *     The test
     */
    @JsonProperty("test")
    public void setTest(Boolean test) {
        this.test = test;
    }

    public Shipment withTest(Boolean test) {
        this.test = test;
        return this;
    }

    /**
     * 
     * @return
     *     The linkPrintKey
     */
    @JsonProperty("linkPrintKey")
    public String getLinkPrintKey() {
        return linkPrintKey;
    }

    /**
     * 
     * @param linkPrintKey
     *     The linkPrintKey
     */
    @JsonProperty("linkPrintKey")
    public void setLinkPrintKey(String linkPrintKey) {
        this.linkPrintKey = linkPrintKey;
    }

    public Shipment withLinkPrintKey(String linkPrintKey) {
        this.linkPrintKey = linkPrintKey;
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

    public Shipment withOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }

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

    public Shipment withMergeId(String mergeId) {
        this.mergeId = mergeId;
        return this;
    }

    /**
     * 
     * @return
     *     The freeText1
     */
    @JsonProperty("freeText1")
    public String getFreeText1() {
        return freeText1;
    }

    /**
     * 
     * @param freeText1
     *     The freeText1
     */
    @JsonProperty("freeText1")
    public void setFreeText1(String freeText1) {
        this.freeText1 = freeText1;
    }

    public Shipment withFreeText1(String freeText1) {
        this.freeText1 = freeText1;
        return this;
    }

    /**
     * 
     * @return
     *     The freeText2
     */
    @JsonProperty("freeText2")
    public String getFreeText2() {
        return freeText2;
    }

    /**
     * 
     * @param freeText2
     *     The freeText2
     */
    @JsonProperty("freeText2")
    public void setFreeText2(String freeText2) {
        this.freeText2 = freeText2;
    }

    public Shipment withFreeText2(String freeText2) {
        this.freeText2 = freeText2;
        return this;
    }

    /**
     * 
     * @return
     *     The freeText3
     */
    @JsonProperty("freeText3")
    public String getFreeText3() {
        return freeText3;
    }

    /**
     * 
     * @param freeText3
     *     The freeText3
     */
    @JsonProperty("freeText3")
    public void setFreeText3(String freeText3) {
        this.freeText3 = freeText3;
    }

    public Shipment withFreeText3(String freeText3) {
        this.freeText3 = freeText3;
        return this;
    }

    /**
     * 
     * @return
     *     The freeText4
     */
    @JsonProperty("freeText4")
    public String getFreeText4() {
        return freeText4;
    }

    /**
     * 
     * @param freeText4
     *     The freeText4
     */
    @JsonProperty("freeText4")
    public void setFreeText4(String freeText4) {
        this.freeText4 = freeText4;
    }

    public Shipment withFreeText4(String freeText4) {
        this.freeText4 = freeText4;
        return this;
    }

    /**
     * 
     * @return
     *     The senderReference
     */
    @JsonProperty("senderReference")
    public String getSenderReference() {
        return senderReference;
    }

    /**
     * 
     * @param senderReference
     *     The senderReference
     */
    @JsonProperty("senderReference")
    public void setSenderReference(String senderReference) {
        this.senderReference = senderReference;
    }

    public Shipment withSenderReference(String senderReference) {
        this.senderReference = senderReference;
        return this;
    }

    /**
     * 
     * @return
     *     The receiverReference
     */
    @JsonProperty("receiverReference")
    public String getReceiverReference() {
        return receiverReference;
    }

    /**
     * 
     * @param receiverReference
     *     The receiverReference
     */
    @JsonProperty("receiverReference")
    public void setReceiverReference(String receiverReference) {
        this.receiverReference = receiverReference;
    }

    public Shipment withReceiverReference(String receiverReference) {
        this.receiverReference = receiverReference;
        return this;
    }

    /**
     * 
     * @return
     *     The goodsDescription
     */
    @JsonProperty("goodsDescription")
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /**
     * 
     * @param goodsDescription
     *     The goodsDescription
     */
    @JsonProperty("goodsDescription")
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    public Shipment withGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
        return this;
    }

    /**
     * 
     * @return
     *     The bulkId
     */
    @JsonProperty("bulkId")
    public String getBulkId() {
        return bulkId;
    }

    /**
     * 
     * @param bulkId
     *     The bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    public Shipment withBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * 
     * @return
     *     The totalEurPallets
     */
    @JsonProperty("totalEurPallets")
    public Integer getTotalEurPallets() {
        return totalEurPallets;
    }

    /**
     * 
     * @param totalEurPallets
     *     The totalEurPallets
     */
    @JsonProperty("totalEurPallets")
    public void setTotalEurPallets(Integer totalEurPallets) {
        this.totalEurPallets = totalEurPallets;
    }

    public Shipment withTotalEurPallets(Integer totalEurPallets) {
        this.totalEurPallets = totalEurPallets;
        return this;
    }

    /**
     * 
     * @return
     *     The totalHalfPallets
     */
    @JsonProperty("totalHalfPallets")
    public Integer getTotalHalfPallets() {
        return totalHalfPallets;
    }

    /**
     * 
     * @param totalHalfPallets
     *     The totalHalfPallets
     */
    @JsonProperty("totalHalfPallets")
    public void setTotalHalfPallets(Integer totalHalfPallets) {
        this.totalHalfPallets = totalHalfPallets;
    }

    public Shipment withTotalHalfPallets(Integer totalHalfPallets) {
        this.totalHalfPallets = totalHalfPallets;
        return this;
    }

    /**
     * 
     * @return
     *     The totalQuarterPallets
     */
    @JsonProperty("totalQuarterPallets")
    public Integer getTotalQuarterPallets() {
        return totalQuarterPallets;
    }

    /**
     * 
     * @param totalQuarterPallets
     *     The totalQuarterPallets
     */
    @JsonProperty("totalQuarterPallets")
    public void setTotalQuarterPallets(Integer totalQuarterPallets) {
        this.totalQuarterPallets = totalQuarterPallets;
    }

    public Shipment withTotalQuarterPallets(Integer totalQuarterPallets) {
        this.totalQuarterPallets = totalQuarterPallets;
        return this;
    }

    /**
     * 
     * @return
     *     The totalWeight
     */
    @JsonProperty("totalWeight")
    public Double getTotalWeight() {
        return totalWeight;
    }

    /**
     * 
     * @param totalWeight
     *     The totalWeight
     */
    @JsonProperty("totalWeight")
    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Shipment withTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    /**
     * 
     * @return
     *     The totalVolume
     */
    @JsonProperty("totalVolume")
    public Double getTotalVolume() {
        return totalVolume;
    }

    /**
     * 
     * @param totalVolume
     *     The totalVolume
     */
    @JsonProperty("totalVolume")
    public void setTotalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public Shipment withTotalVolume(Double totalVolume) {
        this.totalVolume = totalVolume;
        return this;
    }

    /**
     * 
     * @return
     *     The totalLoadingMeters
     */
    @JsonProperty("totalLoadingMeters")
    public Double getTotalLoadingMeters() {
        return totalLoadingMeters;
    }

    /**
     * 
     * @param totalLoadingMeters
     *     The totalLoadingMeters
     */
    @JsonProperty("totalLoadingMeters")
    public void setTotalLoadingMeters(Double totalLoadingMeters) {
        this.totalLoadingMeters = totalLoadingMeters;
    }

    public Shipment withTotalLoadingMeters(Double totalLoadingMeters) {
        this.totalLoadingMeters = totalLoadingMeters;
        return this;
    }

    /**
     * 
     * @return
     *     The totalSortCode
     */
    @JsonProperty("totalSortCode")
    public String getTotalSortCode() {
        return totalSortCode;
    }

    /**
     * 
     * @param totalSortCode
     *     The totalSortCode
     */
    @JsonProperty("totalSortCode")
    public void setTotalSortCode(String totalSortCode) {
        this.totalSortCode = totalSortCode;
    }

    public Shipment withTotalSortCode(String totalSortCode) {
        this.totalSortCode = totalSortCode;
        return this;
    }

    /**
     * 
     * @return
     *     The totalQuantity
     */
    @JsonProperty("totalQuantity")
    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * 
     * @param totalQuantity
     *     The totalQuantity
     */
    @JsonProperty("totalQuantity")
    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Shipment withTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
        return this;
    }

    /**
     * 
     * @return
     *     The totalPieces
     */
    @JsonProperty("totalPieces")
    public Integer getTotalPieces() {
        return totalPieces;
    }

    /**
     * 
     * @param totalPieces
     *     The totalPieces
     */
    @JsonProperty("totalPieces")
    public void setTotalPieces(Integer totalPieces) {
        this.totalPieces = totalPieces;
    }

    public Shipment withTotalPieces(Integer totalPieces) {
        this.totalPieces = totalPieces;
        return this;
    }

    /**
     * 
     * @return
     *     The totalPallets
     */
    @JsonProperty("totalPallets")
    public Integer getTotalPallets() {
        return totalPallets;
    }

    /**
     * 
     * @param totalPallets
     *     The totalPallets
     */
    @JsonProperty("totalPallets")
    public void setTotalPallets(Integer totalPallets) {
        this.totalPallets = totalPallets;
    }

    public Shipment withTotalPallets(Integer totalPallets) {
        this.totalPallets = totalPallets;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillFreeText1
     */
    @JsonProperty("waybillFreeText1")
    public String getWaybillFreeText1() {
        return waybillFreeText1;
    }

    /**
     * 
     * @param waybillFreeText1
     *     The waybillFreeText1
     */
    @JsonProperty("waybillFreeText1")
    public void setWaybillFreeText1(String waybillFreeText1) {
        this.waybillFreeText1 = waybillFreeText1;
    }

    public Shipment withWaybillFreeText1(String waybillFreeText1) {
        this.waybillFreeText1 = waybillFreeText1;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillFreeText2
     */
    @JsonProperty("waybillFreeText2")
    public String getWaybillFreeText2() {
        return waybillFreeText2;
    }

    /**
     * 
     * @param waybillFreeText2
     *     The waybillFreeText2
     */
    @JsonProperty("waybillFreeText2")
    public void setWaybillFreeText2(String waybillFreeText2) {
        this.waybillFreeText2 = waybillFreeText2;
    }

    public Shipment withWaybillFreeText2(String waybillFreeText2) {
        this.waybillFreeText2 = waybillFreeText2;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillFreeText3
     */
    @JsonProperty("waybillFreeText3")
    public String getWaybillFreeText3() {
        return waybillFreeText3;
    }

    /**
     * 
     * @param waybillFreeText3
     *     The waybillFreeText3
     */
    @JsonProperty("waybillFreeText3")
    public void setWaybillFreeText3(String waybillFreeText3) {
        this.waybillFreeText3 = waybillFreeText3;
    }

    public Shipment withWaybillFreeText3(String waybillFreeText3) {
        this.waybillFreeText3 = waybillFreeText3;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillFreeText4
     */
    @JsonProperty("waybillFreeText4")
    public String getWaybillFreeText4() {
        return waybillFreeText4;
    }

    /**
     * 
     * @param waybillFreeText4
     *     The waybillFreeText4
     */
    @JsonProperty("waybillFreeText4")
    public void setWaybillFreeText4(String waybillFreeText4) {
        this.waybillFreeText4 = waybillFreeText4;
    }

    public Shipment withWaybillFreeText4(String waybillFreeText4) {
        this.waybillFreeText4 = waybillFreeText4;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillFreeText5
     */
    @JsonProperty("waybillFreeText5")
    public String getWaybillFreeText5() {
        return waybillFreeText5;
    }

    /**
     * 
     * @param waybillFreeText5
     *     The waybillFreeText5
     */
    @JsonProperty("waybillFreeText5")
    public void setWaybillFreeText5(String waybillFreeText5) {
        this.waybillFreeText5 = waybillFreeText5;
    }

    public Shipment withWaybillFreeText5(String waybillFreeText5) {
        this.waybillFreeText5 = waybillFreeText5;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillSpecialAgreement
     */
    @JsonProperty("waybillSpecialAgreement")
    public String getWaybillSpecialAgreement() {
        return waybillSpecialAgreement;
    }

    /**
     * 
     * @param waybillSpecialAgreement
     *     The waybillSpecialAgreement
     */
    @JsonProperty("waybillSpecialAgreement")
    public void setWaybillSpecialAgreement(String waybillSpecialAgreement) {
        this.waybillSpecialAgreement = waybillSpecialAgreement;
    }

    public Shipment withWaybillSpecialAgreement(String waybillSpecialAgreement) {
        this.waybillSpecialAgreement = waybillSpecialAgreement;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillDocuments1
     */
    @JsonProperty("waybillDocuments1")
    public String getWaybillDocuments1() {
        return waybillDocuments1;
    }

    /**
     * 
     * @param waybillDocuments1
     *     The waybillDocuments1
     */
    @JsonProperty("waybillDocuments1")
    public void setWaybillDocuments1(String waybillDocuments1) {
        this.waybillDocuments1 = waybillDocuments1;
    }

    public Shipment withWaybillDocuments1(String waybillDocuments1) {
        this.waybillDocuments1 = waybillDocuments1;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillDocuments2
     */
    @JsonProperty("waybillDocuments2")
    public String getWaybillDocuments2() {
        return waybillDocuments2;
    }

    /**
     * 
     * @param waybillDocuments2
     *     The waybillDocuments2
     */
    @JsonProperty("waybillDocuments2")
    public void setWaybillDocuments2(String waybillDocuments2) {
        this.waybillDocuments2 = waybillDocuments2;
    }

    public Shipment withWaybillDocuments2(String waybillDocuments2) {
        this.waybillDocuments2 = waybillDocuments2;
        return this;
    }

    /**
     * 
     * @return
     *     The waybillCondition
     */
    @JsonProperty("waybillCondition")
    public String getWaybillCondition() {
        return waybillCondition;
    }

    /**
     * 
     * @param waybillCondition
     *     The waybillCondition
     */
    @JsonProperty("waybillCondition")
    public void setWaybillCondition(String waybillCondition) {
        this.waybillCondition = waybillCondition;
    }

    public Shipment withWaybillCondition(String waybillCondition) {
        this.waybillCondition = waybillCondition;
        return this;
    }

    /**
     * 
     * @return
     *     The termsCode
     */
    @JsonProperty("termsCode")
    public String getTermsCode() {
        return termsCode;
    }

    /**
     * 
     * @param termsCode
     *     The termsCode
     */
    @JsonProperty("termsCode")
    public void setTermsCode(String termsCode) {
        this.termsCode = termsCode;
    }

    public Shipment withTermsCode(String termsCode) {
        this.termsCode = termsCode;
        return this;
    }

    /**
     * 
     * @return
     *     The termsLocation
     */
    @JsonProperty("termsLocation")
    public String getTermsLocation() {
        return termsLocation;
    }

    /**
     * 
     * @param termsLocation
     *     The termsLocation
     */
    @JsonProperty("termsLocation")
    public void setTermsLocation(String termsLocation) {
        this.termsLocation = termsLocation;
    }

    public Shipment withTermsLocation(String termsLocation) {
        this.termsLocation = termsLocation;
        return this;
    }

    /**
     * 
     * @return
     *     The termsLocationIdentifier
     */
    @JsonProperty("termsLocationIdentifier")
    public String getTermsLocationIdentifier() {
        return termsLocationIdentifier;
    }

    /**
     * 
     * @param termsLocationIdentifier
     *     The termsLocationIdentifier
     */
    @JsonProperty("termsLocationIdentifier")
    public void setTermsLocationIdentifier(String termsLocationIdentifier) {
        this.termsLocationIdentifier = termsLocationIdentifier;
    }

    public Shipment withTermsLocationIdentifier(String termsLocationIdentifier) {
        this.termsLocationIdentifier = termsLocationIdentifier;
        return this;
    }

    /**
     * 
     * @return
     *     The printSet
     */
    @JsonProperty("printSet")
    public List<String> getPrintSet() {
        return printSet;
    }

    /**
     * 
     * @param printSet
     *     The printSet
     */
    @JsonProperty("printSet")
    public void setPrintSet(List<String> printSet) {
        this.printSet = printSet;
    }

    public Shipment withPrintSet(List<String> printSet) {
        this.printSet = printSet;
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

    public Shipment withShipDate(Date shipDate) {
        this.shipDate = shipDate;
        return this;
    }

    /**
     * 
     * @return
     *     The pickupTime
     */
    @JsonProperty("pickupTime")
    public Date getPickupTime() {
        return pickupTime;
    }

    /**
     * 
     * @param pickupTime
     *     The pickupTime
     */
    @JsonProperty("pickupTime")
    public void setPickupTime(Date pickupTime) {
        this.pickupTime = pickupTime;
    }

    public Shipment withPickupTime(Date pickupTime) {
        this.pickupTime = pickupTime;
        return this;
    }

    /**
     * 
     * @return
     *     The deliveryDate
     */
    @JsonProperty("deliveryDate")
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * 
     * @param deliveryDate
     *     The deliveryDate
     */
    @JsonProperty("deliveryDate")
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Shipment withDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
        return this;
    }

    /**
     * 
     * @return
     *     The deliveryTimeEarliest
     */
    @JsonProperty("deliveryTimeEarliest")
    public String getDeliveryTimeEarliest() {
        return deliveryTimeEarliest;
    }

    /**
     * 
     * @param deliveryTimeEarliest
     *     The deliveryTimeEarliest
     */
    @JsonProperty("deliveryTimeEarliest")
    public void setDeliveryTimeEarliest(String deliveryTimeEarliest) {
        this.deliveryTimeEarliest = deliveryTimeEarliest;
    }

    public Shipment withDeliveryTimeEarliest(String deliveryTimeEarliest) {
        this.deliveryTimeEarliest = deliveryTimeEarliest;
        return this;
    }

    /**
     * 
     * @return
     *     The deliveryTimeLastest
     */
    @JsonProperty("deliveryTimeLastest")
    public String getDeliveryTimeLastest() {
        return deliveryTimeLastest;
    }

    /**
     * 
     * @param deliveryTimeLastest
     *     The deliveryTimeLastest
     */
    @JsonProperty("deliveryTimeLastest")
    public void setDeliveryTimeLastest(String deliveryTimeLastest) {
        this.deliveryTimeLastest = deliveryTimeLastest;
    }

    public Shipment withDeliveryTimeLastest(String deliveryTimeLastest) {
        this.deliveryTimeLastest = deliveryTimeLastest;
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

    public Shipment withShipmentNo(String shipmentNo) {
        this.shipmentNo = shipmentNo;
        return this;
    }

    /**
     * 
     * @return
     *     The ediForward
     */
    @JsonProperty("ediForward")
    public Boolean getEdiForward() {
        return ediForward;
    }

    /**
     * 
     * @param ediForward
     *     The ediForward
     */
    @JsonProperty("ediForward")
    public void setEdiForward(Boolean ediForward) {
        this.ediForward = ediForward;
    }

    public Shipment withEdiForward(Boolean ediForward) {
        this.ediForward = ediForward;
        return this;
    }

    /**
     * 
     * @return
     *     The tplFormat
     */
    @JsonProperty("tplFormat")
    public Boolean getTplFormat() {
        return tplFormat;
    }

    /**
     * 
     * @param tplFormat
     *     The tplFormat
     */
    @JsonProperty("tplFormat")
    public void setTplFormat(Boolean tplFormat) {
        this.tplFormat = tplFormat;
    }

    public Shipment withTplFormat(Boolean tplFormat) {
        this.tplFormat = tplFormat;
        return this;
    }

    /**
     * 
     * @return
     *     The pdfInsert
     */
    @JsonProperty("pdfInsert")
    public String getPdfInsert() {
        return pdfInsert;
    }

    /**
     * 
     * @param pdfInsert
     *     The pdfInsert
     */
    @JsonProperty("pdfInsert")
    public void setPdfInsert(String pdfInsert) {
        this.pdfInsert = pdfInsert;
    }

    public Shipment withPdfInsert(String pdfInsert) {
        this.pdfInsert = pdfInsert;
        return this;
    }

    /**
     * 
     * @return
     *     The deliveryInstruction
     */
    @JsonProperty("deliveryInstruction")
    public String getDeliveryInstruction() {
        return deliveryInstruction;
    }

    /**
     * 
     * @param deliveryInstruction
     *     The deliveryInstruction
     */
    @JsonProperty("deliveryInstruction")
    public void setDeliveryInstruction(String deliveryInstruction) {
        this.deliveryInstruction = deliveryInstruction;
    }

    public Shipment withDeliveryInstruction(String deliveryInstruction) {
        this.deliveryInstruction = deliveryInstruction;
        return this;
    }

    /**
     * 
     * @return
     *     The customLabelText1
     */
    @JsonProperty("customLabelText1")
    public String getCustomLabelText1() {
        return customLabelText1;
    }

    /**
     * 
     * @param customLabelText1
     *     The customLabelText1
     */
    @JsonProperty("customLabelText1")
    public void setCustomLabelText1(String customLabelText1) {
        this.customLabelText1 = customLabelText1;
    }

    public Shipment withCustomLabelText1(String customLabelText1) {
        this.customLabelText1 = customLabelText1;
        return this;
    }

    /**
     * 
     * @return
     *     The customLabelText2
     */
    @JsonProperty("customLabelText2")
    public String getCustomLabelText2() {
        return customLabelText2;
    }

    /**
     * 
     * @param customLabelText2
     *     The customLabelText2
     */
    @JsonProperty("customLabelText2")
    public void setCustomLabelText2(String customLabelText2) {
        this.customLabelText2 = customLabelText2;
    }

    public Shipment withCustomLabelText2(String customLabelText2) {
        this.customLabelText2 = customLabelText2;
        return this;
    }

    /**
     * 
     * @return
     *     The customLabelText3
     */
    @JsonProperty("customLabelText3")
    public String getCustomLabelText3() {
        return customLabelText3;
    }

    /**
     * 
     * @param customLabelText3
     *     The customLabelText3
     */
    @JsonProperty("customLabelText3")
    public void setCustomLabelText3(String customLabelText3) {
        this.customLabelText3 = customLabelText3;
    }

    public Shipment withCustomLabelText3(String customLabelText3) {
        this.customLabelText3 = customLabelText3;
        return this;
    }

    /**
     * 
     * @return
     *     The customLabelText4
     */
    @JsonProperty("customLabelText4")
    public String getCustomLabelText4() {
        return customLabelText4;
    }

    /**
     * 
     * @param customLabelText4
     *     The customLabelText4
     */
    @JsonProperty("customLabelText4")
    public void setCustomLabelText4(String customLabelText4) {
        this.customLabelText4 = customLabelText4;
    }

    public Shipment withCustomLabelText4(String customLabelText4) {
        this.customLabelText4 = customLabelText4;
        return this;
    }

    /**
     * 
     * @return
     *     The customLabelText5
     */
    @JsonProperty("customLabelText5")
    public String getCustomLabelText5() {
        return customLabelText5;
    }

    /**
     * 
     * @param customLabelText5
     *     The customLabelText5
     */
    @JsonProperty("customLabelText5")
    public void setCustomLabelText5(String customLabelText5) {
        this.customLabelText5 = customLabelText5;
    }

    public Shipment withCustomLabelText5(String customLabelText5) {
        this.customLabelText5 = customLabelText5;
        return this;
    }

    /**
     * 
     * @return
     *     The customLabelText6
     */
    @JsonProperty("customLabelText6")
    public String getCustomLabelText6() {
        return customLabelText6;
    }

    /**
     * 
     * @param customLabelText6
     *     The customLabelText6
     */
    @JsonProperty("customLabelText6")
    public void setCustomLabelText6(String customLabelText6) {
        this.customLabelText6 = customLabelText6;
    }

    public Shipment withCustomLabelText6(String customLabelText6) {
        this.customLabelText6 = customLabelText6;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The service
     */
    @JsonProperty("service")
    public Service getService() {
        return service;
    }

    /**
     * 
     * (Required)
     * 
     * @param service
     *     The service
     */
    @JsonProperty("service")
    public void setService(Service service) {
        this.service = service;
    }

    public Shipment withService(Service service) {
        this.service = service;
        return this;
    }

    /**
     * 
     * (Required)
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
     * (Required)
     * 
     * @param parcels
     *     The parcels
     */
    @JsonProperty("parcels")
    public void setParcels(List<Parcel> parcels) {
        this.parcels = parcels;
    }

    public Shipment withParcels(List<Parcel> parcels) {
        this.parcels = parcels;
        return this;
    }

    /**
     * 
     * @return
     *     The customsDeclaration
     */
    @JsonProperty("customsDeclaration")
    public CustomsDeclaration getCustomsDeclaration() {
        return customsDeclaration;
    }

    /**
     * 
     * @param customsDeclaration
     *     The customsDeclaration
     */
    @JsonProperty("customsDeclaration")
    public void setCustomsDeclaration(CustomsDeclaration customsDeclaration) {
        this.customsDeclaration = customsDeclaration;
    }

    public Shipment withCustomsDeclaration(CustomsDeclaration customsDeclaration) {
        this.customsDeclaration = customsDeclaration;
        return this;
    }

    /**
     * 
     * @return
     *     The options
     */
    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    /**
     * 
     * @param options
     *     The options
     */
    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Shipment withOptions(List<Option> options) {
        this.options = options;
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

    public Shipment withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
