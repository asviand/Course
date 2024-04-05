package factory;

import java.io.IOException;

//todo 10.8 реализация метода create который возвращает новый объект
//класса Product , в котором поле id имеет значения полученное из
//метода getNextId
public class ProductEntityFactory extends SimpleEntityFactory {
    @Override
    public Object create() throws IOException {
        return null;
    }
}
