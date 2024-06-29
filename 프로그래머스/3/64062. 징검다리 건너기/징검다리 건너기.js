function solution(stones, k) {
    let left=1;
    let right=200000000;

    while(left<=right){
        const mid=parseInt((left+right)/2);
        let count =0
        for(let a=0; a<stones.length;a++) {
            if(stones[a]-mid<=0) 
                count++;
            else 
                count = 0;
            if(count === k) 
                break;
        }
        if
            (count===k) right=mid-1;
        else 
            left=mid+1;
    }
    return left;
}