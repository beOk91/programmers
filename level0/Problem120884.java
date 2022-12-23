package level0;

public class Problem120884 {
	public int solution(int chicken) {
        int answer = 0;
        while(chicken>=10){
            answer+=chicken/10;
            chicken = chicken%10 + chicken/10;
        }
        return answer;
    }
}
