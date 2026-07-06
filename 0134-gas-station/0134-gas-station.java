class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalKharch = 0;
        int totalKamai = 0;
        for(int i=0; i<n; i++){
            totalKharch += cost[i];
            totalKamai += gas[i];
        }

        if(totalKharch>totalKamai)return -1;

        int total =0;
        int res =0;
        for(int i=0; i<n; i++){
            total = total + gas[i]-cost[i];
            if(total<0){
                total =0;
                res=i+1;
            }
        }
        return res;
    }
}