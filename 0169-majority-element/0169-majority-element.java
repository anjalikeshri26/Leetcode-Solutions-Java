class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums) 
            map.put(i, map.getOrDefault(i, 0) + 1);
        int max=-1, e=-1;
        for(int i=0; i<nums.length; i++){
            if(max<map.get(nums[i])){
                max=map.get(nums[i]);
                e=nums[i];
            }
        }
        return e;
    }
}