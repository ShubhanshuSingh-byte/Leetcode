class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int half = n>>1;
        char[] arr = num.toCharArray();

        int l=0, r=0, diff=0;
        for(int i=0; i<n; i++){
            if(i<half){
                if(arr[i]=='?') l++;
                else diff += arr[i] - '0'; 
            }
            else{
                if(arr[i]=='?') r++;
                else diff -= arr[i] - '0'; 
            }
        }

        if((l+r)%2!=0){
            return true;
        }

        return diff != 9*(r-l) >> 1;
    }
}