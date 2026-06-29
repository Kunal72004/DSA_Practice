class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0; 
        int j=n-1;
        int ans =0;
        while(i<j){
            int h= Math.min(height[i],height[j]);
            int w = j-i;
            ans = Math.max(ans,w*h);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return ans;
        
    }
}