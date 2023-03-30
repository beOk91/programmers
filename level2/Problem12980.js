function solution(n){
    let result =new Array(n+1).fill(0);
    result[1]= 1;
    for(let i=1;i<n;i++){
        result[i+1]=result[i+1]== 0 ? result[i]+1 : Math.min(result[i]+1,result[i+1]);
        for(let j=i*2;j<=n;j=j*2){
            result[j]= result[j]== 0 ? result[i] : Math.min(result[j],result[i]);
        }
    }
    return result[n];
}

function solution2(n){
    let result=0;
    while(n!=0){
        result+=n%2 == 0 ? 0:1;
        n=Math.floor(n/2);
    }
    return result;
}