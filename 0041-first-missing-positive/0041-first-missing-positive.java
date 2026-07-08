class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int i=1; i<n; i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        HashSet<Integer> set= new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }

        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return max+1;
    }
}