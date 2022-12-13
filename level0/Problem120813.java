package level0;

public class Problem120813 {
	public int[] solution(int n) {
        int[] answer = new int[n%2==0 ? n/2:n/2+1];
        int j=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0) answer[j++]=i;
        }
        return answer;
    }
}
