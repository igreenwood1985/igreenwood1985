package org.example.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoryFileReader {

    private String storyFileName;

    public StoryFileReader(String storyFileName) {
        this.storyFileName = storyFileName;

    }

    public List<String> readFile() throws FileNotFoundException {

        List<String> fileContentLines = new ArrayList<>();
        File inventoryFile = new File(storyFileName);

        try(Scanner fileReader = new Scanner(storyFileName)){
            while(fileReader.hasNextLine()){
                fileContentLines.add(fileReader.nextLine());
            }
        }
        return fileContentLines;
    }
}
