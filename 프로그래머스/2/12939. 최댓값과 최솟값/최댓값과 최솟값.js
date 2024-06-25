function solution(s) {
    const arr = s.split(" ")
 
    let max = -Number.MAX_SAFE_INTEGER;
    let min = Number.MAX_SAFE_INTEGER;
    arr.map((i)=>{
        if(max < Number(i) ){
            max =  Number(i) 
        }
        if( min >  Number(i) ){
            min =  Number(i);   
        }
    })
    var answer = min+' '+max;
    return answer;
}