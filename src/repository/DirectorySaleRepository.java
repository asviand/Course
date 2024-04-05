package repository;

import entity.Sale;

import java.io.IOException;
import java.util.List;

//todo 10.4 реализовать методы из интерфейса Repository<Sale> для класса Sale

public class DirectorySaleRepository implements Repository<Sale> {
    @Override
    public void save(Sale person) throws IOException {

    }

    @Override
    public List<Sale> load(List<Integer> ids) throws IOException {
        return null;
    }

    @Override
    public Sale load(int id) throws IOException {
        return null;
    }
}
