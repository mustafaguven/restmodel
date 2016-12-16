package com.mavi.restmodels;

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
        "barcode",
        "sku",
        "description",
        "size",
        "length",
        "retailprice",
        "currentseason",
        "saleprices",
        "promotionID",
        "tags"
})
public class Product {

    @JsonProperty("barcode")
    private String barcode;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("description")
    private String description;
    @JsonProperty("size")
    private String size;
    @JsonProperty("length")
    private String length;
    @JsonProperty("retailprice")
    private String retailprice;
    @JsonProperty("currentseason")
    private String currentseason;
    @JsonProperty("saleprices")
    private List<Saleprice> saleprices = null;
    @JsonProperty("promotionID")
    private String promotionID;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The barcode
     */
    @JsonProperty("barcode")
    public String getBarcode() {
        return barcode;
    }

    /**
     * @param barcode The barcode
     */
    @JsonProperty("barcode")
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * @return The sku
     */
    @JsonProperty("sku")
    public String getSku() {
        return sku;
    }

    /**
     * @param sku The sku
     */
    @JsonProperty("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * @return The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The size
     */
    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    /**
     * @param size The size
     */
    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return The length
     */
    @JsonProperty("length")
    public String getLength() {
        return length;
    }

    /**
     * @param length The length
     */
    @JsonProperty("length")
    public void setLength(String length) {
        this.length = length;
    }

    /**
     * @return The retailprice
     */
    @JsonProperty("retailprice")
    public String getRetailprice() {
        return retailprice;
    }

    /**
     * @param retailprice The retailprice
     */
    @JsonProperty("retailprice")
    public void setRetailprice(String retailprice) {
        this.retailprice = retailprice;
    }

    /**
     * @return The currentseason
     */
    @JsonProperty("currentseason")
    public String getCurrentseason() {
        return currentseason;
    }

    /**
     * @param currentseason The currentseason
     */
    @JsonProperty("currentseason")
    public void setCurrentseason(String currentseason) {
        this.currentseason = currentseason;
    }

    /**
     * @return The saleprices
     */
    @JsonProperty("saleprices")
    public List<Saleprice> getSaleprices() {
        return saleprices;
    }

    /**
     * @param saleprices The saleprices
     */
    @JsonProperty("saleprices")
    public void setSaleprices(List<Saleprice> saleprices) {
        this.saleprices = saleprices;
    }

    /**
     * @return The promotionID
     */
    @JsonProperty("promotionID")
    public String getPromotionID() {
        return promotionID;
    }

    /**
     * @param promotionID The promotionID
     */
    @JsonProperty("promotionID")
    public void setPromotionID(String promotionID) {
        this.promotionID = promotionID;
    }

    /**
     * @return The tags
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * @param tags The tags
     */
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
