package review;

import java.util.HashMap;
import java.util.Map;

public class Ten {
    public static void main(String[] args) {


        Map<String, String> passwors = new HashMap<>();
passwors.put("rana"," rana123");
        passwors.put("rana"," r123");


        System.out.println(passwors.size()+ passwors.get("rana"));
    }
}