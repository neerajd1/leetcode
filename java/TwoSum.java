import java.util.Arrays;
import java.util.HashMap;

/**
 * Leetcode 1 Two Sum
 *
 *
 * https://leetcode.com/problems/two-sum/description/
 * TwoSum
 */
public class TwoSum {
    
    public int [] solution (int[] nums , int target){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] result = new int[]{-1,-1};
        for(int a : nums){
            if(hmap.containsKey(a)){
                result[0] = a;
                result[1] = hmap.get(a);
            }else{
                hmap.put(target-a ,a);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        TwoSum check = new TwoSum();    
        int [] result1 = check.solution(new int[]{} , 0 );
        System.out.println(Arrays.toString(result1));
        int [] result2 = check.solution(new int[]{2,7,11,15} , 9);
        System.out.println(Arrays.toString(result2));
        int [] result3 = check.solution(new int[]{3,2,4} , 6);
        System.out.println(Arrays.toString(result3));
        int [] result4 = check.solution(new int[]{3,3} , 6);
        System.out.println(Arrays.toString(result4));
    }
    
}
