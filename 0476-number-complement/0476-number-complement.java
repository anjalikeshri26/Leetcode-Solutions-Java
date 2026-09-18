class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        String a="1".repeat(s.length());
        int x=Integer.parseInt(a, 2);
        return num^x;
    }
}