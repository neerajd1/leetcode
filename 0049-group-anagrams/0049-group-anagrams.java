class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> hmap = new HashMap<>();
        for(String element :strs){
            char [] characterArray = element.toCharArray() ;
            Arrays.sort(characterArray);
            String sorted = Arrays.toString(characterArray);
            if(!hmap.containsKey(sorted))
                hmap.put(sorted, new ArrayList<String>());
            hmap.get(sorted).add(element);

        }
        List<List<String>> result = new ArrayList<>();
        result.addAll(hmap.values());
        return result;
    }
}