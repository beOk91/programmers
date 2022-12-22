package level0;

public class Problem120815 {
	public int solution(int n) {
        int answer=1;
        while(true){
            if (answer*6%n==0)
                break;
            answer++;
        }
        return answer;
    }
}
