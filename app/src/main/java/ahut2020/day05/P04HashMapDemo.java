package ahut2020.day05;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P04HashMapDemo {
    public static void main(String[] args) {
       Map<String,String> contacts=new HashMap<>();
       contacts.put("tom","1234");
       contacts.put("jerry","9876");
        System.out.println(contacts);
        System.out.println("Calling "+contacts.get("tom"));
        contacts.put("tom","6666");
        System.out.println("Calling "+contacts.get("tom"));
        contacts.remove("tom");
        System.out.println("Calling "+contacts.get("tom"));
        contacts.clear();
        System.out.println(contacts);
    }
}
