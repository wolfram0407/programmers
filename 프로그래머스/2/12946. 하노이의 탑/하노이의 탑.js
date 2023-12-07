function solution(n) {
    var answer = [];
    const hanoi = (k, start,other, target)=>{
        if(k==1){
           answer.push([start,target])
        }else{
            hanoi(k-1,start,target,other);
            answer.push([start,target])
            hanoi(k-1,other,start,target)
        }
    }

    hanoi(n,1,2,3)
    return answer;
}
