function solution(k, score) {
    var answer = [];
    var temp = [];
    for(let i=0;i<score.length;i++){
        if(temp.length ==0){
            temp.push(score[i]);
        }else{
            for(let j=0;j<temp.length;j++){
                if(temp[j]>=score[i]){
                    temp.splice(j,0,score[i]);
                    break;
                }
                if(j==temp.length-1) {
                    temp.push(score[i]);
                    break;
                }
            }
            if(temp.length>k){
                temp.splice(0,1);
            }
        }
    answer.push(temp[0]);
    }
    return answer;
}

function solution2(k, score) {
    var answer = [];
    var temp =[];
    for(let i=0;i<score.length;i++){
        temp.push(score[i]);
        temp.sort((a,b)=>a-b);
        if(temp.length>k){
            temp.shift();   
        }
        answer.push(temp[0]);
    }
    return answer;
}