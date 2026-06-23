class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        if(n==1)return 0;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        int lsum =0;
        int rsum =0;
        for(int i=0; i<n; i++){
            if(i==0){
                lsum =0;
            }else{
                lsum = prefix[i-1];
            }

            if(i==n-1){
                rsum =0;
            }else rsum = prefix[n-1] - prefix[i];
            
            if(lsum == rsum){
                return i;
            }

        }
        return -1;
    }
}