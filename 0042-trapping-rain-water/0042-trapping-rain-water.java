class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i=0;
        int j=n-1;

        int leftMax = 0;
        int rightMax = 0;
        int water =0;
        while(i<j){
            leftMax = Math.max(height[i],leftMax);
            rightMax = Math.max(height[j],rightMax);

            if(leftMax<rightMax){
                water += (leftMax-height[i]);
                i++;
            }else{
                water += (rightMax-height[j]);
                j--;
            }
        }
        return water;
    }
}