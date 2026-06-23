class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] diff = new int[2051];
        for(int[] log : logs){
            int birth = log[0];
            int death = log[1];

            diff[birth] += 1;
            diff[death] -= 1;
        }

        int curPop = 0;
        int maxPop = 0;
        int year = 0;

        for(int i=0; i<2050; i++){
            curPop += diff[i];
            if(curPop>maxPop){
                maxPop = curPop;
                year = i;
            }
        }
        return year;
    }
}