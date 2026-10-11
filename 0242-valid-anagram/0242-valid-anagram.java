class Solution {
    public boolean isAnagram(String s, String t) {
        if (s==null || t==null || s.length()!=t.length())
            return false;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        s.chars().forEach(ch-> hmap.put(ch, hmap.getOrDefault(ch,0)+1));
        t.chars().forEach(ch-> hmap.put(ch, hmap.getOrDefault(ch,0)-1));
        return hmap.values().stream().allMatch(x->x==0);
    }
}