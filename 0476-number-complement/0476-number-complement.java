class Solution {
    public int findComplement(int num) {
        int a=0, n=num;
        while(n!=0) {
            n=n>>1;
            a=a<<1|1;
        }
        return a^num;
    }
}