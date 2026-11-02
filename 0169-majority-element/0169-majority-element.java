class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums) {
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else    map.put(i, 0);
        }
        int max=-1, e=-1;
        for(int i=0; i<nums.length; i++){
            if(max<map.get(nums[i])){ // && map.get(nums[i])>nums.length/2){
                max=map.get(nums[i]);
                e=nums[i];
            }
        }
        return e;
    }
}