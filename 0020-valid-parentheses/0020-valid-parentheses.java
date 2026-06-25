class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='{' || c=='[' || c=='(') stack.add(c);
            else if(!stack.isEmpty() && c!=stack.getLast() && Math.abs(c-stack.getLast())<=2) stack.removeLast();
            else stack.add(c);
        }
        return stack.isEmpty() ? true:false;
    }
}