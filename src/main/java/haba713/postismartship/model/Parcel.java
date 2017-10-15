
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
    "valuePerParcel",
    "copies",
    "marking",
    "packageCode",
    "packageText",
    "weight",
    "volume",
    "length",
    "width",
    "height",
    "loadingMeters",
    "itemNo",
    "contents",
    "reference",
    "customLabelText1",
    "customLabelText2",
    "customLabelText3",
    "customLabelText4",
    "customLabelText5",
    "customLabelText6",
    "dangerousGoods",
    "parcelNos",
    "articles"
})
public class Parcel {

    @JsonProperty("valuePerParcel")
    private Boolean valuePerParcel;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("copies")
    private Integer copies;
    @JsonProperty("marking")
    private String marking;
    @JsonProperty("packageCode")
    private String packageCode;
    @JsonProperty("packageText")
    private String packageText;
    @JsonProperty("weight")
    private Double weight;
    @JsonProperty("volume")
    private Double volume;
    @JsonProperty("length")
    private Double length;
    @JsonProperty("width")
    private Double width;
    @JsonProperty("height")
    private Double height;
    @JsonProperty("loadingMeters")
    private Double loadingMeters;
    @JsonProperty("itemNo")
    private String itemNo;
    @JsonProperty("contents")
    private String contents;
    @JsonProperty("reference")
    private String reference;
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
    @JsonProperty("dangerousGoods")
    private DangerousGoods dangerousGoods;
    @JsonProperty("parcelNos")
    private List<String> parcelNos = new ArrayList<String>();
    @JsonProperty("articles")
    private List<Article> articles = new ArrayList<Article>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The valuePerParcel
     */
    @JsonProperty("valuePerParcel")
    public Boolean getValuePerParcel() {
        return valuePerParcel;
    }

    /**
     * 
     * @param valuePerParcel
     *     The valuePerParcel
     */
    @JsonProperty("valuePerParcel")
    public void setValuePerParcel(Boolean valuePerParcel) {
        this.valuePerParcel = valuePerParcel;
    }

    public Parcel withValuePerParcel(Boolean valuePerParcel) {
        this.valuePerParcel = valuePerParcel;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The copies
     */
    @JsonProperty("copies")
    public Integer getCopies() {
        return copies;
    }

    /**
     * 
     * (Required)
     * 
     * @param copies
     *     The copies
     */
    @JsonProperty("copies")
    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public Parcel withCopies(Integer copies) {
        this.copies = copies;
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

    public Parcel withMarking(String marking) {
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

    public Parcel withPackageCode(String packageCode) {
        this.packageCode = packageCode;
        return this;
    }

    /**
     * 
     * @return
     *     The packageText
     */
    @JsonProperty("packageText")
    public String getPackageText() {
        return packageText;
    }

    /**
     * 
     * @param packageText
     *     The packageText
     */
    @JsonProperty("packageText")
    public void setPackageText(String packageText) {
        this.packageText = packageText;
    }

    public Parcel withPackageText(String packageText) {
        this.packageText = packageText;
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

    public Parcel withWeight(Double weight) {
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

    public Parcel withVolume(Double volume) {
        this.volume = volume;
        return this;
    }

    /**
     * 
     * @return
     *     The length
     */
    @JsonProperty("length")
    public Double getLength() {
        return length;
    }

    /**
     * 
     * @param length
     *     The length
     */
    @JsonProperty("length")
    public void setLength(Double length) {
        this.length = length;
    }

    public Parcel withLength(Double length) {
        this.length = length;
        return this;
    }

    /**
     * 
     * @return
     *     The width
     */
    @JsonProperty("width")
    public Double getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    @JsonProperty("width")
    public void setWidth(Double width) {
        this.width = width;
    }

    public Parcel withWidth(Double width) {
        this.width = width;
        return this;
    }

    /**
     * 
     * @return
     *     The height
     */
    @JsonProperty("height")
    public Double getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    @JsonProperty("height")
    public void setHeight(Double height) {
        this.height = height;
    }

    public Parcel withHeight(Double height) {
        this.height = height;
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

    public Parcel withLoadingMeters(Double loadingMeters) {
        this.loadingMeters = loadingMeters;
        return this;
    }

    /**
     * 
     * @return
     *     The itemNo
     */
    @JsonProperty("itemNo")
    public String getItemNo() {
        return itemNo;
    }

    /**
     * 
     * @param itemNo
     *     The itemNo
     */
    @JsonProperty("itemNo")
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public Parcel withItemNo(String itemNo) {
        this.itemNo = itemNo;
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

    public Parcel withContents(String contents) {
        this.contents = contents;
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

    public Parcel withReference(String reference) {
        this.reference = reference;
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

    public Parcel withCustomLabelText1(String customLabelText1) {
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

    public Parcel withCustomLabelText2(String customLabelText2) {
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

    public Parcel withCustomLabelText3(String customLabelText3) {
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

    public Parcel withCustomLabelText4(String customLabelText4) {
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

    public Parcel withCustomLabelText5(String customLabelText5) {
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

    public Parcel withCustomLabelText6(String customLabelText6) {
        this.customLabelText6 = customLabelText6;
        return this;
    }

    /**
     * 
     * @return
     *     The dangerousGoods
     */
    @JsonProperty("dangerousGoods")
    public DangerousGoods getDangerousGoods() {
        return dangerousGoods;
    }

    /**
     * 
     * @param dangerousGoods
     *     The dangerousGoods
     */
    @JsonProperty("dangerousGoods")
    public void setDangerousGoods(DangerousGoods dangerousGoods) {
        this.dangerousGoods = dangerousGoods;
    }

    public Parcel withDangerousGoods(DangerousGoods dangerousGoods) {
        this.dangerousGoods = dangerousGoods;
        return this;
    }

    /**
     * 
     * @return
     *     The parcelNos
     */
    @JsonProperty("parcelNos")
    public List<String> getParcelNos() {
        return parcelNos;
    }

    /**
     * 
     * @param parcelNos
     *     The parcelNos
     */
    @JsonProperty("parcelNos")
    public void setParcelNos(List<String> parcelNos) {
        this.parcelNos = parcelNos;
    }

    public Parcel withParcelNos(List<String> parcelNos) {
        this.parcelNos = parcelNos;
        return this;
    }

    /**
     * 
     * @return
     *     The articles
     */
    @JsonProperty("articles")
    public List<Article> getArticles() {
        return articles;
    }

    /**
     * 
     * @param articles
     *     The articles
     */
    @JsonProperty("articles")
    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public Parcel withArticles(List<Article> articles) {
        this.articles = articles;
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

    public Parcel withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
