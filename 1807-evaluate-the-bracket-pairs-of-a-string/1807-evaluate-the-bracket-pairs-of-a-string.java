class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String > map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(List<String> ss: knowledge){
            map.put(ss.get(0), ss.get(1));
        }
        int l=0, r=0;
        while(l<s.length() && r<s.length()){
            while (l < s.length() && s.charAt(l) != '(') {
                sb.append(s.charAt(l));
                l++;
            }
            if(l==s.length()){
                break;
            }
            r=l;
            while(r<s.length() && s.charAt(r)!=')') {
                r++;
            }
            if(map.containsKey(s.substring(l+1, r))){
                sb.append(map.get(s.substring(l+1, r)));
            }
            else{
                sb.append('?');
            }
            l=r+1;
        }
        
        return sb.toString();
    }
}