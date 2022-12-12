package level2;

public class Problem70129 {
	public static void main(String args[]) {
		System.out.println(solution("110010101001"));
	}

	public static int[] solution(String s) {
		int[] answer = new int[2];
		while (!s.equals("1")) {
			answer[0]++;
			int temp = s.length();
			s = s.replaceAll("0", "");
			answer[1] += temp - s.length();
			s = Integer.toBinaryString(s.length()) + "";
		}
		return answer;
	}
}
