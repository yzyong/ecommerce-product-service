package com.ecommerce.product.product;


import com.ecommerce.shared.model.AbstractId;

import static com.ecommerce.shared.utils.UuidGenerator.newUuid;

public class ProductId extends AbstractId {

    private ProductId() {
    }

    private ProductId(String id) {
        super(id);
    }

    public static ProductId of(String id) {
        return new ProductId(id);
    }

    public static ProductId newId() {
        return new ProductId(newUuid());
    }


}