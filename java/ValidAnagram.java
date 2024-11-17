import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Leetcode 242 Valid Anagram 
 * 
 * https://leetcode.com/problems/valid-anagram/description/
 *
 */
public class ValidAnagram {
    public boolean solution(String s1, String s2){
        if(s1== null || s2 == null || s1.length()==0 || s2.length()==0)
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
    public boolean solution2(String s1, String s2){
        if(s1== null || s2 == null || s1.length()==0 || s2.length()==0)
             return false;
        if(s1.length()!= s2.length())
            return false;
        HashMap <String,Integer> hmap = new HashMap<>();
        s1.chars().forEach(ch-> {hmap.put(String.valueOf(ch) , hmap.getOrDefault(String.valueOf(ch), 0)+1) ; });
        s2.chars().forEach(ch-> {hmap.put(String.valueOf(ch) , hmap.getOrDefault(String.valueOf(ch), 0)-1) ; });
        return hmap.values().stream().allMatch(x->x==0); 
    } 

    public boolean solution3(String s1 , String s2){
        if(s1== null || s2 == null || s1.length()==0 || s2.length()==0)
             return false;
        if(s1.length()!= s2.length())
            return false;
        char [] ch1 = s1.toCharArray() , ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.toString(ch1).equalsIgnoreCase(Arrays.toString(ch2));
    }

    public static void main(String[] args){
        ValidAnagram check = new ValidAnagram ();
        System.out.println("Solution 1");
        System.out.println(check.solution(null, null));
        System.out.println(check.solution("atta" , "tata"));
        System.out.println(check.solution("ata" , "aatta"));
        System.out.println(check.solution("anagram" , "nanagram"));
        System.out.println(check.solution("rat" , "car"));
        System.out.println("Solution 2 ");
        System.out.println(check.solution2(null, null));
        System.out.println(check.solution2("atta" , "tata"));
        System.out.println(check.solution2("ata" , "aatta"));
        System.out.println(check.solution2("anagram" , "nanagram"));
        System.out.println(check.solution2("rat" , "car"));
        System.out.println("Solution 3");
        System.out.println(check.solution3(null ,null ));
        System.out.println(check.solution3("atta" , "tata"));
        System.out.println(check.solution3("ata" , "aatta"));
        System.out.println(check.solution3("anagram" , "nanagram"));
        System.out.println(check.solution3("rat" , "car"));

    }
    
}
