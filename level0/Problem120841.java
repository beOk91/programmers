package level0;

public class Problem120841 {
	public int solution(int[] dot) {
		return dot[0]>0 && dot[1]>0 ? 1:dot[0]<0 && dot[1]>0 ? 2: dot[0]>0 && dot[1]<0 ? 4 : 3;	}
}
