class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            int[] arr = new int[26];

            for(int i=0; i<str.length(); i++){
                arr[str.charAt(i)-'a']++;
            }

            StringBuilder sb  = new StringBuilder();

            for(int k: arr)
            {
                sb.append("#");
                sb.append(k);
            }
            String key = sb.toString(); 

            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(str);
        } 
        return new ArrayList<>(map.values());
    }
}