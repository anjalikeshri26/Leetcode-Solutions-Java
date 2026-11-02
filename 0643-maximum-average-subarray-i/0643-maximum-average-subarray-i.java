class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=nums.length;
        if(k>l) return -1;
        int sum=0;
        for(int i=0; i<k; i++) {
            sum+=nums[i];
        }
        double mavg=(double)sum/k;
        for(int i=k; i<l; i++){
            sum+=nums[i];
            sum-=nums[i-k];
            double avg=(double)sum/k;
            if(mavg<avg)
                mavg=avg;   
        }
        return mavg;
    }
}