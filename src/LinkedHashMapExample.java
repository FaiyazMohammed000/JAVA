import java.util.*;
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("IND",55);
        map.put("AUS",45);
        map.put("ENG",15);
        map.put("PAK",60);
        System.out.println(map);
        map.put("ENG",35);
        System.out.println(map);
      /*  if(map.containsKey("AUS"))
        {
            System.out.println("Key is present in the map");
        }
        else {
            System.out.println("Key is absent in the map");
        }
        if(map.containsKey("BAN"))
        {
            System.out.println("BAN key is present in the map");
        }
        else {
            System.out.println("BAN key is absent in the map");
        }
        System.out.println(map.get("PAK"));
        System.out.println(map.get("USA")); */
        for(Map.Entry<String,Integer> e: map.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
