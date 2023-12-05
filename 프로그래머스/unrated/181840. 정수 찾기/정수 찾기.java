class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int a = 0; a<num_list.length;a++){
            if(n==num_list[a]){
                answer= 1;
                break;
            }
        }
        return answer;
    }
}