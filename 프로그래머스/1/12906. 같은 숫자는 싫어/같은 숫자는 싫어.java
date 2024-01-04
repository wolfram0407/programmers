import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int count = 1;

        for(int a=1;a<arr.length;a++){
            if(arr[a-1] != arr[a])
                count++;
        }

        int[] answer = new int [count];               
        int position =0;
        for(int a =0 ;a<arr.length;a++){
            if(a==0){
                answer[position] = arr[a];
                position++;
                continue;
            }
            if(arr[a-1] != arr[a]){
                answer[position] = arr[a];
                position++;
                continue;
            }
        }
        
        return answer;
    }
}