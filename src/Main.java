import entity.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

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
/*
        Scanner loadingOrEnter = new Scanner(System.in);
        System.out.println("Would you like to upload or enter data?  Upload/Enter");
        String answer = loadingOrEnter.nextLine();
        if (answer.equalsIgnoreCase("Upload")) {
            String filePath = loadingOrEnter.next();
            loadDataFromFile(filePath);
        } else if (answer.equalsIgnoreCase("Enter")) {
            System.out.println("Enter your age:");
            String age = loadingOrEnter.nextLine();
            System.out.println("Enter your id:");
            int id = loadingOrEnter.nextInt();
            System.out.println("Enter the path to the file to save data:");
            String filePath = loadingOrEnter.nextLine();
            SaveDataFromFile(filePath);
        } else {
            System.out.println("Incorrect answer");
        }

    }

    private static void loadDataFromFile(String filePath) {
        loadFrom(new File(filePath));
    }

    private static void SaveDataFromFile(String filePath, Person) {
        saveTo(new File(filePath), new Person());

    }*/
    }
}

