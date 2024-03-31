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
        File file = new File(dir.getPath() + person.getId());
        Person.saveTo(file, person);
    }

    @Override
    public Person load(int id) throws IOException {
        File file = new File(dir.getPath() + id);
        return Person.loadFrom(file);
    }

    public File getDir() {
        return dir;
    }
}
