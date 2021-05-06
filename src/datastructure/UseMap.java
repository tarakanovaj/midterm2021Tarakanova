package datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use MySql Database to store data and retrieve data.
         */






        HashMap<Integer, String> usemap = new HashMap<Integer, String>();


        usemap.put(12, "Julia");
        usemap.put(2, "Tanzina");
        usemap.put(7, "Thamina");
        usemap.put(49, "Shadman");
        usemap.put(3, "Farzin");

        /* Display content using Iterator*/
        Set<Map.Entry<Integer, String>> set = usemap.entrySet();
        for (Map.Entry<Integer, String> integerStringEntry : set) {
            System.out.print("key is: " + ((Map.Entry) integerStringEntry).getKey() + " & Value is: ");
            System.out.println(((Map.Entry) integerStringEntry).getValue());
        }

        /* Get values based on key*/
        String var= usemap.get(2);
        System.out.println("Value at index 2 is: "+var);

        /* Remove values based on key*/
        usemap.remove(3);
        System.out.println("Map key and values after removal:");
        Set set2 = usemap.entrySet();
        for (Object o : set2) {
            Map.Entry mentry2 = (Map.Entry) o;
            System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }

    }
}
