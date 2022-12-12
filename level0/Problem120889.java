package level0;

public class Problem120889 {
	public int solution(int[] sides) {
        int maxVal = Math.max(Math.max(sides[0],sides[1]),sides[2]);
        return sides[0]+sides[1]+sides[2]-maxVal <=maxVal ? 2:1;
    }
}
