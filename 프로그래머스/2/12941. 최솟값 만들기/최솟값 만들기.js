function solution(A,B){
    var answer = 0;

    const x = A.sort((a,b)=>a-b)
    const y = B.sort((a,b)=>a-b)

    x.map((a,i)=>{
        answer += a*y[x.length - i -1 ]; 
 
    })
    return answer;
}