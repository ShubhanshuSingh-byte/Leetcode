class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i: nums){
            if(i<min) min=i;
            if(i>max) max=i;
        }

        boolean[] bool = new boolean[max-min+1];

        for(int i=0; i<nums.length; i++){

            bool[nums[i]-min] = true;
        }

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<bool.length; i++){
            if(!bool[i]){
                list.add(min+i);
            } 
        }

        return list;
    }
}