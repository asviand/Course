package repository;

import entity.Person;

import java.io.File;
import java.io.IOException;

public class DirectoryPersonRepository implements PersonRepository {
    private final File dir;

    //3.1
    public DirectoryPersonRepository(File dir) {
        this.dir = dir;
        //проверяем является ли папкой
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException("This is not a directory");
        }
        //проверяем существует ли она
        if (!dir.exists()) {
            //если нет - создаем
            dir.mkdirs();
        }
    }

    //3.2
    @Override
    public void save(Person person) throws IOException {

    }

    @Override
    public Person load(int id) throws IOException {
        return null;
    }

    public File getDir() {
        return dir;
    }


}
//3 В пакете repository создать файл DirectoryPersonRepository который
//реализует интерфейс PersonRepository и имеет поле dir типа File .
//1. Создать конструктор который принимает аргумент dir типа File и
//проверяет, что это папка и если ее нет, пытается создать. Если не
//получилось создать то бросает исключение
//IllegalArgumentException .
//2. Реализовать методы save и load которые работают с файлами из
//папки dir .