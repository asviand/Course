package entity;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

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

    public static void saveTo(File file, Person person) {
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            try (PrintWriter writer = new PrintWriter(outputStream)) {
                writer.write(person.id);
                writer.write(person.age);
                writer.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось открыть файл" + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void loadFrom(File file) {
        try (FileInputStream stream = new FileInputStream(file)) {
            try {
                int i;
                while ((i = stream.read()) != 1) {
                    System.out.println((char) i);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось открыть файл" + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла" + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}


