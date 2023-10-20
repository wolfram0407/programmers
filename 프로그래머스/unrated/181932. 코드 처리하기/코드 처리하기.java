class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        int size = code.length()-1;
      
        for(int a = 0; a<=size;a++){
            if(mode==0){
                if(code.charAt(a)!='1'){
                    if(a%2==0)
                        ret+=code.charAt(a);
                }else{
                    mode =  1;
                }
            }else{
                if(code.charAt(a)!='1'){
                    if(a%2!=0)
                        ret+=code.charAt(a);
                }else{
                    mode  = 0;
                }
            }
        }
        if(ret.equals("")){
            ret = "EMPTY";
        }
        return ret;
    }
}