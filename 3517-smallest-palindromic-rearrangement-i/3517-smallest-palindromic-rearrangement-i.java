class Solution {
    public String smallestPalindrome(String s) {
        char[] c = s.substring(0, s.length()/2).toCharArray();
        Arrays.sort(c);
        
        StringBuilder sb = new StringBuilder();
        sb.append(c);

        if(s.length()%2==1){
            sb.append(s.charAt(s.length()/2));
        }

        int end = c.length-1;

        while(end>=0){
            sb.append(c[end--]);
        }
        return sb.toString();

    }   
}