package com.switchfully;

import com.google.common.base.Charsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        //Defining input and output file paths
        String inputFilePath = "C:\\Users\\etien\\Desktop\\Java Track\\testing-2024-04\\30-automated-testing\\10-dependency-management\\advanced-dependency-codelab01\\src\\main\\resources\\student-scores.csv";
        String outputFilePath = "C:\\Users\\etien\\Desktop\\Java Track\\testing-2024-04\\30-automated-testing\\10-dependency-management\\advanced-dependency-codelab01\\src\\main\\out\\student-scores.csv";

        //Creating File object from path and converting its content to a String
        File inputFile = new File(inputFilePath);
        String fileString = FileUtils.readFileToString(inputFile, Charsets.UTF_8);

        //Increasing scores and generating new unformatted scores
        String[] fileLines = fileString.split(System.lineSeparator());
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<String> newStringList = new ArrayList<>();
        for (String line : fileLines) {
            String[] lineStringArray = line.split(";");
            stringList.addAll(Arrays.asList(lineStringArray));
        }
        for (String s : stringList) {
            int newScore = Integer.parseInt(s) + 1;
            String newScoreString = String.valueOf(newScore);
            newStringList.add(newScoreString);
        }

        //Building formatted scores and writing to file
        String newFileString = "";
        for (int i = 0; i < newStringList.size(); i++) {
            newFileString += newStringList.get(i) + ";";
            if ((i + 1) % 6 == 0) {
                newFileString = StringUtils.chop(newFileString);
                System.out.println("test");
                newFileString += System.lineSeparator();
            }
        }
        File outputFile = new File(outputFilePath);
        FileUtils.writeStringToFile(outputFile, newFileString, Charsets.UTF_8);

    }
}
