package com.shopify.api.resources;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonRootName;

import com.shopify.api.common.AbstractShopifyResource;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Accessors(chain = true)
@JsonRootName("variant")
//note: these should be able to be private with the getter and setter, but it's throwing an error that way (see product.java for example), so I've changed them to public for now
public class Variant extends AbstractShopifyResource {
    public long productId;
    public String compareAtPrice;
    public String fulfillmentService;
    public int grams;
    public String inventoryManagement;
    public String inventoryPolicy;
    public int inventoryQuantity;
    public int oldInventoryQuantity;
    public int inventoryQuantityAdjustment;
    public String option1;
    public String option2;
    public String option3;
    public long position;
    public BigDecimal price;
    public boolean requiresShipping;
    public String sku;
    public boolean taxable;
    public String title;
    public String barcode;
    public String weightUnit;
    public BigDecimal weight;
    public long imageId;
}
