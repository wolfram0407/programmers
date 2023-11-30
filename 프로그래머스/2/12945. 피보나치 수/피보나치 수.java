class Solution {
    public int solution(int x) {     
        int []  n = new int[x];
        for(int a=0;a<n.length;a++){
            if(a<=2){
                n[a] = a;
                continue;
            }
            n[a] = (n[a-1] + n[a-2])%1234567;
        }
        
        return n[x-1];
    }
}