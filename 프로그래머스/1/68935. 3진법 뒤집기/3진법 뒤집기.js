function solution(n) {
    let answer = 0;
    let test = Array.from(n.toString(3));
    for( let a in test){
        answer += test[a] * Math.pow(3,a);
    }
    return answer;
}