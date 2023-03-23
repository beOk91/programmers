function solution(k, m, score) {
    var answer = 0;
    score.sort((a,b)=>b-a);
    for(let i=0;i<=score.length-m;i+=m){
        let box = score.slice(i, i+m);
        answer+=box[m-1]*m;
    }
    return answer;
}