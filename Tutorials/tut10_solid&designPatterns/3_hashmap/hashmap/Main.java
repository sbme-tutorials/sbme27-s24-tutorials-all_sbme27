

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        var capitals = new HashMap<String, String>();
        capitals.put("Egypt", "Cairo");
        capitals.put("Sudan", "khartoum");
        capitals.put("Libya", "Tripoli");

        // var s = "S";
        // var x = 10;

        System.out.println(capitals.get("Egypt"));

        capitals.remove("Egypt");

        System.out.println("\nEntries");
        for(var e : capitals.entrySet()){
            System.out.print(e);
            System.out.print(", ");
        }
        System.out.println("\n");

        System.out.println("Keys");
        for(var e : capitals.keySet()){
            System.out.print(e);
            System.out.print(", ");
        }
        System.out.println("\n");
        
        System.out.println("Values");
        for(var e : capitals.values()){
            System.out.print(e);
            System.out.print(", ");
        }
        System.out.println(" ");

    }
    
}
