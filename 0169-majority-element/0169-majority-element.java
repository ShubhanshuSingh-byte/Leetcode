class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int occurence = 0;

        for(int i: nums){
            if(occurence==0){
                majority = i;
                occurence +=1;
            }
            else if(i==majority){
                occurence++;
            }
            else{
                occurence--;
            }
        }
        return majority;
    }
}