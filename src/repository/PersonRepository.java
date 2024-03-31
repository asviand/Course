package repository;

import entity.Person;

import java.io.IOException;

public interface PersonRepository {

    //2.1
    void save(Person person) throws IOException;

    //2.2
    Person load(int id) throws IOException;
}
