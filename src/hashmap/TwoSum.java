package hashmap;

import java.util.HashMap;

public class TwoSum {
  public int[] twoSum(int[] nums, int target)  {
      HashMap<Integer,Integer> map=new HashMap<>();
      
     for(int i=0;i<nums.length;i++){
           int Complement=target-nums[i];

     
     if(map.containsKey(Complement)){
        return new int[]{map.get(Complement),i};
     }
     map.put(nums[i],i);
     }
     return new int[] {};
  }
}
