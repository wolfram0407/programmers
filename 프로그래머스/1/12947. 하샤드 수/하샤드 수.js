function solution(x) {
    let a = x;
    let hap = 0;
    while(a >=1){
        hap += a%10;
        console.log(a);
        a = parseInt(a/10);
    }
    
     

    return x%hap===0 ? true : false;
}