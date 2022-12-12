package level1;

public class Problem82612 {
	public static void main(String args[]) {

		System.out.println(solution(3, 40, 4));

	}

	public static long solution(int price, int money, int count) {
		long answer = count/2 * (price + price * count)- money;
		return answer< 0 ? 0:answer;
	}
}
