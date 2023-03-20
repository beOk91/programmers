function solution(n, k) {
    var answer = 0;
    let result = '';
    while(n>=1){
        result=n%k+result;
        n=Math.floor(n/k);
    }
    let arr = result.split('0');
    while(-1!=arr.indexOf('1')){
        arr.splice(arr.indexOf('1'),1);
    }
    while(-1!=arr.indexOf('')){
        arr.splice(arr.indexOf(''),1);
    }
    for(let i=0;i<arr.length;i++){
        if(arr[i]==2) answer++;
        else{
            let temp=0;
            for(let j=2;j<=Math.sqrt(arr[i]);j++){
                if(arr[i]%j==0) temp++;
            }
            if(temp==0) answer++;
        }
    }
    return answer;
}