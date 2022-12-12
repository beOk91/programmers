package level0;

public class Problem120819 {
	public int[] solution(int money) {
        int[] answer = {};
        return new int[]{money/5500, money-5500*(money/5500)};
    }
}
