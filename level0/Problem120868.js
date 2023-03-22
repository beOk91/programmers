function solution(sides) {
    var answer = 0;
    for(let i=0;i<sides[0]+sides[1];i++){
        let max_length = Math.max(Math.max(sides[0],sides[1]),i);
        if(sides[0]+sides[1]+i-max_length>max_length) answer++;
    }
    return answer;
}