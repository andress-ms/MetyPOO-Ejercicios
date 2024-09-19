import models.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Dictionary
        Map<Integer, String> dictionary = new HashMap<Integer, String>();

        //Add elements to the dictionary
        dictionary.put(1, "Johan");
        dictionary.put(2, "Silvio");
        dictionary.put(3, "Andres");
        dictionary.put(4, "Douglas");
        dictionary.put(5, "Cesar");
        dictionary.put(6, "Gabriel");

        System.out.println(dictionary.get(4));

        Map<String, String> dictionary2 = new HashMap<>(String, String)();
        dictionary2.put("Johan", "Reyes");
        dictionary2.put("Silvio", "Mora");
        dictionary2.put("Andres", "Martinez");

        System.out.println(dictionary2.get("Johan"));

        Map<String, Person> list = new HashMap<String, Person>();
        list.put("Johan", new Person("Johan", "Reyes"));
        list.put("Silvio", new Person("Silvio", "Mora"));
        list.put("Andres", new Person("Andres", "Martinez"));
        list.put("Douglas", new Person("Douglas", "Gomez"));
    }
}
