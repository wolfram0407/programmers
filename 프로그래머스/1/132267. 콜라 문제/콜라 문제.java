class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(a<=n){
            System.out.println(answer);
            int x = (n/a)*b;
            int y = n%a;
            answer += x;
            n = x+y;
        }
        
        return answer;
    }
}