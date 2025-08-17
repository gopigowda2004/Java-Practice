package hashmap;

import java.util.HashMap;

public class Hash {
   public static void main(String[] args) {
    HashMap<String,Integer> map=new HashMap<>();

    map.put("Gopi",1234);
    map.put("Gowda",6789);
    
    System.out.println(map.get("Gopi"));
    
    map.containsKey("Gowda");
    map.remove("Gowda");
    map.put("Gopi",23);
    System.out.println(map.get("Gopi"));

   }
}
