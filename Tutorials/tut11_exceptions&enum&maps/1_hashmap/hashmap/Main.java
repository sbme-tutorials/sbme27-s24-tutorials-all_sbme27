package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        var capitals = new HashMap<String, String>();
        capitals.put("Egypt", "Cairo");
        capitals.put("Sudan", "khartoum");
        capitals.put("Libya", "Tripoli");


        System.out.println(capitals.get("Egypt"));

        capitals.remove("Egypt");

        capitals.get("Libya");

        capitals.put("Egypt", "New Capital");

        System.out.println("\nEntries");
        // Entry<String, String> 
        for(var e : capitals.entrySet()){
            System.out.print(e);
            System.out.print(", ");
        }
        System.out.println("\n");

        System.out.println("Keys");
        for(String e : capitals.keySet()){
            System.out.print(e);
            System.out.print(", ");
        }
        System.out.println("\n");
        
        System.out.println("Values");
        for(String e : capitals.values()){
            System.out.print(e);
            System.out.print(", ");
        }
        System.out.println(" ");

    }
    
}
