class Solution {
    public boolean checkDivisibility(int n) {
        int product = 1;
        int sum=0;
        int a=n;

        while(n>0){
            product *= n%10;
            sum += n%10;
            n/=10;
        }
        return a%(sum+product)==0;
    }
}