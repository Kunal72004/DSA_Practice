class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int resIdx = 0;
        int count =1;

        for(int i=1; i<n; i++){
            if(nums[resIdx] == nums[i]){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                resIdx = i;
                count++;
            }
        }
        return nums[resIdx];
    }
}