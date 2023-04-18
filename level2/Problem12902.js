function solution(n){
    let dp=[1,0,3,0];
    if(n<=2) return dp[n];
    if(n%2==1) return dp[n]=0;
    for(let i=4;i<=n;i=i+2){
        let result = dp[i-2]*3;
        for(let j=i-4;j>=0;j=j-2){
            result+=dp[j]*2;
        }
        dp[i]=result%1000000007;
    }
    return dp[n];
}

/*
let dp=[1,0,3,0,11];
function solution(n) {
    if(dp[n]==undefined){
        let result=0;
        if(n%2==0){
            result=solution(n-2)*3;
            for(let i=2;i<=n/2;i++){
                result+=(solution(n-(i*2))*2);
            }
            return dp[n]=result%1000000007;
        }
        return dp[n]=0;
    }
    return dp[n];
}*/