package level2;

public class Problem140108 {
	public static void main(String[] args) {
		System.out.println(solution("banana"));
	}

	public static int solution(String s) {
		int answer = 0;
		while (!s.isBlank()) {
			System.out.println(s);
			int t1 = 0, t2 = 0;
			for (int p = 0; p < s.length(); p++) {
				if (s.charAt(0) == s.charAt(p))
					++t1;
				else {++t2; }
				if (t1 == t2) {
					s = s.substring(p+1);
					answer++;
					break;
				}
			}
			if(t1!=t2) break;
		}
		return answer;
	}
}
