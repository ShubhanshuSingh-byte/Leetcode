class Solution {
    public int[] validSequence(String word1, String word2) {
        int[] last = new int[word2.length()];
        Arrays.fill(last, -1);

        for(int i=word1.length()-1, j=word2.length()-1; i>=0 && j>=0; i--){
            if(word1.charAt(i)==word2.charAt(j)){
                last[j]=i;
                j--;
            }
        }

        boolean change=true;
        int[] ans = new int[word2.length()];

        for(int i=0, j=0; i<word1.length(); i++){
            if(word1.charAt(i)==word2.charAt(j)){
                ans[j++] = i;
            }
            else if(change && (j==word2.length()-1 || i<last[j+1])){
                ans[j++] = i;
                change = false;
            }

            if(j==word2.length()){
                return ans;
            }
        }

        return new int[]{};
    }
}