function solution(s_num, e_num) {
    var answer = [];
    let a = e_num - s_num +1
    for(let x =0 ; x<a;x++){
        answer.push(s_num++)
    }
    return answer;
}