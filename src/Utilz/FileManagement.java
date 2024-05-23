package Utilz;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManagement {
    public static void saveData(String json, String path){
        try (FileWriter file = new FileWriter(path)) {
            file.write(json);
            file.flush();
        } catch (IOException e) {
            System.err.println("Error saving data"+ e.getMessage());
        }
    }
    public static FileReader loadData(String path){
        try {
            return new FileReader(path);
        } catch (IOException e) {
            System.err.println("Error loading data"+ e.getMessage());
        }
        return null;
    }
}
