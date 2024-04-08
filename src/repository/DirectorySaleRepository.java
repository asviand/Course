package repository;

import entity.Person;
import entity.Product;
import entity.Sale;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//todo 10.4 реализовать методы из интерфейса Repository<Sale> для класса Sale

public class DirectorySaleRepository implements Repository<Sale> {
    private final File dir;

    public DirectorySaleRepository(File dir) {
        this.dir = dir;
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException("This is not a directory");
        }
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }
    @Override
    public void save(Sale obj) throws IOException {
        File file = new File(dir.getPath()+obj.getId());
        try (PrintWriter writer = new PrintWriter(file)){
            writer.println(obj.getId());
            writer.println(obj.getAmount());
            writer.println(obj.getPerson().getId());
            writer.println(obj.getPerson().getAge());
            writer.println(obj.getPerson().getName());
            //todo products
            writer.close();
        }

    }
    @Override
    public Sale load(int id) throws IOException {
        File file = new File(dir.getPath()+id);
        try (Scanner scanner = new Scanner(file)){
            scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            int personId = Integer.parseInt(scanner.nextLine());
            int personAge = Integer.parseInt(scanner.nextLine());
            String personName = scanner.nextLine();
            Person newPerson = new Person(personId, personAge, personName);
//todo products
            return new Sale(id, amount, newPerson, );
        }
    }
    @Override
    public List<Sale> load(List<Integer> ids) throws IOException {
        List<Sale> list = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) {
            list.add(load(ids.get(i)));
        }
        return list;
    }


}
