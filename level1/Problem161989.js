function solution(n, m, section) {
    let result=0;
    let nArr = new Array(n).fill(1);
    for(let i=0;i<section.length;i++){
        nArr[section[i]-1]=0;
    }
    let l_idx = section[0]-1;
    while(nArr.includes(0) && l_idx<n){
        for(let i=l_idx;i<l_idx+m;i++){
            if(nArr[i]==0) nArr[i]=1;
        }
        result++;
        while(nArr[l_idx]==1){l_idx++;}
    }
    return result;
}