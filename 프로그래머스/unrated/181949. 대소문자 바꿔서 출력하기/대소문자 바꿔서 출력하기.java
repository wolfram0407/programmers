import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String test = "";
        for(int b=0;b< a.length();b++){
            int temp = a.charAt(b);
            if(temp<97){
                temp = temp+32;
            }else if(temp >= 97 ){
                temp = temp -32;
            }
            test = test + (char)temp;
        }
        System.out.print(test);
        
    }
}