class Solution {
    public int solution(int n) {
        String temp = "";
        while(n>0){
            temp =  n%3 +temp;
            n /= 3;
        }
        int answer =0;
        for(int x =0 ; x<temp.length();x++){
            String y ="";
            y+=temp.charAt(x);
            int b = Integer.parseInt(y);
   
            if(b!=0){
                if(x==0){
                    answer+= b;
                }else{
                    answer+= Math.pow(3, x) *b;
                }
            }
        }
   
        return answer;
    }
}