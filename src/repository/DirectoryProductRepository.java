package repository;

import entity.Product;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectoryProductRepository implements Repository<Product> {
    private final File dir;

    public DirectoryProductRepository(File dir) {
        this.dir = dir;
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException("This is not a directory");
        }
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }

    @Override
    public void save(Product obj) throws IOException {
    File file = new File(dir.getPath()+obj.getId());
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println(obj.getId());
            writer.println(obj.getName());
            writer.println(obj.getPrice());
            writer.close();
        }
    }

    @Override
    public List<Product> load(List<Integer> ids) throws IOException {
        List<Product> loadedElements = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) {
            loadedElements.add(load(ids.get(i)));
        }
        return loadedElements;
    }

    @Override
    public Product load(int id) throws IOException {
        File file = new File(dir.getPath()+id);
        try (Scanner scanner = new Scanner(file)){
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            return new Product(id, name, price);
        }
    }
}
