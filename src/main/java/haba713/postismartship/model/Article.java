
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
    "articleNo",
    "count",
    "name",
    "enot",
    "price",
    "currencyCode",
    "weight",
    "volume",
    "loadingMeters",
    "contents",
    "marking",
    "packageCode",
    "customsStatNo",
    "customsSubStatNo1",
    "customsOtherUnit",
    "customsOtherQuantity",
    "customsValue",
    "customsContents",
    "customsNetWeight",
    "customsSourceCountryCode",
    "dangerousGoods"
})
public class Article {

    @JsonProperty("articleNo")
    private String articleNo;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("name")
    private String name;
    @JsonProperty("enot")
    private Boolean enot;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("weight")
    private Double weight;
    @JsonProperty("volume")
    private Double volume;
    @JsonProperty("loadingMeters")
    private Double loadingMeters;
    @JsonProperty("contents")
    private String contents;
    @JsonProperty("marking")
    private String marking;
    @JsonProperty("packageCode")
    private String packageCode;
    @JsonProperty("customsStatNo")
    private String customsStatNo;
    @JsonProperty("customsSubStatNo1")
    private String customsSubStatNo1;
    @JsonProperty("customsOtherUnit")
    private String customsOtherUnit;
    @JsonProperty("customsOtherQuantity")
    private Double customsOtherQuantity;
    @JsonProperty("customsValue")
    private Double customsValue;
    @JsonProperty("customsContents")
    private String customsContents;
    @JsonProperty("customsNetWeight")
    private Double customsNetWeight;
    @JsonProperty("customsSourceCountryCode")
    private String customsSourceCountryCode;
    @JsonProperty("dangerousGoods")
    private DangerousGoods_ dangerousGoods;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The articleNo
     */
    @JsonProperty("articleNo")
    public String getArticleNo() {
        return articleNo;
    }

    /**
     * 
     * @param articleNo
     *     The articleNo
     */
    @JsonProperty("articleNo")
    public void setArticleNo(String articleNo) {
        this.articleNo = articleNo;
    }

    public Article withArticleNo(String articleNo) {
        this.articleNo = articleNo;
        return this;
    }

    /**
     * 
     * @return
     *     The count
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public Article withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Article withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The enot
     */
    @JsonProperty("enot")
    public Boolean getEnot() {
        return enot;
    }

    /**
     * 
     * @param enot
     *     The enot
     */
    @JsonProperty("enot")
    public void setEnot(Boolean enot) {
        this.enot = enot;
    }

    public Article withEnot(Boolean enot) {
        this.enot = enot;
        return this;
    }

    /**
     * 
     * @return
     *     The price
     */
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    public Article withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * 
     * @return
     *     The currencyCode
     */
    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 
     * @param currencyCode
     *     The currencyCode
     */
    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Article withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * 
     * @return
     *     The weight
     */
    @JsonProperty("weight")
    public Double getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Article withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 
     * @return
     *     The volume
     */
    @JsonProperty("volume")
    public Double getVolume() {
        return volume;
    }

    /**
     * 
     * @param volume
     *     The volume
     */
    @JsonProperty("volume")
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Article withVolume(Double volume) {
        this.volume = volume;
        return this;
    }

    /**
     * 
     * @return
     *     The loadingMeters
     */
    @JsonProperty("loadingMeters")
    public Double getLoadingMeters() {
        return loadingMeters;
    }

    /**
     * 
     * @param loadingMeters
     *     The loadingMeters
     */
    @JsonProperty("loadingMeters")
    public void setLoadingMeters(Double loadingMeters) {
        this.loadingMeters = loadingMeters;
    }

    public Article withLoadingMeters(Double loadingMeters) {
        this.loadingMeters = loadingMeters;
        return this;
    }

    /**
     * 
     * @return
     *     The contents
     */
    @JsonProperty("contents")
    public String getContents() {
        return contents;
    }

    /**
     * 
     * @param contents
     *     The contents
     */
    @JsonProperty("contents")
    public void setContents(String contents) {
        this.contents = contents;
    }

    public Article withContents(String contents) {
        this.contents = contents;
        return this;
    }

    /**
     * 
     * @return
     *     The marking
     */
    @JsonProperty("marking")
    public String getMarking() {
        return marking;
    }

    /**
     * 
     * @param marking
     *     The marking
     */
    @JsonProperty("marking")
    public void setMarking(String marking) {
        this.marking = marking;
    }

