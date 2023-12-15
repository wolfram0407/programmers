import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int k = arr.length;
        int[] arr2 = new int[arr.length];
        int start = 11; 
        int end = 11; 
        
        for(int a=0; a< k; a++){
            if(arr[a]==2){
                if(start==11){
                    start= a;
                }    
                end = a;
            }
        }
        int[] arr1 = new int[end-start+1];
        System.out.println(end);
        if(start==11){
            int[] answer = {-1};
            return answer;
        }
 
        System.arraycopy(arr,start,arr1,0,end-start+1);
        return arr1;
    }
}