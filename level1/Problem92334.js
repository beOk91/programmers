function solution(id_list, report, k) {
    var answer = new Array(id_list.length).fill(0);
    let id_idx ={};
    for(let i=0;i<id_list.length;i++){
        id_idx[id_list[i]]=i;
    }
    const reportSet= new Set(report);
    let reportCnt ={};
    for(let item of reportSet){
    let [person, personReported]= item.split(' ');
        reportCnt[personReported] = reportCnt[personReported] ==undefined ? 1 : reportCnt[personReported]+1;
    }
    let temp=0;
    for(let item of reportSet){
        let p = item.split(' ');
        if(reportCnt[p[1]]>=k){
            answer[id_idx[p[0]]]+=1;
        }
    
    }
    return answer;
}