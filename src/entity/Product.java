package entity;

import java.util.Objects;

//10.1
public class Product implements Comparable<Product> {
    //10.1.1-10.1.3
    private final int id;
    private String name;
    private double price;

    public Product(int id) {
        this.id = id;
    }


    @Override
    public int compareTo(Product o) {
        return Double.compare(id, o.id);
    }

    //10.1.4
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
