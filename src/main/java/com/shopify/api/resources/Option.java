package com.shopify.api.resources;

import com.shopify.api.common.AbstractShopifyResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonRootName;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Accessors(chain = true)
@JsonRootName("option")
//note: these should be able to be private with the getter and setter, but it's throwing an error that way (see product.java for example), so I've changed them to public for now
public class Option extends AbstractShopifyResource {
    public String name;
    public long position;
    public long productId;
    public String[] values;
}
