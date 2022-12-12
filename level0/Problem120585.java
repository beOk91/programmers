package level0;

public class Problem120585 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 149, 180, 192, 170 }, 167));
	}

	public static int solution(int[] array, int height) {
		int answer = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>height) { answer++; }
		}
		return answer;
	}
}
