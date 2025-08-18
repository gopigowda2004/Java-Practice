import java.util.HashMap;

public class ContainsDuplicate {
   public static void main(int[] nums) {
    HashMap<Integer,Integer> set= new HashMap<>();

    for(int num:nums){
        if(set.containsKey(num)){
            return true;
        }
        set.add(num);
    }
    return false;
   }
}
