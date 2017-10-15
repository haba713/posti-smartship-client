
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
    "valuesPerItem",
    "statNo",
    "subStatNo1",
    "subStatNo2",
    "procedure",
    "value",
    "goodsMark1",
    "goodsMark2",
    "goodsMark3",
    "goodsMark4",
    "goodsMark5",
    "goodsMark6",
    "contents",
    "copies",
    "netWeight",
    "sourceCountryCode",
    "otherUnit",
    "otherQuantity"
})
public class Line {

    @JsonProperty("valuesPerItem")
    private Boolean valuesPerItem;
    @JsonProperty("statNo")
    private String statNo;
    @JsonProperty("subStatNo1")
    private String subStatNo1;
    @JsonProperty("subStatNo2")
    private String subStatNo2;
    @JsonProperty("procedure")
    private String procedure;
    @JsonProperty("value")
    private Double value;
    @JsonProperty("goodsMark1")
    private String goodsMark1;
    @JsonProperty("goodsMark2")
    private String goodsMark2;
    @JsonProperty("goodsMark3")
    private String goodsMark3;
    @JsonProperty("goodsMark4")
    private String goodsMark4;
    @JsonProperty("goodsMark5")
    private String goodsMark5;
    @JsonProperty("goodsMark6")
    private String goodsMark6;
    @JsonProperty("contents")
    private String contents;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("copies")
    private Integer copies;
    @JsonProperty("netWeight")
    private Double netWeight;
    @JsonProperty("sourceCountryCode")
    private String sourceCountryCode;
    @JsonProperty("otherUnit")
    private String otherUnit;
    @JsonProperty("otherQuantity")
    private Double otherQuantity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The valuesPerItem
     */
    @JsonProperty("valuesPerItem")
    public Boolean getValuesPerItem() {
        return valuesPerItem;
    }

    /**
     * 
     * @param valuesPerItem
     *     The valuesPerItem
     */
    @JsonProperty("valuesPerItem")
    public void setValuesPerItem(Boolean valuesPerItem) {
        this.valuesPerItem = valuesPerItem;
    }

    public Line withValuesPerItem(Boolean valuesPerItem) {
        this.valuesPerItem = valuesPerItem;
        return this;
    }

    /**
     * 
     * @return
     *     The statNo
     */
    @JsonProperty("statNo")
    public String getStatNo() {
        return statNo;
    }

    /**
     * 
     * @param statNo
     *     The statNo
     */
    @JsonProperty("statNo")
    public void setStatNo(String statNo) {
        this.statNo = statNo;
    }

    public Line withStatNo(String statNo) {
        this.statNo = statNo;
        return this;
    }

    /**
     * 
     * @return
     *     The subStatNo1
     */
    @JsonProperty("subStatNo1")
    public String getSubStatNo1() {
        return subStatNo1;
    }

    /**
     * 
     * @param subStatNo1
     *     The subStatNo1
     */
    @JsonProperty("subStatNo1")
    public void setSubStatNo1(String subStatNo1) {
        this.subStatNo1 = subStatNo1;
    }

    public Line withSubStatNo1(String subStatNo1) {
        this.subStatNo1 = subStatNo1;
        return this;
    }

    /**
     * 
     * @return
     *     The subStatNo2
     */
    @JsonProperty("subStatNo2")
    public String getSubStatNo2() {
        return subStatNo2;
    }

    /**
     * 
     * @param subStatNo2
     *     The subStatNo2
     */
    @JsonProperty("subStatNo2")
    public void setSubStatNo2(String subStatNo2) {
        this.subStatNo2 = subStatNo2;
    }

    public Line withSubStatNo2(String subStatNo2) {
        this.subStatNo2 = subStatNo2;
        return this;
    }

    /**
     * 
     * @return
     *     The procedure
     */
    @JsonProperty("procedure")
    public String getProcedure() {
        return procedure;
    }

    /**
     * 
     * @param procedure
     *     The procedure
     */
    @JsonProperty("procedure")
    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public Line withProcedure(String procedure) {
        this.procedure = procedure;
        return this;
    }

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    public Line withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * 
     * @return
     *     The goodsMark1
     */
    @JsonProperty("goodsMark1")
    public String getGoodsMark1() {
        return goodsMark1;
    }

    /**
     * 
     * @param goodsMark1
     *     The goodsMark1
     */
    @JsonProperty("goodsMark1")
    public void setGoodsMark1(String goodsMark1) {
        this.goodsMark1 = goodsMark1;
    }

    public Line withGoodsMark1(String goodsMark1) {
        this.goodsMark1 = goodsMark1;
        return this;
    }

