function solution(seoul) {
    console.log(seoul)
        var answer ='김서방은 ';
    seoul.map((x,i)=>{
         if(x==="Kim") 
            answer += i;        
    })
    
    return answer+'에 있다';
}