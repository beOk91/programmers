function solution(quiz) {
    var answer = [];
    for(let i=0;i<quiz.length;i++){
        let temp = quiz[i].split(' ');
        let flag = false;
        if(temp[1]=== '+'){
            flag = parseInt(temp[0])+parseInt(temp[2]) == temp[4] ? true : false;
        }else{
            flag = parseInt(temp[0])-parseInt(temp[2]) == temp[4] ? true : false;
        }
        answer.push(flag ? 'O' : 'X');
    }
    return answer;
}