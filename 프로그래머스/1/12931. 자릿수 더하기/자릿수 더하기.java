import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = n+"";
        for(int x=0;x< a.length();x++){
            String temp = a.charAt(x)+"";
            answer += Integer.parseInt(temp);  
        }        

        return answer;
    }
}