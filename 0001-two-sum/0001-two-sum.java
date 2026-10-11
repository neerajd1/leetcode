class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        HashMap<Integer,Integer> differenceMap=new HashMap<>();
        for (int i=0 ; i<nums.length ;i++){
            if(differenceMap.containsKey(nums[i])){
                result[0]= differenceMap.get(nums[i]);
                result[1]= i;
                return result;
            }else{
                differenceMap.put(target-nums[i],i);
            }
        }
        return result;

    }
}