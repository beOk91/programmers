function solution1(n,a,b){
    let answer = 0;
    let list = [...new Array(n+1).keys()].slice(1);
    while(list.length>1){
        let temp=[];
        answer++;
        for(let i=0;i<list.length/2;i++){
            let element =[];
            element.push(list[i*2]==a ? a : list[i*2]==b ? b: -1);
            element.push(list[i*2+1]==a ? a : list[i*2+1]==b ? b: -1);
            
            if(element.includes(a) && element.includes(b)) return answer;
            temp.push(element.includes(a) ? a: element.includes(b) ? b:-1);
            
        }
        list=temp;
    }
    
    return answer;
}

function solution2(n,a,b){
    let answer = 0;
    while(a!=b){
        a=Math.ceil(a/2);
        b=Math.ceil(b/2);
        answer++;
    }
    return answer;
}