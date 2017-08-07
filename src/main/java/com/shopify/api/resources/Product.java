package com.shopify.api.resources;

import java.util.List;

import com.shopify.api.common.AbstractShopifyResource;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Accessors(chain = true)
@JsonRootName("product")

//note: these should be able to be private with the getter and setter, but it's throwing an error that way, so I've changed them to public for now
//     2017-07-31 11:46:13,211 [main] INFO  c.t.t.reports.CInventoryForShopify - Error: javax.ws.rs.client.ResponseProcessingException: javax.ws.rs.ProcessingException: com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException: Unrecognized field "handle" (class com.shopify.api.resources.Product), not marked as ignorable (one known property: "published"])
//       at [Source: org.apache.http.conn.EofSensorInputStream@53dfacba; line: 1, column: 25] (through reference chain: com.shopify.api.services.ProductList[0]->com.shopify.api.resources.Product["handle"])

public class Product extends AbstractShopifyResource {
    public String bodyHtml;
    public String handle;
    public Image image;
    public List<Image> images;
    public List<Option> options;
    public String productType;
    //private Boolean published;
    public DateTime publishedAt;
    public String tags;
    public String templateSuffix;
    public String title;
    public List<Variant> variants;
    public String vendor;
    public String publishedScope;
    public String metafieldsGlobalTitleTag;
    public String metafieldsGlobalDescriptionTag;
    
    public boolean isPublished() {
        return "global".equalsIgnoreCase(publishedScope) && publishedAt != null;
    }

    public Product setPublished(boolean publish) {
    	publishedScope = (publish ? "global" : "none");
    	publishedAt = (publish ? DateTime.now() : null);
    	
    	return this;
    }
}
