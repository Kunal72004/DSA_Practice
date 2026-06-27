class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int zeroCount =0;
        int productWithoutZero = 1;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                zeroCount++;
            }else{
                productWithoutZero *= nums[i];
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] !=0){
                if(zeroCount>0){
                    ans[i] = 0;
                }else{
                    ans[i] = productWithoutZero/nums[i];
                }
            }else{
                if(zeroCount>1){
                    ans[i] = 0;
                }else{
                    ans[i] = productWithoutZero;
                }
            }
        }
        
        return ans;
    }
}