function solution(X, Y) {
    let answer = '';
    for(let i=0;i<10;i++){
        let x_cnt = X.length-X.replaceAll(i,'').length;
        let y_cnt = Y.length-Y.replaceAll(i,'').length;
        for(let j=0;j<Math.min(x_cnt, y_cnt);j++){
            answer+=i;
        }
    }
    answer =answer.split('').sort((a,b)=>b-a).join('');
    return answer=='' ? '-1' : answer[0]=='0' ? '0' : answer;
}