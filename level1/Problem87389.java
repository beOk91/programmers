package level1;

public class Problem87389 {

	public int solution(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 1)
				return i;
		}
		return 0;
	}
}
