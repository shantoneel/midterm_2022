package map;

import java.util.ArrayList;
import java.util.HashMap;

public class UseHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("qa001", "Josh");
        map.put("qa002", "David");
        System.out.println(map);

        ArrayList<String> usaCities = new ArrayList<>();

        usaCities.add("NY");
        usaCities.add("Miami");
        usaCities.add("Texas");

        ArrayList<String> englandCities = new ArrayList<>();
        englandCities.add("London");
        englandCities.add("Manchester");
        englandCities.add("Cambridge");

        HashMap<String, ArrayList<String>> map2 = new HashMap<>();
        map2.put("Usa", usaCities);
        System.out.println(map2);


    }

}
