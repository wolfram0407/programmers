class Solution {    
    public double solution(int[] numbers) { 
        double answer = 0;
        int length = numbers.length;
        for(int a=0;a<length;a++){
            answer+=numbers[a];
        }
        return  answer / length ;
}}