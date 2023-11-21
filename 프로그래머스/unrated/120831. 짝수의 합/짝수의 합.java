class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int a=0;a<=n;a+=2){
            answer += a;
        }
        return answer;
    }
}