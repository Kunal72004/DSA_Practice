class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        ArrayList<Pair> list = new ArrayList<>();
        for(int[] trip :trips){
            int noPass = trip[0];
            int from = trip[1];
            int to = trip[2];
            list.add(new Pair(from,noPass));
            list.add(new Pair(to,-noPass));
        }

        Collections.sort(list,(a,b)->{
            if(a.first == b.first){
                return a.second - b.second;
            }
            return a.first-b.first;
        });
        
        int pass =0;
        for(Pair pair : list){
            pass += pair.second;
            if(pass> capacity){
                return false;
                
            }
        }
        return true;
    }
}