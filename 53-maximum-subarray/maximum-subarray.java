class Solution {
    public int maxSubArray(int[] nums) {
        int currentValue = 0;
        int MAX_VALUE = Integer.MIN_VALUE;
        int temp;
        for(int i=0;i<=nums.length-1;i++){
            temp = currentValue + nums[i];
            if(temp<nums[i]){
                currentValue = nums[i];

            }
            else{
                currentValue = temp; 
            }
            if(MAX_VALUE< currentValue){
                MAX_VALUE = currentValue;
            }
            
        }
        return MAX_VALUE;

    }
}