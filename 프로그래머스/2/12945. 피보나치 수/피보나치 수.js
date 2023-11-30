function solution(x) {
    var answer = 0;
    let n = [];
    for(let a=0;a<x;a++){
        if(a<=2){
            n.push(a);
            continue;
        }
    n.push((n[a-1] + n[a-2])%1234567)
    }
        
    return n[x-1];
}
