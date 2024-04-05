package factory;

import entity.Product;
import entity.Sale;

import java.io.IOException;

//todo 10.9 реализация метода create, который возвращает новый объект
//класса Sale , в котором поле id имеет значения полученное из
//метода getNextId
public class SaleEntityFactory extends SimpleEntityFactory<Product> {
    @Override
    public Product create() throws IOException {
        return null;
    }
}
