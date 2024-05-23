package Utilz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Objects;

public class DataManagement {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static String toJson(Object obj){
        return gson.toJson(obj);
    }
    public static <T> T fromJson(String json, Class<T> tclass){
        return gson.fromJson(Objects.requireNonNull
                (FileManagement.loadData("iz.sa")), tclass);
    }
    public static void saveJson(String json, String path){
        FileManagement.saveData(json, path);
    }
}
