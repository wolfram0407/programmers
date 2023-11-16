
function solution(n) {
    let temp = "";
    let answer =0;
    while(n>0){
        temp =  n%3 +temp;
        n = parseInt(n /3);
    }
    for( let a in temp){
        answer += temp[a] * Math.pow(3,a);
    }
    return answer;
}

/*
function solution(n) {
    let answer = 0;
    let test = Array.from(n.toString(3));
    for( let a in test){
        answer += test[a] * Math.pow(3,a);
    }
    return answer;
}
*/
