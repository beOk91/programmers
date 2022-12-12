package level0;

public class Problem120817 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
	}

	public static double solution(int[] numbers) {
		double answer = 0;
		for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}
		return answer / numbers.length;
	}
}
