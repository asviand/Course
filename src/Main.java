import entity.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static entity.Person.loadFrom;
import static entity.Person.saveTo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");

        Scanner loadingOrEnter = new Scanner(System.in);
        System.out.println("Would you like to upload or enter data?  Upload/Enter");
        String answer = loadingOrEnter.nextLine();
        if (answer.equalsIgnoreCase("Upload")) {
            System.out.println("путь до файла");
            String filePath = loadingOrEnter.nextLine();
            File x = new File(filePath);
            Person person = null;
            try {
                person = Person.loadFrom(file);
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            }

            if (person != null) {
                System.out.println("Данные загружены:");
                System.out.println("id: " + person.getId());
                System.out.println("Имя: " + person.getName());
                System.out.println("Возраст: " + person.getAge());
            }

        } else if (answer.equalsIgnoreCase("Enter")) {
            System.out.println("Enter your id:");
            int id = Integer.parseInt(loadingOrEnter.nextLine());
            System.out.println("Enter your name:");
            String name = loadingOrEnter.nextLine();
            System.out.println("Enter your age:");
            int age = Integer.parseInt(loadingOrEnter.nextLine());
            System.out.println("Enter the path to the file to save data:");
            String filePath = loadingOrEnter.nextLine();
            Person.saveTo(new File(filePath), new Person(id, age, name));
        } else {
            System.out.println("Incorrect answer");
        }

    }

}


