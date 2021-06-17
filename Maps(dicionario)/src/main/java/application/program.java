package application;

import java.util.Map;
import java.util.TreeMap;

public class program {
    public static void main(String[] args){
        Map<String,  String> cookies = new TreeMap<>();
        cookies.put("Estudante das dorgas","Gabriel");
        for (String key : cookies.keySet()){
            System.out.println(key+ ": " + cookies.get(key));
        }
    }
}
