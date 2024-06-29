function solution(a, b) {
    const k = a >= b ? a : b ;
    let l = a < b ? a : b ;
    var answer = 0;
     for( ;l<=k;l++ ){
         answer += l;
     }
    return answer;
}