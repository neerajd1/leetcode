import java.util.HashMap;
import java.util.Map;

/** Leetcode 242 Valid Anagram 
 * 
 * https://leetcode.com/problems/valid-anagram/description/
 *
 */
public class ValidAnagram {
    public boolean solution(String s1, String s2){
        if(s1== null || s2 == null)
            return false;
        if(s1.length()!= s2.length())
            return false;

        HashMap<Character, Integer> hmap = new HashMap<>();
        char [] charArray1 = s1.toCharArray() ,charArray2=s2.toCharArray();
        for(char a : charArray1){
            if(hmap.containsKey(a)){
                hmap.put(a, hmap.get(a)+1);
            }
            else
                hmap.put(a, 1);

        }
        for(char a : charArray2){
            if(hmap.containsKey(a)){
                hmap.put(a, hmap.get(a)-1);
            }
            else
               return false; 
        }

        for(Map.Entry<Character,Integer> entry: hmap.entrySet()){
            if (entry.getValue()!=0) return false;
        }
            
        return true;
    }
    public static void main(String[] args) {
        ValidAnagram check = new ValidAnagram ();
        System.out.println(check.solution(null, null));
        System.out.println(check.solution("atta" , "tata"));
        System.out.println(check.solution("ata" , "aatta"));
        System.out.println(check.solution("ata" , "nest"));

    }
    
}
