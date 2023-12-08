class Solution {
    public long solution(long n) {
        if((Math.sqrt(n)%1)==0){
            long a =(long) Math.sqrt(n);
            return (long)Math.pow(a+1,2);
        }
        return -1;
    }
}