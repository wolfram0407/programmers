class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2==0){
            for(int a=n;a>0;a-=2){
                answer += a*a; 
            }
        }else{
              for(int a=n;a>0;a-=2){
                answer += a; 
            }
        }
        return answer;
    }
}