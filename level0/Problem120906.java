package level0;

public class Problem120906 {
	public int solution(int n) {
		int answer = 0,size=(n+"").length();
		for(int i=0;i<size;i++) {
			answer+=n%10;
			n/=10;
		}
        return answer;
    }
}
