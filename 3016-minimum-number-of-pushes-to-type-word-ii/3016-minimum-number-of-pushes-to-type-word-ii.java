class Solution {
    public int minimumPushes(String word) {
        int[] check = new int[26];
        int index=0;
        int count =0;
        for(char c: word.toCharArray()){
            check[c-'a']++;
        }
        Arrays.sort(check);
        int i=25;
        while(i>=0){
            while(i>=0 && check[i]==0){
                i--;
            }
            if(i>=0){
                count += check[i]*(index/8+1);
            }
            index++;
            i--;
        }

        return count;
    }
}