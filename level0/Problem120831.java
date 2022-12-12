package level0;

public class Problem120831 {
	public static void main(String[] args) {

	}
	public static int solution(int n) {
		int answer = 0;
		for (int i = 2; i <= n; i = i + 2) {
			answer += i;
		}
		return answer;
	}
}
