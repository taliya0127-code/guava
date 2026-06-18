package com.example;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import com.google.common.collect.ImmutableList;

public class App {
public static void main(String[] args) {

    ImmutableList<String> fruits =
            ImmutableList.of("Apple", "Banana", "Mango");

    System.out.println(fruits);

    File sourceFile = new File("source.txt");

    File destinationFile = new File("destination.txt");

    try {

        FileUtils.copyFile(sourceFile, destinationFile);

        System.out.println("File Copied Successfully");

    } catch (IOException e) {

        System.out.println("Error occurred while copying the file");
    }
}
}
