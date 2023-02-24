package level0;

public class Problem120846 {
	public int solution(int n) {
        int answer = 0;
        for(int i=2;i<=n;i++){
            int temp=0;
            for(int j=i;j>=1;j--){
                if (i%j==0) { temp++; 
                    if(temp>2) {
                        answer++;
                        break;
                    }}
            }
            temp=0;
        }
        return answer;
    }
}
