class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1) return false;
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='{' || c=='[')  
                stack.push(c);
            else if(stack.isEmpty())    
                return false;
            else {
                char ch=stack.pop();
                if(c==')' && ch!='(')   return false;
                if(c=='}' && ch!='{')   return false;
                if(c==']' && ch!='[')   return false;
            }
        }
        return stack.isEmpty();
    }
}