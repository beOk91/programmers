function solution(today, terms, privacies) {
    let answer = [];
    let t=[];
    for(let i=0;i<terms.length;i++){
    let temp = terms[i].split(' ');
        t[temp[0]] = temp[1];
    }
    
    for(let i=0;i<privacies.length;i++){
        let p = privacies[i].split(' ');
        let term = t[p[1]];
        let privacy = new Date(p[0]);
        privacy = new Date(privacy.setMonth(privacy.getMonth()+parseInt(term)));

    if(new Date(today)-privacy>=0) answer.push(i+1);   
    }
    return answer;
}