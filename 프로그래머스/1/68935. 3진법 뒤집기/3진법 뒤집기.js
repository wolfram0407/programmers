
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
    let num = n.toString(3);
    for( let a in num){
         answer += num[a] * Math.pow(3,a);
    }
    return answer;
}
*/
