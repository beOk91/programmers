package level0;

public class Problem120871 {
	public int solution(int n) {
        int answer = 0;
        int idx=0;
        while(answer!=n){
            idx++;
            if(idx%3==0 || idx%10==3 || idx/10==3 || idx%100/10==3) {
                continue;
            }else{
                answer++;
            }
        }
        return idx;
    }
	public int solution2(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            answer++;
            while(answer%3==0 || String.valueOf(answer).contains("3")){
                answer++;
            }
        }
        return answer;
    }
}
