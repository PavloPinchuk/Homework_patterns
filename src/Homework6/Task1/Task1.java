package Homework6.Task1;

import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String filename = "src/Homework6/Task1/input.txt";
        FileReader fileReader = FileReader.getInstance();
        fileReader.printFile(filename);
        System.out.println("\n\n\n\n");
        fileReader.countWords(filename);
    }
}
