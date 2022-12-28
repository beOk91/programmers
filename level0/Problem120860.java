package level0;

public class Problem120860 {
	public int solution(int[][] dots) {
        return (dots[0][0]-dots[1][0] !=0 ? Math.abs(dots[0][0]-dots[1][0]) : dots[0][0]-dots[2][0] !=0 ? Math.abs(dots[0][0]-dots[2][0]) : Math.abs(dots[0][0]-dots[3][0])) * (dots[0][1] - dots[1][1] !=0 ? Math.abs(dots[0][1] - dots[1][1]) : dots[0][1] - dots[2][1]!=0 ? Math.abs(dots[0][1] - dots[2][1]) : Math.abs(dots[0][1] - dots[3][1]));
    }
}
