package factory;

import entity.Product;
import entity.Sale;

import java.io.IOException;
//10.9
public class SaleEntityFactory extends SimpleEntityFactory<Sale> {
    @Override
    public Sale create() throws IOException {
        return new Sale(getNextId());
    }
}
