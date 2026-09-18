class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        String a="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0') 
                a+='1';
            else
                a+='0';
        }
        int x=Integer.parseInt(a, 2);
        return x;
    }
}