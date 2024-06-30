function solution(num) {
    var answer = 0;
    while(true){
        if(num===1)
            break;
        answer ++;
        num = num %2===0 ? num /2 : num*3 +1;
        
        if(num===1)
            break;
        if(answer === 500){
            answer = -1
            break;
        }

            
    }
    return answer;
}