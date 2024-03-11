package entity;

public class Person {
    private int id;
    private int age;
    private String name;

    public Person(int age, int id) {
        this.age = age;
        this.id = id;
    }
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
