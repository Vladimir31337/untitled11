package Lesson4;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyHomeWork4 {

    static final String FILE_NAME1 ="C:\\Users\\User\\IdeaProjects\\untitled\\src\\Lesson4HomeWork\\HomeWork4.txt";
    static final String FILE_NAME2 ="src\\HomeWork4.txt";


    public static void main(String[] args) {

        List<String> wordArray = new ArrayList<String>();

        wordArray = ArrayOperations.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        ArrayOperations.printUniqueWords(wordArray);
        wordArray.clear();
        try {
            wordArray = ArrayOperations.fillTheArrayFromFile(wordArray, FILE_NAME2);
        } catch (IOException e) {
            System.out.println("Неудалось заполнить из файла!\n");
        }
        try {
            wordArray = ArrayOperations.fillTheArrayFromFile(wordArray, FILE_NAME1);
        } catch (IOException e) {
            System.out.println("Неудалось заполнить из файла!\n");
        }
        System.out.println(wordArray + "\n");
        ArrayOperations.printUniqueWords(wordArray);

        PhoneBook phonebook = new PhoneBook();

        phonebook.add(11111111, "Andreev");
        phonebook.add(22222222, "Popov");
        phonebook.add(33333333, "Petrov");
        phonebook.add(44444444, "Popov");
        phonebook.add(55555555, "Ivanov");
        phonebook.add(6666666, "Petrov");

        phonebook.get("Andreev");
        phonebook.get("Popov");
        phonebook.get("Petrov");
        phonebook.get("Ivanov");
        phonebook.get("Vladimirov");
    }


}
