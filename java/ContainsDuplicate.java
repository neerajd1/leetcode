import java.util.Arrays;
import java.util.HashMap;

/**
  * 
  * leetcode 217  contains duplicate
  * https://leetcode.com/problems/contains-duplicate/description/
  * check whether any value appears at least twice in the array
  */
 public class ContainsDuplicate {
    
    public boolean solution(int[] nums){
        HashMap<Integer , Integer> hmap =  new HashMap<>();
        if(nums == null || nums.length<=0 )
            return false;
        for(int i:nums){
            if (hmap.containsKey(i)){
                return true;
            }
            hmap.put(i, null);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate check = new ContainsDuplicate();
        System.out.println(check.solution(null));
        System.out.println(check.solution(new int[] {1,2,3,4}));
        System.out.println(check.solution(new int[] {1,2,2,2,2,3,4,5,6}));
    }
    
 }
