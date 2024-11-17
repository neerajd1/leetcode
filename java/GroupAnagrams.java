import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public List<List<String>> solution2 (String [] strs){
        Map<String , List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String temp = String.copyValueOf(arr);
            List<String> list = map.getOrDefault(temp, new ArrayList<>());
            list.add(str);
            map.put(temp, list);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        GroupAnagrams check = new GroupAnagrams();
        List<List<String>> result1 = check.solution(new String[]{"eat" , "tea" , "tan" , "ate", "nat" , "bat"});
        List<List<String>> result2 = check.solution(new String[]{""});
        List<List<String>> result3 = check.solution(new String[]{"a"});
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        List<List<String>> result21 = check.solution2(new String[]{"eat" , "tea" , "tan" , "ate", "nat" , "bat"});
        List<List<String>> result22 = check.solution2(new String[]{""});
        List<List<String>> result23 = check.solution2(new String[]{"a"});
        System.out.println(result21);
        System.out.println(result22);
        System.out.println(result23);

    }
    
}
