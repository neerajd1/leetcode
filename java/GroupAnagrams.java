import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * Leetcode 49 Group Anagrams
 *
 * https://leetcode.com/problems/group-anagrams/description/
 * GroupAnagrams
 */
public class GroupAnagrams {
    public List<List<String>> solution(String[] strs){
       HashMap<String , List<String>> hmap = new HashMap<>();
       for(String element : strs ){
            char [] charArray = element.toCharArray();
            Arrays.sort(charArray);
            String sorted = Arrays.toString(charArray);
            if(!hmap.containsKey(sorted))
                hmap.put(sorted, new ArrayList<String>());
            hmap.get(sorted).add(element);
       }
        List<List<String>> result = new ArrayList<>();
        result.addAll(hmap.values());
        return result;
    }
    public static void main(String[] args) {
        GroupAnagrams check = new GroupAnagrams();
        List<List<String>> result1 = check.solution(new String[]{"eat" , "tea" , "tan" , "ate", "nat" , "bat"});
        List<List<String>> result2 = check.solution(new String[]{""});
        List<List<String>> result3 = check.solution(new String[]{"a"});
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
    
}
