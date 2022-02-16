package Lesson5HW;

import java.io.File;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)  {

        File file = new File("src/Lesson5HW/test.csv");

        File file2 = new File("src/Lesson5HW/test2.csv");

        AppData appData = new AppData();
        appData.read(file);
        System.out.println(Arrays.toString(appData.getHeaders()));

        System.out.println(Arrays.toString(appData.getData()[0]));


        appData.write(file2);

    }

}
