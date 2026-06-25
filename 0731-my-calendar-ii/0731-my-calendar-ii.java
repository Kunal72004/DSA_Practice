class MyCalendarTwo {
    class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
        }
    }
    ArrayList<Pair> list;

    public MyCalendarTwo() {
        list = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        Pair start = new Pair(startTime,1);
        Pair end = new Pair(endTime,-1);
        list.add(start);
        list.add(end);

        Collections.sort(list,(a,b)->{
            if(a.first == b.first){
                return a.second - b.second;
            }
            return a.first-b.first;
        });

        int book =0;
        for(Pair pair: list ){
            book += pair.second;
            if(book>2){
                list.remove(start);
                list.remove(end);
                return false;
            }
        }
        return true;



    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */