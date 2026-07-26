class Solution {
    public int maximumProduct(int[] nums) {
        int a=-1001, b=-1001, c=-1001;
        int e=1001, f=1001;

        for( int num : nums ){
            if(num>a){
                c=b;
                b=a;
                a=num;
            }
            else if(num>b){
                c=b;
                b=num;
            }
            else if(num>c){
                c=num;
            }
        }
        for( int num : nums ){
            if(num<e){
                f=e;
                e=num;
            }
            else if(num<f){
                f=num;
            }
        } 
        return Math.max(a*b*c, a*e*f);
    }
}