class Solution {
    public int romanToInt(String s) {
        int prev = 0;
        int sum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int i=0;
        prev = map.get(s.charAt(i));
        sum += prev;
        i=1;

        while(i<s.length()){
            if(map.get(s.charAt(i))>prev){
                sum -= prev;
                sum += map.get(s.charAt(i))-prev;
            }
            else{
                sum+=map.get(s.charAt(i));
            }
            prev = map.get(s.charAt(i));
            i++;
        }

        return sum;
    }
}