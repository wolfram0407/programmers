class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int length = arr.length;
        for(int a=0;a<length;a++){
            answer += arr[a];
        }
        
        return answer/length;
    }
}