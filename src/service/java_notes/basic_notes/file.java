package service.java_notes.basic_notes;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class file {

    public static void main(String[] args) {
        File file = createFile("src/service/java_notes/suman_mali.txt");
        writeFile(file, true);
        readFile(file);
    }

    // create a files
    private static File createFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            // if (file.exists()) {
            // file.delete();
            // }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return file;
    }

    // write a files
    private static void writeFile(File files, Boolean append) {

        // try with resources

        try (FileWriter fileWriter = new FileWriter(files, append);
                PrintWriter printWriter = new PrintWriter(fileWriter);) {
            printWriter.println("Im a learing JAVA");
        } catch (IOException e) {
            e.getMessage();
        }

        // try without resourse

        // try {
        // FileWriter fileWriter = new FileWriter(files, append);
        // PrintWriter printWriter = new PrintWriter(fileWriter);
        // printWriter.println("Hello World My name is suman mali");
        // printWriter.flush();
        // printWriter.close();

        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }
    }

    // read a files
    private static void readFile(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.getMessage();

        }
    }

}
