class Solution {
    static HashMap<Integer,String> map;
    static List<String> ans;

    public static List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        map= new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        if(!digits.isEmpty()) bt(0,"",digits);

        return ans;
    }

    public static void bt(int index, String cString, String digits){
        if(cString.length()==digits.length()){
            ans.add(cString);
            return;
        }

        for(char c: map.get(digits.charAt(index)-'0').toCharArray())
        {
            bt(index+1, cString+c, digits);
        }
    }
}