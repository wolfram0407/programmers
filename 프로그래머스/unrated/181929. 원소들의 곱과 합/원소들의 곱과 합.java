class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mux =  1;
        int sum = 0;
        for(int a=0;a<num_list.length;a++){
            mux *= num_list[a];
            sum+= num_list[a];
        }
        answer = mux > sum*sum ? 0 : 1;
        return answer;
    }
}