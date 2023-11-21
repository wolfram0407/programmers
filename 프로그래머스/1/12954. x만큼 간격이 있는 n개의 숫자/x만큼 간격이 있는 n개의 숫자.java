class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for(int a=1;a<n;a++){
            answer[a] = answer[a-1] + x;
        }
        return answer;
    }
}