function solution(s){
    var answer = true;
    const temp = s.split("");
    const arr1 = [];
    const arr2 = [];
    temp.map((d,i)=>{
        if(d==='\(')
            arr1.push(i);
        if(d==='\)')
            arr2.push(i);
        
        if(arr1.length < arr2.length){
            answer = false; 
        }
        
        
    })
    if(!answer)
        return  false;
    
    return arr1.length=== arr2.length;
}
