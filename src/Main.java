import entity.Person;

import java.io.File;
import java.io.IOException;

import static entity.Person.loadFrom;
import static entity.Person.saveTo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file = new File("test.txt");
        Person f = new Person(23, 1);
        saveTo(file, f);
        loadFrom(file);
    }
}