    /**
     * 
     * @return
     *     The goodsMark2
     */
    @JsonProperty("goodsMark2")
    public String getGoodsMark2() {
        return goodsMark2;
    }

    /**
     * 
     * @param goodsMark2
     *     The goodsMark2
     */
    @JsonProperty("goodsMark2")
    public void setGoodsMark2(String goodsMark2) {
        this.goodsMark2 = goodsMark2;
    }

    public Line withGoodsMark2(String goodsMark2) {
        this.goodsMark2 = goodsMark2;
        return this;
    }

    /**
     * 
     * @return
     *     The goodsMark3
     */
    @JsonProperty("goodsMark3")
    public String getGoodsMark3() {
        return goodsMark3;
    }

    /**
     * 
     * @param goodsMark3
     *     The goodsMark3
     */
    @JsonProperty("goodsMark3")
    public void setGoodsMark3(String goodsMark3) {
        this.goodsMark3 = goodsMark3;
    }

    public Line withGoodsMark3(String goodsMark3) {
        this.goodsMark3 = goodsMark3;
        return this;
    }

    /**
     * 
     * @return
     *     The goodsMark4
     */
    @JsonProperty("goodsMark4")
    public String getGoodsMark4() {
        return goodsMark4;
    }

    /**
     * 
     * @param goodsMark4
     *     The goodsMark4
     */
    @JsonProperty("goodsMark4")
    public void setGoodsMark4(String goodsMark4) {
        this.goodsMark4 = goodsMark4;
    }

    public Line withGoodsMark4(String goodsMark4) {
        this.goodsMark4 = goodsMark4;
        return this;
    }

    /**
     * 
     * @return
     *     The goodsMark5
     */
    @JsonProperty("goodsMark5")
    public String getGoodsMark5() {
        return goodsMark5;
    }

    /**
     * 
     * @param goodsMark5
     *     The goodsMark5
     */
    @JsonProperty("goodsMark5")
    public void setGoodsMark5(String goodsMark5) {
        this.goodsMark5 = goodsMark5;
    }

    public Line withGoodsMark5(String goodsMark5) {
        this.goodsMark5 = goodsMark5;
        return this;
    }

    /**
     * 
     * @return
     *     The goodsMark6
     */
    @JsonProperty("goodsMark6")
    public String getGoodsMark6() {
        return goodsMark6;
    }

    /**
     * 
     * @param goodsMark6
     *     The goodsMark6
     */
    @JsonProperty("goodsMark6")
    public void setGoodsMark6(String goodsMark6) {
        this.goodsMark6 = goodsMark6;
    }

    public Line withGoodsMark6(String goodsMark6) {
        this.goodsMark6 = goodsMark6;
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

    public Line withContents(String contents) {
        this.contents = contents;
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

    public Line withCopies(Integer copies) {
        this.copies = copies;
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

    public Line withNetWeight(Double netWeight) {
        this.netWeight = netWeight;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceCountryCode
     */
    @JsonProperty("sourceCountryCode")
    public String getSourceCountryCode() {
        return sourceCountryCode;
    }

    /**
     * 
     * @param sourceCountryCode
     *     The sourceCountryCode
     */
    @JsonProperty("sourceCountryCode")
    public void setSourceCountryCode(String sourceCountryCode) {
        this.sourceCountryCode = sourceCountryCode;
    }

    public Line withSourceCountryCode(String sourceCountryCode) {
        this.sourceCountryCode = sourceCountryCode;
        return this;
    }

    /**
     * 
     * @return
     *     The otherUnit
     */
    @JsonProperty("otherUnit")
    public String getOtherUnit() {
        return otherUnit;
    }

    /**
     * 
     * @param otherUnit
     *     The otherUnit
     */
    @JsonProperty("otherUnit")
    public void setOtherUnit(String otherUnit) {
        this.otherUnit = otherUnit;
    }

    public Line withOtherUnit(String otherUnit) {
        this.otherUnit = otherUnit;
        return this;
    }

    /**
     * 
     * @return
     *     The otherQuantity
     */
    @JsonProperty("otherQuantity")
    public Double getOtherQuantity() {
        return otherQuantity;
    }

    /**
     * 
     * @param otherQuantity
     *     The otherQuantity
     */
    @JsonProperty("otherQuantity")
    public void setOtherQuantity(Double otherQuantity) {
        this.otherQuantity = otherQuantity;
    }

    public Line withOtherQuantity(Double otherQuantity) {
        this.otherQuantity = otherQuantity;
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

    public Line withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
