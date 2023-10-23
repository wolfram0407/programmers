class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = arr;
        if(k%2==0){
            for(int t=0;t<answer.length;t++){
                answer[t] += k;
            }
          
        }else{
              for(int t=0;t<arr.length ;t++){
                answer[t] *= k;
            }
        }
        return answer;
    }
}