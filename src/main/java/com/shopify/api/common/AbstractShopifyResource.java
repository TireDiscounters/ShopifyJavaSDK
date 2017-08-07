package com.shopify.api.common;

import java.util.ArrayList;
import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;

import org.joda.time.DateTime;

import com.shopify.api.resources.Metafield;

@Getter
@Setter
@EqualsAndHashCode()
@ToString(callSuper = true)
@Accessors(chain = true)
//note: these should be able to be protected with the getter and setter, but it's throwing an error that way (see product.java for example), so I've changed them to public for now
public abstract class AbstractShopifyResource {
	public Long id;
	public DateTime createdAt;
	public DateTime updatedAt;
	public List<Metafield> metafields = new ArrayList<Metafield>();
}
