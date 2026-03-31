package ListPackage;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap <String, String> capitals = new HashMap<String, String>();
        capitals.put("Bangladesh", "Dhaka");
        capitals.put("England", "London");
        capitals.put("Germany", "Berlin");
//        System.out.println(capitals);
//        System.out.println(capitals.remove("England"));
//        System.out.println(capitals);
//        System.out.println(capitals.size());
        for (String i:
             capitals.keySet()) {
            System.out.println("keys: "+i+" value: "+capitals.get(i));
        }
        HashMap <String, Integer> people = new HashMap<String, Integer>();
        people.put("Nusrat", 25);
        people.put("Tithi", 27);
        people.put("Rani", 30);
//        System.out.println(capitals);
//        System.out.println(capitals.remove("England"));
//        System.out.println(capitals);
//        System.out.println(capitals.size());
        for (String i:
                people.keySet()) {
            System.out.println("keys: "+i+" value: "+people.get(i));
        }
        System.out.println();
        System.out.println("Iterating hasmap:");
        for (Map.Entry p: people.entrySet()){
            System.out.println(p.getKey()+" "+p.getValue());
        }
    }
}
