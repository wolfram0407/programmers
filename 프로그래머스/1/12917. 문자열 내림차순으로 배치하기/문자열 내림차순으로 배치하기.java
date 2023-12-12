import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        
        for(int a=arr.length-1; a>=0;a--){
            answer += arr[a];
        }
         
        return answer;
    }
}