package by.bsuir.german.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IO {

    private FileReader fileReader;
    private FileWriter fileWriter;
    private Scanner scanner;
    private Storage storage;

    public IO(FileReader fileReader, FileWriter fileWriter, Scanner scanner, Storage storage) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
        this.scanner = scanner;
        this.storage = storage;
    }

    public void write(String s) throws IOException {
        fileWriter.write(s);
//        fileWriter.close();
    }
    public void read() throws IOException {
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
//        fileReader.close();
    }

}
