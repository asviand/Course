package repository;

import entity.Product;

import java.io.IOException;
import java.util.List;
// todo 10.3 реализовать методы из интерфейса Repository<Product> для класса Product

public class DirectoryProductRepository implements Repository<Product> {
    @Override
    public void save(Product person) throws IOException {

    }

    @Override
    public List<Product> load(List<Integer> ids) throws IOException {
        return null;
    }

    @Override
    public Product load(int id) throws IOException {
        return null;
    }
}
