package app;

import app.model.FileHandler;
import app.units.Constants;

public class Main {
    static String fileName;
    static String filePath;
    static String fileContent;

    public static void main(String[] args) {
        fileName = "myfile.txt";
        filePath = Constants.BASE_PATH + fileName;
        fileContent = "My very important information.";
        getOutput("RESULT: " + FileHandler.writeFile(filePath, fileContent));
        getOutput("FILE CONTENT: " + FileHandler.readFile(filePath));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
