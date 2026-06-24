class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] prefix= new int[n];

        prefix[0] = nums[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        int leftSum = 0; 
        int rightSum =0;
        for(int i=0; i<n; i++){
            if(i==0){
                leftSum =0;
            }else{
                leftSum = prefix[i-1];
            }

            if(i==n-1){
                rightSum =0;
            }else{
                rightSum = prefix[n-1] - prefix[i];
            }

            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}