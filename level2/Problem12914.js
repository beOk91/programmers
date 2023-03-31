let dp=[1,2];
function solution(n) {
    if(dp[n-1] ==undefined) 
        return dp[n-1]=(solution(n-2)+solution(n-1))%1234567;
    else{
        return dp[n-1];
    }
}