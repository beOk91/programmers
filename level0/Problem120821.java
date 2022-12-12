package level0;

public class Problem120821 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 4, 5 }));
	}

	public static int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		for (int i = 0; i < num_list.length; i++) {
			answer[num_list.length - i-1] = num_list[i];
		}
		return answer;
	}
}
