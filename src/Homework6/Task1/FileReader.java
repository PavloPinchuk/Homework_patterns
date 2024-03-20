package Homework6.Task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    private FileReader(){

    }
    final private static FileReader instance = new FileReader();
    public static FileReader getInstance(){
        return instance;
    }

    public String readFile(String filename) throws IOException {
      try(FileInputStream fileInputStream = new FileInputStream(filename)){
          return new String(fileInputStream.readAllBytes());
      }
    }

    public void printFile(String filename) throws IOException{
        String file = readFile(filename);
        System.out.println(file);
    }

    public void countWords(String filename)throws  IOException{
        String file = readFile(filename);
        System.out.println("Amount of words in file: "+ file.trim().split(" ").length);
    }

}
