package com.noanswer.seventdd.product;

import java.util.HashMap;
import java.util.Map;

class ProductRepository {
    private Map<Long, Product> persistance = new HashMap<>();
    private Long sequence = 0L;

    public void save(final Product product) {
        product.assignId(++sequence);
        persistance.put(product.getId(), product);
    }
}
