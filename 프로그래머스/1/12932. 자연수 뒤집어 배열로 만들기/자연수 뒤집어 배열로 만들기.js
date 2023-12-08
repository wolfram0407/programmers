function solution(n) {
    
    var answer = [];
    const temp = [...n.toString()];
    temp.reverse()
    temp.map((i) =>answer.push(Number(i)))
    

    return answer;
}