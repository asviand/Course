package factory;

import entity.Product;

import java.io.IOException;


public class ProductEntityFactory extends SimpleEntityFactory<Product> {
    @Override
    public Product create() throws IOException {
        return new Product(getNextId());
    }
}
