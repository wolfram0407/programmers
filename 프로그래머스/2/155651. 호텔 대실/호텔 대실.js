function solution(book_time) {
    var answer = 0;
    const oneDayTimes = [];
    for(let c = 0; c<1440;c++){
        oneDayTimes.push(0)
    }
    for(let book of book_time){
        const  start = toTime(book[0]);
        const  end =  Math.min(1439,toTime(book[1])+10);
        for( let a=start; a<end; a++){
            oneDayTimes[a] ++;
        }
    }
    for(let b=0;b<oneDayTimes.length;b++){
        answer = Math.max(answer, oneDayTimes[b]);
    }       
    return answer;
}

function toTime ( hourTime){
    const minTime = hourTime.split(":");
    const time = parseInt(minTime[0]) * 60 + parseInt(minTime[1]);
    return time;
}