    public Article withMarking(String marking) {
        this.marking = marking;
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

    public Article withPackageCode(String packageCode) {
        this.packageCode = packageCode;
        return this;
    }

    /**
     * 
     * @return
     *     The customsStatNo
     */
    @JsonProperty("customsStatNo")
    public String getCustomsStatNo() {
        return customsStatNo;
    }

    /**
     * 
     * @param customsStatNo
     *     The customsStatNo
     */
    @JsonProperty("customsStatNo")
    public void setCustomsStatNo(String customsStatNo) {
        this.customsStatNo = customsStatNo;
    }

    public Article withCustomsStatNo(String customsStatNo) {
        this.customsStatNo = customsStatNo;
        return this;
    }

    /**
     * 
     * @return
     *     The customsSubStatNo1
     */
    @JsonProperty("customsSubStatNo1")
    public String getCustomsSubStatNo1() {
        return customsSubStatNo1;
    }

    /**
     * 
     * @param customsSubStatNo1
     *     The customsSubStatNo1
     */
    @JsonProperty("customsSubStatNo1")
    public void setCustomsSubStatNo1(String customsSubStatNo1) {
        this.customsSubStatNo1 = customsSubStatNo1;
    }

    public Article withCustomsSubStatNo1(String customsSubStatNo1) {
        this.customsSubStatNo1 = customsSubStatNo1;
        return this;
    }

    /**
     * 
     * @return
     *     The customsOtherUnit
     */
    @JsonProperty("customsOtherUnit")
    public String getCustomsOtherUnit() {
        return customsOtherUnit;
    }

    /**
     * 
     * @param customsOtherUnit
     *     The customsOtherUnit
     */
    @JsonProperty("customsOtherUnit")
    public void setCustomsOtherUnit(String customsOtherUnit) {
        this.customsOtherUnit = customsOtherUnit;
    }

    public Article withCustomsOtherUnit(String customsOtherUnit) {
        this.customsOtherUnit = customsOtherUnit;
        return this;
    }

    /**
     * 
     * @return
     *     The customsOtherQuantity
     */
    @JsonProperty("customsOtherQuantity")
    public Double getCustomsOtherQuantity() {
        return customsOtherQuantity;
    }

    /**
     * 
     * @param customsOtherQuantity
     *     The customsOtherQuantity
     */
    @JsonProperty("customsOtherQuantity")
    public void setCustomsOtherQuantity(Double customsOtherQuantity) {
        this.customsOtherQuantity = customsOtherQuantity;
    }

    public Article withCustomsOtherQuantity(Double customsOtherQuantity) {
        this.customsOtherQuantity = customsOtherQuantity;
        return this;
    }

    /**
     * 
     * @return
     *     The customsValue
     */
    @JsonProperty("customsValue")
    public Double getCustomsValue() {
        return customsValue;
    }

    /**
     * 
     * @param customsValue
     *     The customsValue
     */
    @JsonProperty("customsValue")
    public void setCustomsValue(Double customsValue) {
        this.customsValue = customsValue;
    }

    public Article withCustomsValue(Double customsValue) {
        this.customsValue = customsValue;
        return this;
    }

    /**
     * 
     * @return
     *     The customsContents
     */
    @JsonProperty("customsContents")
    public String getCustomsContents() {
        return customsContents;
    }

    /**
     * 
     * @param customsContents
     *     The customsContents
     */
    @JsonProperty("customsContents")
    public void setCustomsContents(String customsContents) {
        this.customsContents = customsContents;
    }

    public Article withCustomsContents(String customsContents) {
        this.customsContents = customsContents;
        return this;
    }

    /**
     * 
     * @return
     *     The customsNetWeight
     */
    @JsonProperty("customsNetWeight")
    public Double getCustomsNetWeight() {
        return customsNetWeight;
    }

    /**
     * 
     * @param customsNetWeight
     *     The customsNetWeight
     */
    @JsonProperty("customsNetWeight")
    public void setCustomsNetWeight(Double customsNetWeight) {
        this.customsNetWeight = customsNetWeight;
    }

    public Article withCustomsNetWeight(Double customsNetWeight) {
        this.customsNetWeight = customsNetWeight;
        return this;
    }

    /**
     * 
     * @return
     *     The customsSourceCountryCode
     */
    @JsonProperty("customsSourceCountryCode")
    public String getCustomsSourceCountryCode() {
        return customsSourceCountryCode;
    }

    /**
     * 
     * @param customsSourceCountryCode
     *     The customsSourceCountryCode
     */
    @JsonProperty("customsSourceCountryCode")
    public void setCustomsSourceCountryCode(String customsSourceCountryCode) {
        this.customsSourceCountryCode = customsSourceCountryCode;
    }

    public Article withCustomsSourceCountryCode(String customsSourceCountryCode) {
        this.customsSourceCountryCode = customsSourceCountryCode;
        return this;
    }

    /**
     * 
     * @return
     *     The dangerousGoods
     */
    @JsonProperty("dangerousGoods")
    public DangerousGoods_ getDangerousGoods() {
        return dangerousGoods;
    }

    /**
     * 
     * @param dangerousGoods
     *     The dangerousGoods
     */
    @JsonProperty("dangerousGoods")
    public void setDangerousGoods(DangerousGoods_ dangerousGoods) {
        this.dangerousGoods = dangerousGoods;
    }

    public Article withDangerousGoods(DangerousGoods_ dangerousGoods) {
        this.dangerousGoods = dangerousGoods;
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

    public Article withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
