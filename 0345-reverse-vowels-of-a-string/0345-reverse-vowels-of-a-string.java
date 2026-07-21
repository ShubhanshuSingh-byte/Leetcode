class Solution {
    public String reverseVowels(String s) {
        int l=0, r=s.length()-1;
        char[] str = s.toCharArray();
        List<Character> vowels = new ArrayList<>(List.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));

        while(l<r){
            while(l<r && !vowels.contains(str[l])) l++;
            while(l<r && !vowels.contains(str[r])) r--;

            char temp = str[r];
            str[r] = str[l];
            str[l] = temp;

            l++;
            r--;
        }
        return new String(str);
    }
}