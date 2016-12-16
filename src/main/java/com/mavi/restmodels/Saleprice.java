package com.mavi.restmodels;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "discountcode",
        "price",
        "startdate",
        "enddate"
})
public class Saleprice {

    @JsonProperty("discountcode")
    private String discountcode;
    @JsonProperty("price")
    private String price;
    @JsonProperty("startdate")
    private String startdate;
    @JsonProperty("enddate")
    private String enddate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The discountcode
     */
    @JsonProperty("discountcode")
    public String getDiscountcode() {
        return discountcode;
    }

    /**
     * @param discountcode The discountcode
     */
    @JsonProperty("discountcode")
    public void setDiscountcode(String discountcode) {
        this.discountcode = discountcode;
    }

    /**
     * @return The price
     */
    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    /**
     * @param price The price
     */
    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return The startdate
     */
    @JsonProperty("startdate")
    public String getStartdate() {
        return startdate;
    }

    /**
     * @param startdate The startdate
     */
    @JsonProperty("startdate")
    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    /**
     * @return The enddate
     */
    @JsonProperty("enddate")
    public String getEnddate() {
        return enddate;
    }

    /**
     * @param enddate The enddate
     */
    @JsonProperty("enddate")
    public void setEnddate(String enddate) {
        this.enddate = enddate;
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