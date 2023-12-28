class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int [] oneDayTimes = new int [1440];
        
            for( String [] book : book_time){
                int start = toTime(book[0]);
                int end =  Math.min(1439,toTime(book[1])+10);
                for( int a=start; a<end; a++){
                    oneDayTimes[a] ++;
                }
            }
        
            for(int a=0;a<oneDayTimes.length;a++){
                answer = Math.max(answer, oneDayTimes[a]);
            }       
            
            return answer;
    }
    public int toTime (String hourTime){
        String[] minTime = hourTime.split(":");
        
        return Integer.parseInt(minTime[0]) * 60 + Integer.parseInt(minTime[1]);
    }
}