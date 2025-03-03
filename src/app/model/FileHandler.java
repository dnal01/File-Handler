package app.model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public static String writeFile(String filePath, String fileContent) {
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(fileContent);
            return "Success.";
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

    public static String readFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            int sym;
            StringBuilder stringBuilder = new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

}
