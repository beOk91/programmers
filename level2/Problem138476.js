function solution(k, tangerine) {
    var answer = 0;
    let t_cnt = new Array(tangerine.length).fill(0);
    tangerine.forEach((item)=>{t_cnt[item] = (t_cnt[item] == undefined ? 1: t_cnt[item]+1)});
    let t=[];
    for(key in t_cnt){
        t.push(t_cnt[key]);
    }
    t.sort((a,b)=>b-a);
    while(k>0){
        k-=t.shift();
        answer++;
    }
    return answer;
}