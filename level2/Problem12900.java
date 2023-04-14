package level2;

public class Problem12900 {
	int dp[]=new int[60001];
    public int solution(int n) {
        if(n==2 || n==3){
            dp[2]=2; dp[3]=3;
            return dp[n];
        }
        else{
            if(dp[n]==0){
                return dp[n] = (solution(n-1)+solution(n-2))%1000000007;
            }else{
                return dp[n];
            }
        }
    }
}
